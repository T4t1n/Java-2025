package com.t4t1n.app;

public class Bucle_For {
    public static void main(String[] args) {
        //for (inicializacion; condicion; actualizacion)

        //bucle ascendente
        /*System.out.println("Bucle ascendente");
        for (int f = 0; f <= 10; f++) {
            System.out.println("Vuelta No. : " + f);
        }
        System.out.println("Fin de bucle!");
        System.out.println(" ");

        //bucle descendente
        System.out.println("Bucle descendente");
        for (int f=10; f>=0; f--) {
            System.out.println("Vuelta No. : " + f);
        }
        System.out.println("Fin de bucle!");
        System.out.println(" ");*/

        int suma = 0;
        System.out.println("Sumando valores...");
        for (int f=0; f<=20; f++) {
            if (f%2==0) {
                suma = suma + f;
                System.out.println("Valor sumado: " + f);
            }
        }
        System.out.println("Fin de la operación");
        System.out.println("Suma de pares: " + suma);
    }
}
