package Clases;
import Clases.Alumnos;

import java.util.Scanner; /* paquete util incorporado por java, tiene muchas clases */

//Sobrecarga de metodos constructores
class Auto {
    String marca, modelo;
    int anio;
    Scanner entrada = new Scanner(System.in);

    //metodo 1 sin parametros
    public Auto(){

        marca = "Toyota";
        modelo = "Corolla";
        anio = 2024;
    }
    //metodo 2 con parametros
    public Auto(String marca){
        this.marca = marca;
        this.modelo = "Accord";
        this.anio = 1998;
    }

    void MostrarInfo() {
        System.out.println("Marca: " + marca+"\n" +
                           "Modelo: " + modelo + "\n"+
                           "Año: " + anio);
    }
    public static void main(String[] args) {
        Auto auto1 = new Auto();
        auto1.MostrarInfo();
        Auto auto2 = new Auto("Honda");
        auto2.MostrarInfo();
        Alumnos alumno1 = new Alumnos();
        alumno1.nombre = "Manuel";
        System.out.println("Nombre: " + alumno1.nombre);
    }
}
