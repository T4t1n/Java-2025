package com.t4t1n.app;

import java.util.Scanner;

public class Clase_Math {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);


        System.out.println("Ingrese valor a calcular...");
        int valor = entrada.nextInt();

        //calculo de raiz cuadrada
        System.out.println("Raiz de: " + valor + " = " + Math.sqrt(valor));

        //calculo de potencia
        var base = 2;
        var exponente = 3;
        System.out.println("Potencia de 2 a la 3 = " + Math.pow(base, exponente));

        //valor absoluto de un numero
        var absoluto = -2.5;
        System.out.println("Valor absoluto de: " + absoluto + " = " + Math.abs(absoluto));

        //identificar mayor valor
        var numero1 = 50.2;
        var numero2 = 3;
        System.out.println("Mayor valor: " + Math.max(numero2, numero1));
        System.out.println("Menor valor: " + Math.min(numero2, numero1));

        //redondear a entero mas cercano
        var total = 5.2826;
        System.out.println(total + " redondeada = " + Math.round(total));

        //redondear hacia abajo
        System.out.println(total + " redondear hacia abajo = "
                                    + Math.floor(total));

        //rendondear hacia arriba a entero mas cercano
        System.out.println(total + " redondear hacia arriba = " + Math.ceil(total));

        //numero aleatorio
        double aleatorio = Math.round(Math.random()*10);
        System.out.println("valor aleatorio: " + aleatorio);

        //funcion numero PI
        System.out.println("Valor de pi: " + Math.PI);

        //seno de un angulo
        System.out.println("seno de un angulo de 90: " + Math.sin(90));

        //coseno de un angulo
        System.out.println("Coseno de un angulo de 180: " + Math.cos(180));

        //logaritmo natural de un numero
        var log = 100;
        System.out.println("Logaritmo de: " + log + " = " + Math.log(log));

        //logaritmo base 10 de un numero
        var log10 = 100;
        System.out.println("Logaritmo base 10 de: " +  log10 + " = " + Math.log10(log10));
    }
}
