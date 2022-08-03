package br.com.dio.collections;

/*Exercício proposto da DIO - Utilizando listas, faça um programa que faça 5 perguntas para uma
pessoa sobre um crime. As perguntas são:
"Telefonou para a vítima?"
"Esteve no local do crime?"
"Mora perto da vítima?"
"Devia para a vítima?"
"Já trabalhou com a vítima?"
Se a pessoa responder positivamente a 2 questões ela deve ser classificada como "Suspeita", entre 3 e 4 como "Cúmplice"
e 5 como "Assassina". Caso contrário, ela será classificado como "Inocente".
*/

import java.util.*;

public class ListCrime {

    public static void main(String[] args) {
        List<String> perguntas = Arrays.asList("Telefonou para a vitima?","Esteve no local do crime?","Mora perto da vitima?",
                "Devia para a vitima?","Ja trabalhou com a vitima?");
        List<String> respostas = new ArrayList<>();

        Scanner leitor = new Scanner(System.in);
        String resposta;

        System.out.println("Responda as perguntas com 'true' ou 'false'(sem acentos, primeira letra minuscula)");
        for(int i = 0; i < perguntas.size(); i++){
            System.out.println(perguntas.get(i));
            resposta = leitor.nextLine();
            respostas.add(resposta);
        }

        /*Iterator<String> iteratorSoma = respostas.iterator();
        Integer respostasPositivas = 0;
        do {
            String next = iteratorSoma.next();
            if (next == "Sim"){
                respostasPositivas += 1;
            }
        }
        while(iteratorSoma.hasNext());
        Isso aqui é um lógica funcional(sei pq testei em) que não funciona
        FAÇA UM DEBUG PARA VOCÊ ENTENDER A ZOAÇÃO DO JAVA*/

        Iterator<String> iteratorSoma = respostas.iterator();
        Integer respostasPositivas = 0;
        do {
            String next = iteratorSoma.next();
            if (next.length() == 4){
                respostasPositivas += 1;
            }
        }
        while(iteratorSoma.hasNext());

        switch (respostasPositivas){
            case 2:
                System.out.println("Suspeita");
                break;
            case 3: case 4:
                System.out.println("Cumplice");
                break;
            case 5:
                System.out.println("Assassina");
                break;
            default:
                System.out.println("Inocente");
                break;
        }

        System.out.println(respostasPositivas);
    }
}
