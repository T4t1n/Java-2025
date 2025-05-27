package Arreglos;

public class Arreglos {
    public static void main(String[] args) {
        //declaracion de un array
        int[] numbers;
        //creacion de un array
        numbers = new int[5];

        // declaracion de un array
        int [] numeros = new int[5];

        //inicializar un array forma 1
        numeros[0] = 50;
        numeros[1] = 20;
        numeros[2] = 35;
        numeros[3] = 80;
        numeros[4] = 150;
        //numeros[5] = 400; -> no puedo error.

        int a = numeros[0];
        int b = numeros[1];
        int c = numeros[2];
        int d = numeros[3];
        int e = numeros[4];

        //asignar valores de arrays a variables
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);
        System.out.println(e);

        //consultar un array
        System.out.println(numeros[0]);

        //inicializar un array forma 2
        int[] valores = {234, 345, 456, 653, 45, 43};

        //consultar un array
        System.out.println(valores[2]);





    }

}
