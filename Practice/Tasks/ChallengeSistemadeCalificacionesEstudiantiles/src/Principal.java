import Recursos.Calificacion;
import Recursos.Estudiante;

import java.util.Scanner;

public class Principal {

    Scanner sc = new Scanner(System.in);
    Estudiante es1 = new Estudiante();
    public void app() {
        System.out.println("Bienvenid@");
        while(true) {
            try {
                System.out.println("Introduce la  nota:");
                double value = Double.parseDouble(sc.nextLine());
                es1.setNota(value);
                Calificacion.calificacionDelEstudiante(es1.getNota());
            } catch (NumberFormatException e) {
                System.out.println("Error! Debes ingresar un valor numerico");
            }
        }
    }
}
