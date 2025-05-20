package com.t4t1n.app;

public class Arreglos_combinacion {
    public static void main(String[] args) {
        String[] productos = { "",
                               "Martillo precio",
                               "Destornillador",
                               "Taladro",
                               "Llave inglesa",
                               "Pinzas"};

        double[] precios = {0, 12.50, 10.20, 200.00, 130.50, 20.35};

        for (int f=1; f<productos.length; f++){
            System.out.println(productos[f]+": $"+precios[f]);
        }

        for (int f=1; f< productos.length; f++) {
            if (precios[f]<100.0){
                System.out.println(productos[f]+ ": $ "+precios[f] + " No paga impuestos");
            }else {
                System.out.println(productos[f]+ ": $ "+precios[f] + " Paga impuestos");
            }
        }
    }
}
