package br.com.dio.collections;

/* Código de estudo da classe Random
*
* Alana Lima Tavares*/

import java.util.Random;

public class ArrayDeNumeros {

    public static void main(String[] args) {
        int[] numeros = new int[20];
        Random r = new Random();

        for(int i = 0; i < 20; i++){
            //numeros[i] = r.nextInt(100);
            int numeroQualquer = r.nextInt(100);
            numeros[i] = numeroQualquer;
        }

        System.out.println("Vetor de numeros aleatorios: ");
        for (int numeroQlaquer: numeros) {
            System.out.print(numeroQlaquer + " ");
        }

        System.out.println("\nTriplo dos numeros aleatorios: ");
        for (int numeroQlaquer: numeros) {
            System.out.print(numeroQlaquer*3 + " ");
        }

    }
}
