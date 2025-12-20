
package com.t4t1n.collections;
import java.util.Map;
import java.util.HashMap;
import java.util.Scanner;

/**
 *
 * @author Jaimisky
 */
public class Principal {
    
    static User user;
    static Map<String, User> users = new HashMap<>();
    
    static Scanner sc = new Scanner(System.in);
    static String opcionElegida;
    
    
    public static void app () {
        while(true) {
            
            user = new User();
            menu();
            
            
        }
    }
    
    public static void menu(){
        
        System.out.println('\n' +"##### Usuarios ######");
        System.out.println("1. Añadir");
        System.out.println("2. Buscar");
        System.out.println("3. Actualizar");
        System.out.println("4. Borrar");
        
        System.out.println("Elige una opción: ");
        opcionElegida = sc.nextLine();
        
        opcionSeleccionada(opcionElegida);
    }
    
    public static void opcionSeleccionada(String opcionElegida) {
        
        switch(opcionElegida) {
            case "1" -> añadirUsuario(); 
        }
        
    }
    
    
    public static void añadirUsuario() {
        System.out.println("Ingrese el nombre de usuario: ");
        user.setUsername(sc.nextLine());
        System.out.println("Ingrese el color favorito: ");
        user.setFavoriteColor(sc.nextLine());
        
        String print = añadirAColeccion(user.getUsername());
        
        
        System.out.println(print);
    }
    
    
    public static String añadirAColeccion(String useraname) {
        
        users.put(useraname, user);
        
        String print = "Se registro correctamente el usuario";
        
        return print +  users.toString();
        
    }
    
}
