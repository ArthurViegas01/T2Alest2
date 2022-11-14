package Trabalho2;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class App {
    public static void main(String args[]) throws IOException{

        String arquivo = "Trabalho2/casoleonardo10.txt";
        BufferedReader BR = new BufferedReader(new FileReader(arquivo));

        ArrayList<Sabor> ListaSabor = new ArrayList<>();
        

        String linha = "";
        int idAtual = 0;
        
        
        while(linha != null){

            String[] leitura = linha.split(";");



            System.out.println(leitura[0]);
            
            for(int i = 0; i < leitura.length;i++){
                if (!ListaSabor.contains(leitura[i])){
                    
                    Sabor sabor = new Sabor(leitura[i], idAtual);
                    ListaSabor.add(sabor);
                    idAtual++;
                }
            }
            linha = BR.readLine();
        }

        for(int i = 0; i < ListaSabor.size(); i++){
            System.out.println("\n"+ListaSabor.get(i));
        }
    }
}
