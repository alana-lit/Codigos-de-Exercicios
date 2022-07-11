package br.com.dio.metodos;

import java.util.Scanner;

public class Consoantes {

    public static void main(String[] args){

        Scanner leitor = new Scanner(System.in);
        String[] letras = new String[6];

        int consoantes = 0;
        System.out.println("Digite 6 caracteres: ");

        for(int i = 0; i < letras.length; i++){
            letras[i] = leitor.nextLine();

            if ( !(letras.equals("a") || letras.equals("e") || letras.equals("i") || letras.equals("o") || letras.equals ("u")) )  {
                consoantes++;
            }
        }

        System.out.println("Quantidade de consoantes: "+consoantes);
    }
}
