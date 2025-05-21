package com.t4t1n.app;

import java.util.Scanner;

public class Arreglos_mayor_valor {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int[]numeros = new int[5];
        int mayor = 0;

        //llenando array
        for (int f = 0; f<5; f++) {
            System.out.println("Ingrese valor: " + f);
            numeros[f] = entrada.nextInt();

            //analizando mayor valor
            if (numeros[f] > mayor){
                mayor = numeros[f];
            }
        }
        System.out.println("mayor valor ingresado: " + mayor);
    }
}
