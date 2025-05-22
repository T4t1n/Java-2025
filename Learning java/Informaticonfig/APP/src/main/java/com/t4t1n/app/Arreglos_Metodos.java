package com.t4t1n.app;

import java.util.Arrays;

public class Arreglos_Metodos {
    public static void main(String[] args) {
        int[] numeros = {8,2,4,6,5,1,3,7};
        String[] letras = {"b", "t", "a", "y", "c"};

        //ver valores como texto
        System.out.println("Array original: " + Arrays.toString(numeros));
        System.out.println("Array original: " + Arrays.toString(letras));


        //organizar un array de enteros
        Arrays.sort(numeros);
        System.out.println("Array organizado: " + Arrays.toString(numeros));
        Arrays.sort(letras);
        System.out.println("Array organizado: "+Arrays.toString(letras));

        //compara valores de arrays
        int[] numeros1 = {1,2,3};
        int[] numeros2 = {1,0,3};
        boolean iguales = Arrays.equals(numeros1, numeros2);
        System.out.println("Son iguales: " + iguales);

        //como llenar un array automaticamente
        int[] llenar = new int[5];
        Arrays.fill(llenar,1);
        System.out.println("Llenado: " + Arrays.toString(llenar));

        //como copiar un array
        int[] original = {1,2,3};
        int[] copia = Arrays.copyOf(original, 5); //cantidad de elementos a copiar
        System.out.println("Copiado" + Arrays.toString(copia));
    }
}
