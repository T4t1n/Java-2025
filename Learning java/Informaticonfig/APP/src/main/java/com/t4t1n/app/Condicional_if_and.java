
package com.t4t1n.app;

import javax.swing.*;


public class Condicional_if_and {
    
    public static void main(String[] args) {
        String nombre;
        int edad;
    
        nombre = JOptionPane.showInputDialog(null, "Ingresa tu nombre...");
        
        String edad2 = JOptionPane.showInputDialog(null, "Ingrese tu edad...");
        
        edad = Integer.parseInt(edad2);
        
        //analizando datos
        if (edad > 18) {
            JOptionPane.showMessageDialog(null, "Eres mayor de edad");
        }else {
            JOptionPane.showMessageDialog(null, "Eres menor de edad");
        }
        
        
        if (edad < 12) {
            JOptionPane.showMessageDialog(null, "Eres un niño(a)");
        }else if(edad > 12 && edad < 19){
            JOptionPane.showMessageDialog(null, "Eres adolescente");
        }else {
            JOptionPane.showMessageDialog(null, "Eres un adulto");
        }
        
    }
    
}
