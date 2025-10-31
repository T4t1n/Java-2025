
package com.t4t1n.user_them_favoritecolor.recursos;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/**
 *
 * @author Jaimisky
 */
public class Archivo {
    
    /* ########## Utilizando Buffered ########## */
    
    public static void guardar(Usuario user) {
        try(BufferedWriter bw = new BufferedWriter(new FileWriter("user_data.txt", true))) { /*Note: true*/
            bw.write("Nombre: " + user.getName());
            bw.newLine();
            bw.write("Color Favorito: " + user.getFavoriteColor());
            bw.newLine();
            bw.newLine();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    
    public static void leer(){
        try (BufferedReader br = new BufferedReader(new FileReader("user_data.txt"))) {
            String line;
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }
        }catch (IOException e) {
            e.printStackTrace();
        }
    }
    
    /* ########## Utilizando FileWriter ########## */
    
    public static void guardarV2(Usuario user) {
        try{
            FileWriter writer = new FileWriter("user_data_V2.txt", true);
            writer.write("Nombre: " + user.getName());
            writer.write("\n");
            writer.write("Color favorito: " + user.getFavoriteColor());
            writer.write("\n");
            writer.write("\n");
            writer.close();
            
            
//            FileReader reader = new FileReader("user_data_V2.txt");
//            int character;
//            while ((character = reader.read()) != -1) {
//                System.out.println((char) character);
//            }
//            reader.close();
        }catch (IOException e) {
            e.printStackTrace();
        }
    }
    
}

