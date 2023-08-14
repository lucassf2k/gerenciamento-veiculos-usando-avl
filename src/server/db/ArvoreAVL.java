package server.db;

import libs.FileController;
import server.entities.Vehicle;

public class ArvoreAVL {
	
	private No raiz;

	public ArvoreAVL() {
		this.setRaiz(null);
	}
	
	public No getRaiz() {
		return raiz;
	}

	public void setRaiz(No raiz) {
		this.raiz = raiz;
	}
	
	public void ordem() {
		this.ordem(getRaiz());
	}
	
	private void ordem(No a){
		if(a != null) {
			this.ordem(a.getEsq());
			System.out.println(a.toString());
			this.ordem(a.getDir());
		}

	}
	
	// pegar altura de um nó avl
	
	private long altura(No a) {
		
		if(a == null)
			return -1;
		return a.getAlturaNo();
	}
	
	private long maior(long a, long b) {
		
		return (a > b) ? a : b;

	}
	
	private long obterFB(No a) {
		
		if(a == null)
			return 0;

		return this.altura(a.getEsq()) - this.altura(a.getDir());
	}
	
	public void inserir(Vehicle v) {
		this.raiz = this.inserir(getRaiz(), v);
		String str = "Altura: " + this.raiz.getAlturaNo();
		FileController.Write("./src/server/logs/logs.txt", str);
	}
	
	private No inserir(No a, Vehicle v) {		
		if(a == null)
			return new No(v);

		if(v.getRenavam() < a.chave)
			a.esq = this.inserir(a.esq, v);
		
		else if(v.getRenavam() > a.chave)
			a.dir = this.inserir(a.dir, v);
		
		else
			return a;
		
		/*2. Atualiza altura do ancestral do nó inserido */
		
		a.alturaNo = 1 + 
				this.maior(this.altura(a.getEsq()), this.altura(a.getDir()));
		
		/*3. Obter FB */
		
		long fb = this.obterFB(a);
		long fbEsq = this.obterFB(a.getEsq());
		long fbDir = this.obterFB(a.getDir());
		
		
		if(fb > 1 && fbEsq >= 0)
			
			return this.rds(a);
		
		if(fb > 1 && fbEsq < 0) {
			
			 a.esq = this.res(a.esq);
			 return rds(a);
		}	 
			
		if(fb < -1 && fbDir <= 0)
			
			return this.res(a);
		
		if(fb < -1 && fbDir > 0) {
			
			a.dir = this.rds(a.dir);
			return res(a);
		}	
		
		return a;
	}
	
	private No res(No x) {
		
		No y = x.getDir();
		No z = y.getEsq();
		
		// executa rotação
		
		y.setEsq(x);
		x.setDir(z);
		
		x.alturaNo = 1 + this.maior(altura(x.getEsq()), altura(x.getDir()));
		y.alturaNo = 1 + this.maior(altura(y.getEsq()), altura(y.getDir()));

		String str = ";RES;";
		FileController.Write("./src/server/logs/logs.txt", str);
		return y;
	}
	
	private No rds(No y) {
		
		No x = y.getEsq();
		No z = x.getDir();
		
		// executa rotação
		
		x.setDir(y);
		y.setEsq(z);;
		
		y.alturaNo = 1 + this.maior(altura(y.getEsq()), altura(y.getDir()));
		x.alturaNo = 1 + this.maior(altura(x.getEsq()), altura(x.getDir()));
		FileController.Write("./src/server/logs/logs.txt", ";RDS;");
		return x;
	}

	/*
	 * Implementar a remoção de acordo com o código da prática 4
	 */
	public void remove(long v) {
		this.setRaiz(this.remove(this.getRaiz(), v));
		String str = "Altura: " + this.raiz.getAlturaNo();
		FileController.Write("./src/server/logs/logs.txt", str);
	}

	private No remove(No a, long v) {
		if (a == null) return a;
		if (v < a.getChave()) 
			a.setEsq(this.remove(a.getEsq(), v));
		else if (v > a.getChave())
			a.setDir(this.remove(a.getDir(), v));
		else {
			if (a.getEsq() == null && a.getDir() == null) 
				a = null;
			else if (a.getEsq() == null) {
				No tmp = a;
				a = tmp.getDir();
				tmp = null;
			} else if (a.getDir() == null) {
				No tmp = a;
				a = tmp.getEsq();
				tmp = null;
			} else {
				No tmp = menorChave(a.getDir());
				a.setChave(tmp.getChave());
				tmp.setChave(v);
				a.setDir(this.remove(a.getDir(), v));
			}
		}
		if (a == null) return a;
		a.setAlturaNo(1 + this.maior(this.altura(a.getEsq()), this.altura(a.getDir())));
		long fb = this.obterFB(a);
		long fbSubArvEsq = this.obterFB(a.getEsq());
		long fbSubArvDir = this.obterFB(a.getDir());
		if (fb > 1 && fbSubArvEsq >= 0) return this.rds(a);
		if (fb < -1 && fbSubArvDir <= 0) return this.res(a);
		if (fb > 1 && fbSubArvEsq < 0) {
			a.setEsq(this.res(a.getEsq()));
			return this.rds(a);
		}
		if (fb < -1 && fbSubArvDir > 0) {
			a.setDir(this.rds(a.getDir()));
			return this.res(a);
		}
		return a;
	}

	private No menorChave(No a) {
		No tmp = a;
		if (tmp == null) return null;
		while (tmp.getEsq() != null) {
			tmp = tmp.esq;
		}
		return tmp;
	}

	public int contarNos() {
		return this.contarNos(this.getRaiz());
	}

	private int contarNos(No r) {
			if (r == null) return 0;
			return 1 + this.contarNos(r.getEsq()) + this.contarNos(r.getDir());
	}

	public No search(long renavam) {
		return this.search(this.getRaiz(), renavam);
	}

	private No search(No r, long k) {
		if (r == null) return null;
		if (r.getChave() > k) return this.search(r.getEsq(), k);
		if (r.getChave() < k) return this.search(r.getDir(), k);
		return r;
	}
}
