
package com.t4t1n.users_their_favoritecolor.resources;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

/**
 *
 * @author Jaimisky
 */
public class FileManager {
    
    public static void saveUser(User newUsers) {
        ArrayList<User> users = new ArrayList<>();
        
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream("users.dat"))) {
            users = (ArrayList<User>) ois.readObject();
        } catch (Exception e) {
            
        }
        
        users.add(newUsers);
        
        try(ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("users.dat"))) {
            oos.writeObject(users);
            oos.close();
            
        }catch(IOException e) {
            e.printStackTrace();
        }
    }
    
    
    public static void readFile(){
        try(ObjectInputStream ois = new ObjectInputStream(new FileInputStream("users.dat"))) {
            ArrayList<User> readUsers = (ArrayList<User>) ois.readObject();
            
             for(User user : readUsers) {
                System.out.println("Name: " + user.getUserName() + " Favorite color: " + user.getFavoriteColor());
            }
        }catch(IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
        
        
    }
    
}
