package br.com.dio.collections;

/*Exercício proposto da DIO - Crie um conjunto contendo as cores do arco-íris e: vermelha, laranja, amarela, verde, azul, azul-escuro e violeta
A.Exiba todas as cores uma abaixo da outra.
B.A quantidade de cores que o arco-íris tem.
C.Exiba as cores em ordem alfabética.
D.Exiba as cores na ordem inversa da que foi informada
Exiba todas as cores que começam com a letra ”v”
Remova todas as cores que não começam com a letra “v”
G.Limpe o conjunto.
H.Confira se o conjunto está vazio.

*/

import java.util.*;

public class SetArcoIris {

    public static void main(String[] args) {
        LinkedHashSet<String> cores = new LinkedHashSet<>(Arrays.asList("vermelha", "laranja", "amarela", "verde", "azul", "azul-escuro", "violeta"));
        System.out.println("Cores uma abaixo da outra:");
        for (String cor : cores) System.out.println(cor);

        System.out.println("Quantidade de cores que o arco-íris tem: " + cores.size());

        TreeSet<String> cores2 = new TreeSet<>(cores);
        System.out.println("As cores em ordem alfabética" + cores2);

        List<String> coresList = new ArrayList<>(cores);
        Collections.reverse(coresList);
        System.out.println("As cores na ordem inversa da que foi informada" + coresList);

//        HashSet<String> cores3 = new HashSet<>(cores);
//        Iterator<String> iteratorCor = cores3.iterator();
//        do {
//            String next = iteratorCor.next();
//            if(next.substring() == "v")System.out.println("Cores que começam com a letra ”v”:" + next);
//        }
//        while(iteratorCor.hasNext());

        cores.clear();
        System.out.println("O conjunto está vazio? " + cores.isEmpty());
        System.out.println("O conjunto está vazio? " + cores2.isEmpty());
    }
}
