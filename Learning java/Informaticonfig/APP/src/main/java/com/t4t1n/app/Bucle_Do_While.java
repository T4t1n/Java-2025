package com.t4t1n.app;

import java.util.Scanner;

public class Bucle_Do_While {
    public static void main(String[] args) {
        int contador = 1;
        final var valor = 5;
        Scanner entrada = new Scanner(System.in);

        //bucle do while
        /*do{
            System.out.println("Valor: " + contador++);
        }while (contador<=valor);

        System.out.println("Fin de bucle");*/

        // EJERCICIO CON DO WHILE
        int numero = 0;
        int errores = 0;
        do {
            System.out.println("Ingrese el numero 5...");
            numero = entrada.nextInt();
            if (numero != 5) {
                System.out.println("No ingresaste el numero 5");
                errores++;
            }
        }while(numero!=5);

        System.out.println("Gracias!, fallaste: " + errores + " veces");
    }

}
