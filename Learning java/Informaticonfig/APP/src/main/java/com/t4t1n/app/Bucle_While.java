/*
    BUCLES (WHILE)
 */
package com.t4t1n.app;

import java.util.Scanner;

public class Bucle_While {
    public static void main(String[] args) {
        int f = 0;
        Scanner entrada = new Scanner(System.in);

        //bucle while
        /*
            while (f < 5) {
            System.out.println(f);
            if(f == 3) {
                System.out.println("Soy la vuelta 3");
            }
            f++;
        }*/

        //tabla de multiplicar
        /*int valor;

        System.out.println("Ingrese tabla a consultar...");
        valor = entrada.nextInt();

        while (f <= 10) {
            System.out.println(valor + "X" + f + "=" + valor * f);
            f++;
        }
        System.out.println("Fin del bucle!");*/

        //Control de login de usuario
        final String username = "hsimpson";
        final String password = "abc123";
        boolean acceso = false;

        while (!acceso) {
            System.out.println("Ingrese su usuario...");
            String usuario = entrada.next();
            System.out.println("Ingrese su contraseña...");
            String clave = entrada.next();

            if(username.equals(usuario)) {
                System.out.println("Usuario correcto!");
            }else {
                System.out.println("Error: usuario incorrecto");
            }

            if(password.equals(clave)) {
                System.out.println("Contraseña correcta!");
            }else {
                System.out.println("Error: contraseña incorrecta");
            }
        }




    }
}
