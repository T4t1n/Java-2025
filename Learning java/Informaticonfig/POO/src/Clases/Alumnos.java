package Clases;

/*Metodo constructor*/
/*
Tipo especial de metodos que se utiliza para inicializar los objetos
en una clase. Se llama automaticamente cuando se crea una clase
cuando se crea una instancia de una clase. No tienen un tipo de
retorno. Otra funcion asignar valores iniciales a los atributos.
Java crea un constructor por defecto.
 */

class Alumnos {
    String nombre, asignatura;
    int nota;

    //Constructor por defecto
    public Alumnos(){
        nombre = "Miguel";
        asignatura = "Matemáticas";
        nota = 80;
    }

    String CambiaDatos(int nuevaNota){
        nota = nuevaNota;
        return "Nueva nota: " + nota;
    }

    void DimeDatos(){
        System.out.println("Nombre: " + nombre + "\n"+
                           "Asignatura: " + asignatura + "\n"+
                           "Nota: " + nota);
    }

    public static void main(String[] args) {
        Alumnos persona1 = new Alumnos();
        //System.out.println(persona1.asignatura);
        persona1.DimeDatos();
        persona1.CambiaDatos(95);
        persona1.DimeDatos();
    }
}
