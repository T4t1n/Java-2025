/*
* La palabra reservada this, es una palabra clave que se refiere a
* la instancia actual de la clase en la que esta siendo utilizada
* Se utiliza principalmente para diferenciar entre los atributos
* de instancia de una clase y los parametros del constructor o
* de los metodos que tienen el mismo nombre.
* hacer que una variable de clase se use como variable de parametro.
* */
package Clases;

class Palabra_this {
    String nombre = "María";

    String Dimenombre(String nombre){
        this.nombre =nombre;
        return nombre;
    }

    void Muestranombre(){
        System.out.println("Nombre: "+ nombre);
    }

    public static void main(String[] args) {

        Palabra_this persona = new Palabra_this();
        persona.Dimenombre("Pedro");
        persona.Muestranombre();


    }
}
