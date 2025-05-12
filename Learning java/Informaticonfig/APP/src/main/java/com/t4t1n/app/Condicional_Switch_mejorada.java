
package com.t4t1n.app;

import java.util.Scanner;


public class Condicional_Switch_mejorada {
    public static void main(String[] args) {
        int DiaSemana;
        Scanner entrada = new Scanner(System.in);
        
        // Ingresando datos
        System.out.println("Ingrese día a consultar");
        DiaSemana = entrada.nextInt();
        
        switch (DiaSemana) {
            case 1 -> System.out.println("Hoy es : Lunes");
            case 2 -> System.out.println("Hoy es: Martes");
            case 3 -> System.out.println("Hoy es: Miercoles");
            case 4 -> System.out.println("Hoy es: Jueves");
            case 5 -> System.out.println("Hoy es: Viernes");
            case 6 -> System.out.println("Hoy es: Sabado");
            case 7 -> System.out.println("Hoy es: Domingo");
            default -> System.out.println("Numero incorrecto, saliendo del sistema");
            
        }
    }
    
}
