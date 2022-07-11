package br.com.dio.metodos;

import java.util.Scanner;

public class OperacoesBasicas {
    public static void soma(double x, double y){
        double result = x + y;
        System.out.println("A soma dos dois numero e "+result);
    }

    public static void subtracao(double x, double y) {
        double result = x - y;
        System.out.println("A subtracao do primeiro numero pelo ultimo e " + result);
    }

    public static void multiplicacao(double x, double y){
        double result = x * y;
        System.out.println("A multiplicacao dos dois numero e "+result);
    }

    public static void divisão(double x, double y){
        double result = x/y;
        System.out.println("A divisao do primeiro numero pelo ultimo e "+result);
    }

}
