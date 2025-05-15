package com.t4t1n.app;

import javax.swing.*;

public class For_Ejercicios {
    public static void main(String[] args) {
        boolean validar = false;

        for (int f=0; !validar; f++){
            String email = JOptionPane.showInputDialog(null, "Ingresa tu email...");

            if(email.contains("@") && (email.contains("gmail")) && (email.contains("yahoo")) && email.endsWith(".com")){
                JOptionPane.showMessageDialog(null, "Email ingresado correctamente");
                validar=true;
                break;
            }else if (!email.contains("@")){
                JOptionPane.showMessageDialog(null, "Email no válido "+"\n"
                                                                + "debe ingresar un @");
            }else {
                JOptionPane.showMessageDialog(null, "Email no válido "+"\n"
                                                                    + "debe ingresar: .com");
            }
        }
    }
}
