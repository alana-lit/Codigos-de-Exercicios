package br.com.dio.collections;

import java.util.Random;

public class MatrizAleatoria {

    public static void main(String[] args) {
        int[][] matrizAleatoria = new int[4][4];
        Random r = new Random();

        for (int i = 0; i < matrizAleatoria.length; i++){
            for (int j = 0; j < matrizAleatoria.length; j++) {
                int numero = r.nextInt(9);
                matrizAleatoria[i][j] = numero;
            }
        }

        System.out.println("Matriz de numeros aleatorios: ");
        /*for (int[] linha: matrizAleatoria) {
            for (int coluna: linha) {
                System.out.print(coluna + " ");
            }
            System.out.println();
        }*/
        for (int i = 0; i < matrizAleatoria.length; i++){
            for (int j = 0; j < matrizAleatoria.length; j++) {
                System.out.print(matrizAleatoria[i][j] + " ");
            }
            System.out.println();
        }
    }
}
