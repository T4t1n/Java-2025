package com.t4t1n.app;

public class Break_Continue {
    public static void main(String[] args) {
        int control = 0, f=0;

        /*System.out.println("Cargando registros...");
        while (f<=10){
            System.out.println("Ciclo: "+ f);
            f++;
            if(f==7) {
                System.out.println("Error de carga, saliendo del sistema");
                break;
            }
        }
        System.out.println("Fin de bucle!");*/

        for (f=0; f<=20; f++) {
            if(f%2!=0){
                continue;
            }
            System.out.println("Valor: "+ f);
        }
    }
}
