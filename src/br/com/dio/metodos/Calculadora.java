package br.com.dio.metodos;

import java.util.Scanner;

public class Calculadora {

    public static void main(String[] args){

        Scanner leitor = new Scanner(System.in);
        System.out.println("Entre com dois valores: ");
        double x = leitor.nextInt();
        double y = leitor.nextInt();

        OperacoesBasicas.soma(x,y);
        OperacoesBasicas.subtracao(x,y);
        OperacoesBasicas.multiplicacao(x,y);
        OperacoesBasicas.divisão(x,y);

    }
}
