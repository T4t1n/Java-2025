package Recursos;

public class Calificacion {

    public static void calificacionDelEstudiante(double nota) {

            String calificacion = nota >= 6.0 ? "APROBADO" : "REPROBADO";
            System.out.println(calificacion);

    }
}
