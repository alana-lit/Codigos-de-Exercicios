package br.com.dio.collections;

public class ArrayInverso {

    public static void main(String[] args){

        int[] x = {1, 2, 3};
        for(int i = (x.length-1); i >= 0; i--){
            System.out.println(x[i]);
        }
    }
}
