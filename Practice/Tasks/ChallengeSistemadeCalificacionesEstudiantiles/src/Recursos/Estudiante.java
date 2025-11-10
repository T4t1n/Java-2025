package Recursos;

public class Estudiante {

    private String nota;

    public Estudiante() {

    }

    public Estudiante(String nota) {
        this.nota = nota;
    }

    public String getNota(){
        return this.nota;
    }

    public void setNota(String nota) {
        this.nota = nota;
    }
}
