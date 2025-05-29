// POO, METODOS GET Y SET
package Clases;

class Persona {
    String nombre = "José";
    int edad = 30;
    double peso = 86.30;
    boolean soltero = true;

    //Crear metodo get
    String DimeNombre() {
        return nombre + " Está aprendiendo Java";
    }

    int DimeEdad(){
        return edad;
    }

    //Crear metodo set
    void DimePeso(){
        if(peso > 70 && edad > 30){
            System.out.println(nombre + " Debe hacer ejercicio");
        }else {
            System.out.println(nombre + " Estás en tu peso correcto");
        }
        if (soltero){
            System.out.println("Necesita una novia");
        }else {
            System.out.println("Cuida a tu pareja");
        }
    }

    public static void main(String[] args) {
        /* get Se necesita sout para traer datos. Mientras que set no*/
        Persona persona1 = new Persona();
        System.out.println("Nombre: " + persona1.nombre);
        System.out.println(persona1.DimeNombre()+ "\n" +
                "Edad: "+persona1.DimeEdad());

        persona1.DimePeso();

    }
}
