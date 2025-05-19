package com.t4t1n.app;

public class Arreglos_bucles {
    public static void main(String[] args) {
        String[] productos = {"""Martillo",
                              "Desctornillador",
                              "Taladro",
                              "llave inglesa",
                              "Pinza"};

        for(int f = 0; f < productos.length; f++){
            System.out.println("Producto: " + f + productos[f]);
        }
    }
}
