package com.t4t1n.app;

import java.util.Arrays;

public class Arreglos_caracteres {
    public static void main(String[] args) {
        String[] productos = new String[5];

        productos[0] = "manzanas";
        productos[1] = "uvas";
        productos[2] = "peras";
        productos[3] = "fresas";
        productos[4] = "kiwis";

        Arrays.sort(productos);

        System.out.println("producto1: " + productos[0]);
        System.out.println("producto2: " + productos[1]);
        System.out.println("producto3: " + productos[2]);
        System.out.println("producto4: " + productos[3]);
        System.out.println("producto5: " + productos[4]);
    }
}
