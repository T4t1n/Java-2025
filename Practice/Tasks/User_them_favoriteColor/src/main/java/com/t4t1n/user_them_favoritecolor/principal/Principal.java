
package com.t4t1n.user_them_favoritecolor.principal;

import com.t4t1n.user_them_favoritecolor.recursos.Archivo;
import com.t4t1n.user_them_favoritecolor.recursos.Usuario;
import java.util.Scanner;

/**
 *
 * @author Jaimisky Cellez
 */
public class Principal {
    Scanner sc = new Scanner(System.in);
    String next = "S";
    Usuario user = new Usuario();
    
    public void putInfo () {
        while(next.equalsIgnoreCase("S")){
            System.out.println("######### Bienvenid@ #########");
            
            System.out.println("Ingrese su nombre: ");
            user.setName(sc.nextLine());
            
            System.out.println("Ingrese su color favorito: ");
            user.setFavoriteColor(sc.nextLine());
            
            System.out.println("Deseas continuar? S/N");
            next = sc.nextLine();
            /*Inside of while to save in each loop*/
            Archivo.guardar(user);
            Archivo.guardarV2(user);
            Archivo.saveObject(user);
        }
        
        
    }
    
    public void printInfo() {
        System.out.println(user.toString());
        Archivo.leer();
        Archivo.leerObjeto();
    }
    
}
