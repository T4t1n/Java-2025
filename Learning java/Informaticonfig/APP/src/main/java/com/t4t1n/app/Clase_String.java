/*
    Metodos de la clase string
*/
package com.t4t1n.app;

import java.util.Scanner;


public class Clase_String {
    public static void main(String[] args) {
        String palabra1, palabra2;
        Scanner entrada = new Scanner(System.in);
        
        //ingreso de datos
        System.out.println("Ingrese primera palabra...");
        palabra1 = entrada.next();
        System.out.println("Ingrese palabra 2...");
        palabra2 = entrada.next();
        
        //comparar textos
        if (palabra1.equals(palabra2)) {
            System.out.println(palabra1 + " es igual a: " +palabra2);
        }else {
            System.out.println(palabra1 + " no es igual a: " + palabra2);
        }
        
        // comparar textos sin tomar en cuenta mayusculas
        if(palabra1.equalsIgnoreCase(palabra2)) {
            System.out.println(palabra1 + " es igual a " + palabra2 + "\n"
                    + " sin tomar en cuenta las mayúsculas");
        }else{
            System.out.println(palabra1 + " no es igual a " + palabra2 + "\n"
                    + " sin tomar en cuenta las mayúsculas");
        }
        
        //comparar cantidad de caracteres
        if (palabra1.compareTo(palabra2) == 0){
            System.out.println(palabra1 + " tiene las mismas letras que: " + palabra2);
        }else {
            if (palabra1.compareTo(palabra2)>0){
                System.out.println(palabra1+" tiene mas letras que: "+palabra2);
            }else {
                System.out.println(palabra1 + " tiene menos letras que: "+palabra2);
            }
        }
        
        //saber posición de un caracter de una palabra
        // char caracter = palabra1.charAt(0);
        //System.out.println("Primera letra de "+palabra1+ ":"+caracter);
        System.out.println("Primer caracter: "+palabra1.charAt(0));
        
        //cantidad de caracteres de un texto
        System.out.println("Cantidad de caracteres de "+palabra1+ ":"+palabra1.length());
        System.out.println("Cantidad de caracteres de "+palabra2+":"+palabra2.length());
        
        //identificar varios caracteres en un texto o palabra
        System.out.println("Primeras 3 letras: "+palabra1.substring(0,3));
        System.out.println("Primeras 3 letras: "+palabra2.substring(0,3));

        //buscar caracteres que coincidan en dos palabras
        int coincidencia = palabra1.indexOf(palabra2);
        if (coincidencia==-1){
            System.out.println(palabra1+ " no contiene: "+palabra2);
        }else {
            System.out.println(palabra1+ " tiene coincidencia con: "+palabra2);
        }
        
        //llevar a mayusculas
        System.out.println(palabra1+ "en mayúsculas es: "+palabra1.toUpperCase());
        
        //llevar a minisculas
        System.out.println(palabra1+ "en minúsculas es:"+palabra1.toLowerCase());
    }
}
