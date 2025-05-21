package com.t4t1n.app;

public class Arreglos_Operaciones {
    public static void main(String[] args) {
        int ventas1[] = {500, 600, 400, 100, 650};
        int ventas2[] = {600, 800, 500, 350, 900};
        int total[] = new int[ventas1.length];
        int suma = 0;

        System.out.println("Suma de valores");
        for (int f=0; f<ventas1.length; f++) {
            total[f] = ventas1[f]+ventas2[f];
            suma = suma + total[f];
            System.out.println(total[f]);
        }
        System.out.println("Suma total = " + suma);

        System.out.println(" ");
        System.out.println("Resta de valores");
        for (int f=0; f<ventas1.length; f++) {
            total[f] = ventas2[f]-ventas1[f];
            suma = suma + total[f];
            System.out.println(total[f]);
        }

        System.out.println(" ");
        System.out.println("Multiplicacion de valores");
        for (int f=0; f<ventas1.length; f++) {
            total[f] = ventas1[f]*ventas2[f];
            suma = suma + total[f];
            System.out.println(total[f]);
        }
    }
}
