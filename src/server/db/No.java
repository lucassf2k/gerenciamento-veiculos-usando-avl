package server.db;

import server.entities.Vehicle;

public class No {

	long chave;
	Vehicle valor;
	long alturaNo;
	No esq, dir;
	
	public No(Vehicle v) {
		
		this.setChave(v.getRenavam());
		this.setValor(v);
		this.setAlturaNo( 0);
		this.setEsq( null);
		this.setDir( null);
		
	}
	
	public long getChave() {
		return chave;
	}

	public void setChave(long chave) {
		this.chave = chave;
	}

	public Vehicle getValor() {
		return valor;
	}

	public void setValor(Vehicle valor) {
		this.valor = valor;
	}

	public long getAlturaNo() {
		return alturaNo;
	}

	public void setAlturaNo(long alturaNo) {
		this.alturaNo = alturaNo;
	}

	public No getEsq() {
		return esq;
	}

	public void setEsq(No esq) {
		this.esq = esq;
	}

	public No getDir() {
		return dir;
	}

	public void setDir(No dir) {
		this.dir = dir;
	}

	@Override
	public String toString() {
		return "Placa: " + this.valor.getLicencePlate() + 
		"; Modelo: " + this.valor.getName() + 
		"; Renavam: " + this.valor.getRenavam() + 
		"; Data de fabricação: " + this.valor.getManufacturingDate() + 
		"; Nome do condutor: " + this.valor.getDriver().getName() + 
		"; CPF do condutor " + this.valor.getDriver().getCpf();
	}
}
