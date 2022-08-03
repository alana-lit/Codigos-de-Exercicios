package br.com.dio.collections;

/*Exercício proposto da DIO - Faça um programa que receba a temperatura média dos 6 primeiros meses do ano e armazene-as
em uma lista. Após isto, calcule a média semestral das temperaturas e mostre todas as temperaturas acima desta média, e
em que mês elas ocorreram (mostrar o mês por extenso: 1 – Janeiro, 2 – Fevereiro e etc).
*/


import java.util.*;

public class ListDeTemperatura {

    public static void main(String[] args) {
        List<String> meses = Arrays.asList("Janeiro","Fevereiro","Março","Abril","Maio","Junho");
        List<Double> mediaMensal = new ArrayList<>();

        Scanner leitor = new Scanner(System.in);
        Double media;
        int i = 0;

        while(i < 6){ //Este bloco serve para obter as médias e armazena-las
            System.out.println("Insira a media da temperatura do mes de "+meses.get(i));
            mediaMensal.add(media = leitor.nextDouble());
            //leitor.useLocale(Locale.ENGLISH);
            i++;
        }

        Double soma = 0d; //Faz a somatoria de todos os elementos dentro do array
        Iterator<Double> iteratorSoma = mediaMensal.iterator();
        while(iteratorSoma.hasNext()) {
            Double nextSoma = iteratorSoma.next();
            soma += nextSoma;
        }

        Double mediaSemestral = (soma/mediaMensal.size());// Bloco que utiliza a media dos valores da List para verificar condição e imprimir mensagem caso atendida.
        Iterator<Double> iteratorMedia = mediaMensal.iterator();
        i = 0;
        do {
            Double nextMedia = iteratorMedia.next();
            if(nextMedia>mediaSemestral)System.out.println("Média maior que a média semestral = " +meses.get(i)+"-"+nextMedia);
            i++;
        }
        while(iteratorMedia.hasNext());
    }
}
