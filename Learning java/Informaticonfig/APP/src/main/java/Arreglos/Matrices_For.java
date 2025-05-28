package Arreglos;

public class Matrices_For {
    public static void main(String[] args) {
        int[][] cantidades = {
                {10, 20, 80},
                {50, 70, 60},
                {40, 30, 90}
        };

        //System.out.println(cantidades[0][2]);

        for (int f=0; f<cantidades.length; f++){
            for (int k=0; k<cantidades.length; k++){
                //System.out.println(cantidades[f][k]);
                System.out.print(cantidades[f][k] + " ");
            }
            System.out.println(" ");
        }
    }
}
