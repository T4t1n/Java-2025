
package com.t4t1n.app;

public class Condicional_if_not {
    public static void main(String[] args) {
        
        System.out.println("===MONITOREO DEL SISTEMA===");
        var enlinea = true;
        
        if(!enlinea){ // igual a enlinea == false
            System.out.println("Sistema fuera de linea");
        }else {
            System.out.println("Sistema en linea");
        }
    }
    
}
