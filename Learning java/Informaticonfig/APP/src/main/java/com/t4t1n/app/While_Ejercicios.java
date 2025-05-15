package com.t4t1n.app;

import javax.swing.*;

public class While_Ejercicios {
    public static void main(String[] args) {
        final String u_correcto = "Usuario01";
        final String p_correcto = "Abc123%";

        String username, password;
        int intentos=0;
        final int max_intentos=3;

        while(intentos < max_intentos){
            username = JOptionPane.showInputDialog(null, "Ingrese nombre de usuario...");
            password = JOptionPane.showInputDialog(null, "Ingrese su contraseña...");

            if (username.equals(u_correcto) && password.equals(p_correcto)) {
                JOptionPane.showMessageDialog(null, "Acceso correcto!" + "\n"
                                                                            +" Bienved@"+ u_correcto);
                break;
            }else {
                intentos++;
                JOptionPane.showMessageDialog(null, "Usuario o clave incorrectos "+"\n"
                                                                            +" Intente de nuevo...");
            }
            if (intentos>2){
                JOptionPane.showMessageDialog(null, "Intentos de acceso excedidos"+ "\n"
                                                                + "Contacte a soporte");
            }
        }
    }
}
