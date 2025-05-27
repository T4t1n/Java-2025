package Arreglos;

public class Arreglos_bucles {
    public static void main(String[] args) {
        //recorrer array con bucle for
        String[] productos = {"","Martillo",
                              "Desctornillador",
                              "Taladro",
                              "llave inglesa",
                              "Pinzas"};

        for(int f = 1; f < productos.length; f++){
            System.out.println("Producto " +f+": " + productos[f]);
        }

        //recorrer array con bucle while
        int f = 1;
        while (f<productos.length){
            System.out.println("Productos " +f+ ": "+ productos[f]);
            f++;
        }
    }
}
