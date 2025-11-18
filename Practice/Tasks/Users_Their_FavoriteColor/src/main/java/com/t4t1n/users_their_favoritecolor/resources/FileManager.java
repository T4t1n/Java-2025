
package com.t4t1n.users_their_favoritecolor.resources;

import java.io.File;
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
    
    public static void searchUser() {
        System.out.println("Input the user's name: ");
        String toSearch = sc.nextLine();
        try(ObjectInputStream ois = new ObjectInputStream(new FileInputStream("users.dat"))) {
            
            ArrayList<User> readUsers = (ArrayList<User>) ois.readObject();
            
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
            
        } catch(IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
    
    public static void deleteUser(){
        System.out.println("Input the user's name that you wanna delete: ");
        String toDelete = sc.nextLine();
        
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream("users.dat"))){
               ArrayList<User> readUsers = (ArrayList<User>) ois.readObject();
            
            Iterator <User> i = readUsers.iterator();
            
            boolean found = false;
            while(i.hasNext()) {
                User u = i.next();
                if(u.getUserName().equalsIgnoreCase(toDelete)){
                   System.out.println("User found -> " + u.toString());
                   found = true;
                   
                   i.remove();
                   
                   File myObj = new File("users.data");
                   myObj.delete();
                   
                   try(ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("users.dat"))) {
                    oos.writeObject(readUsers);
                    oos.close();
            
                   }catch(IOException e) {
                    e.printStackTrace();
                   }
                   
                    System.out.println("Succesfully delete!");
                }
            }
            
            if(!found) {
                    System.out.println("Not found"); 
                }
            
            
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
