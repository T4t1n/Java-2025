
package com.t4t1n.users_their_favoritecolor.resources;


import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

/**
 *
 * @author Jaimisky
 */
public class FileManager {
    
    static Scanner sc = new Scanner(System.in);
    
    public static void saveUser(User newUsers) {
        ArrayList<User> users = new ArrayList<>();
        
        
            users = loadUsers();
        
        
        users.add(newUsers);
        
        saveUsers(users);
    }
    
    
    public static void readFile(){
        try {
            ArrayList<User> readUsers = loadUsers();
            
             for(User user : readUsers) {
                System.out.println("Name: " + user.getUserName() + " Favorite color: " + user.getFavoriteColor());
            }
        }catch(Exception e) {
            System.out.println("No users saved yet");
        }
        
        
    }
    
    public static void searchUser() {
        System.out.println("Input the user's name: ");
        String toSearch = sc.nextLine();
        try {
            
            ArrayList<User> readUsers = loadUsers();
            
            Iterator <User> i = readUsers.iterator();
            
            boolean found = false;
            while(i.hasNext()) {
                User u = i.next();
                if(u.getUserName().equalsIgnoreCase(toSearch)){
                   System.out.println(u.toString());
                   found = true;
                }
            }
            
            if(!found) {
                    System.out.println("Not found"); 
                }
            
        } catch(Exception e) {
            e.printStackTrace();
        }
    }
    
    public static void deleteUser(){
        System.out.println("Input the user's name that you want to delete: ");
        String toDelete = sc.nextLine();
        
        try {
               ArrayList<User> readUsers = loadUsers();
            
            Iterator <User> i = readUsers.iterator();
            
            boolean found = false;
            while(i.hasNext()) {
                User u = i.next();
                if(u.getUserName().equalsIgnoreCase(toDelete)){
                   System.out.println("User found -> " + u.toString());
                   found = true;
                   
                   i.remove();
                   
                   //File myObj = new File("users.data");
                   //myObj.delete();
                   
                   saveUsers(readUsers);
                   
                    System.out.println("Succesfully delete!");
                }
            }
            
            if(!found) {
                    System.out.println("Not found"); 
                }
            
            
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    public static void updateUser() {
        System.out.println("Input the user's name that you want to update: ");
        String toUpdate = sc.nextLine();
        
        try{
            ArrayList<User> readUsers = loadUsers();
            Iterator <User> i = readUsers.iterator();
            
            boolean found = false;
            
            while(i.hasNext()) {
                User u = i.next();
                
                if(u.getUserName().equalsIgnoreCase(toUpdate)) {
                    found = true;
                    System.out.println("User found -> " + u.toString());
                    
                    System.out.println("Input de new color's user: ");
                    String newColor = sc.nextLine();
                    
                    u.setFavoriteColor(newColor);
                    
                    //File myObj = new File("users.dat"); **** new FileOutputStream("users.dat") already replaces the file completely.
                   // myObj.delete();                     **** So deleting is unnecessary
                    
                   saveUsers(readUsers);
                    
                    System.out.println("Succefully updated"); 
                }
            }
            
            if(!found) {
                System.out.println("Not found");
            }
            
            
        }catch(Exception e){
            e.printStackTrace();
        }
    }
    
    
    /* Useful Methods*/
    
    public static ArrayList<User> loadUsers() {
        try(ObjectInputStream ois = new ObjectInputStream(new FileInputStream("users.dat"))) {
            return (ArrayList<User>) ois.readObject();
        }catch(IOException | ClassNotFoundException e) {
            return new ArrayList<>();
        }
    }
    
    public static void saveUsers(ArrayList<User> users) {
        try(ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("users.dat"))){
            oos.writeObject(users);
            oos.close();
        }catch (IOException e) {
            e.printStackTrace();
        }
    }
}
