package Recursos;

public class Calificacion {

    public static void calificacionDelEstudiante(String nota) {
        int puntaje =  Integer.parseInt(String.valueOf(nota));
        String Calificacion = puntaje >= 60 ? "Aprobo" : "Reprobo";
        System.out.println(Calificacion);
    }
}
