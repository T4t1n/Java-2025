import Recursos.Calificacion;
import Recursos.Estudiante;

import java.util.Scanner;

public class Principal {

    Scanner sc = new Scanner(System.in);
    Estudiante es1 = new Estudiante();
    public void app() {
        System.out.println("Bienvenid@");
        System.out.println("Introduce la  nota:");
        es1.setNota(sc.nextLine());
        Calificacion.calificacionDelEstudiante(es1.getNota());
    }
}
