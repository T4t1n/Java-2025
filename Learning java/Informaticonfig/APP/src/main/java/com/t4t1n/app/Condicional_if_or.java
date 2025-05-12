
package com.t4t1n.app;

public class Condicional_if_or {
    public static void main(String[] args) {
        boolean Domingo = true;
        boolean Vacaciones = true, Licencia = true;
        
        //Ingresando datos
        if (Domingo == true || Vacaciones == true || Licencia == true) {
            System.out.println("ACCESO DENEGADO A LA EMPRESA");
        } else {
            System.out.println("ACCESO CONCEDIDO");
        }
    }
}
