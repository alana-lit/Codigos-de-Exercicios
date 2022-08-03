package br.com.dio.exemplos;

/* Dada uma lista com 7 notas de um aluno [7, 8.5, 9.3, 5, 7, 0, 3.6], faça:

Este código pertencente a Camila Cavalcante usado para estudo
 */

import java.util.Collections;
import java.util.Iterator;
import java.util.List;


public class ArrayList {

    public static void main(String[] args) {
//        Formas de declarar um ArrayList e as versões onde surgiram

//        List notas = new ArrayList(); //antes do java 5
//        ArrayList<Double> notas = new ArrayList<>(); //não muito recomendada
//        List<Double> notas = new ArrayList<>(Arrays.asList(7d, 8.5, 9.3, 5d, 7d, 0d, 3.6));

         /*List<Double> notas = Arrays.asList(7d, 8.5, 9.3, 5d, 7d, 0d, 3.6); //nessa declaração não podemos nem adicionar nem excluir elementos
         notas.add(10d);
         System.out.println(notas);*/

         /*List<Double> notas = List.of(7d, 8.5, 9.3, 5d, 7d, 0d, 3.6); //nessa declaração não podemos nem adicionar nem excluir elementos
         notas.add(1d);
         notas.remove(5d);
         System.out.println(notas);*/

        System.out.println("Crie uma lista e adicione as sete notas: ");

        //List<Double> notas = new ArrayList<Double>(); //Generics(jdk 5) - Diamond Operator(jdk 7)
        List<Double> notas = new java.util.ArrayList<>();
        notas.add(7.0); //adiciona elemento dentro da list
        notas.add(8.5);
        notas.add(9.3);
        notas.add(5.0);
        notas.add(7.0);
        notas.add(0.0);
        notas.add(3.6);
        System.out.println(notas.toString());

        System.out.println("Exiba a posição da nota 5.0: " + notas.indexOf(5d)); //método que retorna o indice de um elemento

        System.out.println("Adicione na lista a nota 8.0 na posição 4: ");
        notas.add(4, 8d); //adiciona elemento dentro da list porem informando o indice desejado para o mesmo
        System.out.println(notas);

        System.out.println("Substitua a nota 5.0 pela nota 6.0: ");
        notas.set(notas.indexOf(5d), 6.0); //nesse método (set) no primeiro paramentro ele encontra o indice indicado e subistitui o valor la existente pelo outro indicado no segundo parametro
        System.out.println(notas);

        System.out.println("Confira se a nota 5.0 está na lista: " + notas.contains(5d)); //metodo que verifica se um elemnto existente dentro de uma list. Retorna um valor booleano

        System.out.println("Exiba todas as notas na ordem em que foram informados: ");
        for (Double nota : notas) System.out.println(nota);


        System.out.println("Exiba a terceira nota adicionada: " + notas.get(2)); // "pega"/retorna o valor no indice indicado
        System.out.println(notas.toString());

        System.out.println("Exiba a menor nota: " + Collections.min(notas)); //Collection é classe que possui metodos como o min e o max

        System.out.println("Exiba a maior nota: " + Collections.max(notas));//O método min retorna oo menor numero e o max o maior

        Iterator<Double> iterator = notas.iterator();// Interator é a classe que possui metodos que não existem na list como por exemplo hasNext e next
        Double soma = 0d;
        while(iterator.hasNext()){ //metodo que verifica se existe um proximo elemento
            Double next = iterator.next();//metodo que obtem o proximo elemento(retorna)
            soma += next;
        }
        System.out.println("Exiba a soma dos valores: " + soma);

        System.out.println("Exiba a média das notas: " + (soma/notas.size()));// o size retorna o tamanho do array

        System.out.println("Remova a nota 0: ");
        notas.remove(0d);//remove um objeto/elemento do array
        System.out.println(notas);

        System.out.println("Remova a nota da posição 0");
        notas.remove(0);//remove um elemento do array a partir do seu indice
        System.out.println(notas);

        System.out.println("Remova as notas menores que 7 e exiba a lista: ");
        Iterator<Double> iterator1 = notas.iterator();
        while(iterator1.hasNext()) {
            Double next = iterator1.next();
            if(next < 7) iterator1.remove();
        }
        System.out.println(notas);

        System.out.println("Apague toda a lista");
        notas.clear();//limpa/apaga os elementos de um array
        System.out.println(notas);

        System.out.println("Confira se a lista está vazia: " + notas.isEmpty());//verifica se um array esta vazio e retorna um booleano
    }
}
