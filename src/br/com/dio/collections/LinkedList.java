package br.com.dio.collections;

/* Exercício proposto da DIO - Resolva esses exercícios utilizando os métodos da implementação LinkedList:
        Crie uma lista chamada notas2 e coloque todos os elementos da list Arraylist nessa nova lista:
        Mostre a primeira nota da nova lista sem removê-lo
        Mostre a primeira nota da nova lista removendo-o

Alana Lima Tavares
*/

import java.util.Collections;
import java.util.List;

public class LinkedList {

    public static void main(String[] args) {
        List<Double> notas = new java.util.ArrayList<>();
        notas.add(7.0);
        notas.add(8.5);
        notas.add(9.3);
        notas.add(5.0);
        notas.add(7.0);
        notas.add(0.0);
        notas.add(3.6);

        System.out.println("Crie uma lista chamada notas2 " +
                "e coloque todos os elementos da list Arraylist nessa nova lista: ");
        List notas2 = Collections.synchronizedList(new java.util.LinkedList(notas));
        System.out.println(notas2.toString());

        System.out.print("Mostre a primeira nota da nova lista sem removê-lo: ");
        System.out.println(notas2.get(0));

        System.out.println("Mostre a primeira nota da nova lista removendo-o: " + notas2.get(0));
        notas2.remove(0);
        System.out.println(notas2.toString());
    }
}