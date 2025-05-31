package Clases;

public class Metodos_parametros {
    int Sumar(int a, int b){
        return a + b;
    }

    int Restar(int a, int b){
        return a - b;
    }

    int Multiplicacion(int a, int b, int c) {
        return a*b*c;
    }

    double dividir(int a, int b){
        if(b!=0) {
            return a / b;
        }else {
            System.out.println("No se puede dividir entre 0");
        }
        return 0;
    }

    double potencia(double base, double exponente){
        return Math.pow(base, exponente);
    }

    public static void main(String[] args) {
        Metodos_parametros operacion = new Metodos_parametros();
        System.out.println("Suma: "+operacion.Sumar(13,123));
        System.out.println("Resta: "+operacion.Restar(488,234));
        System.out.println("Multiplicación: "+operacion.Multiplicacion(4,4, 5));
        System.out.println("División: "+operacion.dividir(15,0));
        System.out.println("Potencia: "+ operacion.potencia(8, 3));

    }
}
