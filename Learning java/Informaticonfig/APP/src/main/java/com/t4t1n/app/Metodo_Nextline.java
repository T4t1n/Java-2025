/*
   METODO NEXTlINE PARA INGRESAR TEXTOS
 */
package com.t4t1n.app;

import java.util.Scanner;

public class Metodo_Nextline {
    public static void main(String[] args) {
        String texto1, texto2;

        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingrese texto 1...");
        texto1 = entrada.nextLine(); // puedo escribir textos de varias palabras dentro de una variable
        System.out.println("Ingrese texto 2...");
        texto2 = entrada.nextLine();

        System.out.println(texto1);
        System.out.println(texto2);
    }
}
