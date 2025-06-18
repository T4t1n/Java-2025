package Clases;
    //Sobrecarga de metodos constructores
class Auto {
    String marca, modelo;
    int anio;

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
    }
}
