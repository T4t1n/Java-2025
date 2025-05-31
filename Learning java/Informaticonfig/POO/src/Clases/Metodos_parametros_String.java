package Clases;

public class Metodos_parametros_String {

    void DameDatos(String nombre, int edad, double estatura){
        System.out.println("Nombre: "  + nombre + "\n" +
                            " Edad: " + edad +
                            " Estatura: " + estatura);
    }
    public static void main(String[] args) {
        Metodos_parametros_String persona = new Metodos_parametros_String();
        persona.DameDatos("Ana", 23, 188.30);

    }
}
