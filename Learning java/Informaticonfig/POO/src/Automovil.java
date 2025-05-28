class Automovil {
    String marca = "Honda";
    String modelo = "CRV";
    int anio = 2024;
    int cant_ruedas = 4;
    boolean camara = true;




    public static void main(String[] args) {
        //instaciar una clase / crear un objeto
        Automovil auto1 = new Automovil();
        Automovil auto2 = new Automovil();
        System.out.println("Marca: "+auto1.marca);
        auto1.marca="Camaro";
        System.out.println("Marca: "+auto1.marca);
        System.out.println("Modelo: "+auto1.modelo);
        System.out.println("Año: "+auto1.anio);
        System.out.println("Ruedas: "+auto1.cant_ruedas);
        System.out.println("Cámara: "+auto1.camara);

    }

}
