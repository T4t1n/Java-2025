package Arreglos;

import java.util.Arrays;

public class Matrices {
    public static void main(String[] args) {
        int[][] numeros = new int[3][3];

        //llenando fila 1 de la matriz
        numeros[0][0] = 8;
        numeros[0][1] = 7;
        numeros[0][2] = 4;

        //llenando fila 2 de la matriz
        numeros[1][0] = 2;
        numeros[1][1] = 1;
        numeros[1][2] = 3;

        //llenando fila 3 de la matriz
        numeros[2][0] = 9;
        numeros[2][1] = 0;
        numeros[2][2] = 6;

        System.out.println("Posicion 0x1: " +numeros[0][0]);
        System.out.println("Posicion 0x2: " +numeros[0][1]);
        System.out.println("Posicion 0x3: " +numeros[0][2]);
    }
}
