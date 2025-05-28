import java.util.Scanner;

public class EntradaSalida {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        String palabraUno;
        String palabraDos;
        String palabraTres;
        String salida;

        System.out.println("Introduzca palabra 1: ");
        palabraUno = entrada.next();
        System.out.println("Introduzca palabra 2: ");
        palabraDos = entrada.next();
        System.out.println("Introuduzca palabra 3: ");
        palabraTres = entrada.next();

        salida = palabraUno + " " + palabraDos + " " + palabraTres;

        System.out.println(salida);


    }
}
