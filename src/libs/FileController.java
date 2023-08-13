package libs;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

public class FileController {
 public static List<String> Read(String Caminho){
     try {
         FileReader arq = new FileReader(Caminho);
         BufferedReader lerArq = new BufferedReader(arq);
         String conteudo = "";
            String linha="";
            List<String> list = new ArrayList<String>();
            try {
                linha = lerArq.readLine();
                while(linha!=null){
                    conteudo += linha+"\n";
                    linha = lerArq.readLine();
                    list.add(linha);
                }
                arq.close();
                return list;
            } catch (IOException ex) {
                System.out.println("Erro: Não foi possível ler o arquivo!");
                return null;
            }
        } catch (FileNotFoundException ex) {
            System.out.println("Erro: Arquivo não encontrado!");
            return null;
        }
    }
    
    public static boolean Write(String Caminho,String Texto){
        try {
            FileWriter arq = new FileWriter(Caminho, true);
            PrintWriter gravarArq = new PrintWriter(arq);
            gravarArq.println(Texto);
            gravarArq.close();
            return true;
        } catch (IOException e) {
            System.out.println(e.getMessage());
            return false;
        }
    }
}
