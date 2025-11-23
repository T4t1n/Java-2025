package Recursos;

public class Calificacion {

    public static void calificacionDelEstudiante(double nota) {


            if (nota < 0 || nota > 10) {
                System.out.println("Error: La nota debe estar entre 0 y 10");
                return;
            }
            String calificacion = nota >= 6.0 ? "APROBADO" : "REPROBADO";
            System.out.println(calificacion);


    }
}
