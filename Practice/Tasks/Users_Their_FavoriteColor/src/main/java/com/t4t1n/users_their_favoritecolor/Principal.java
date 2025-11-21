
package com.t4t1n.users_their_favoritecolor;

import com.t4t1n.users_their_favoritecolor.resources.FileManager;
import com.t4t1n.users_their_favoritecolor.resources.User;

import java.util.Scanner;

/**
 *
 * @author Jaimisky
 */
public class Principal {
    private static Scanner sc = new Scanner(System.in);
    
    
    private static String option;
    
    public static void app() {
        while (true) {
            menu();
        }
    }
    
    
    
        public static void menu(){
        System.out.println("""
                           
                            ########## Welcome to the TatinApp ##########
                           
                            1.Add user
                            2.Show users
                            3.Search user
                            4.Delete user
                            5.Update user
                            6.Exit
                           """);
        option = sc.nextLine();
        
        selectOption(option);
    }
    
    public static void selectOption(String option) {
        switch(option) {
            case "1" -> addUser();
            case "2" -> FileManager.readFile();
            case "3" -> FileManager.searchUser();
            case "4" -> FileManager.deleteUser();
            case "5" -> FileManager.updateUser();
            case "6" -> System.exit(0);
            
            default -> {
                System.err.println("Error: Unknown command: " + option);
               
            }
        }
    }
    
    public static void addUser() {
        
        String wantContinue = "y";
        while (wantContinue.equalsIgnoreCase("y")) {
             User newUser = new User();
        
            System.out.println("########## Set information ##########");
            System.out.println("Input the user's name: ");
            newUser.setUserName(sc.nextLine());
            System.out.println("Input the favorite user's color: ");
            newUser.setFavoriteColor(sc.nextLine());
        
//            users.add(newUser);
            FileManager.saveUser(newUser);
        
        
            System.out.println("Registry completed " + newUser.getUserName() + " with color " + newUser.getFavoriteColor());
             
            do {
                
                System.out.println("Do you want to continue: Y /N");
                wantContinue = sc.nextLine();
                while(!wantContinue.equalsIgnoreCase("n") && !wantContinue.equalsIgnoreCase("y")){
                    System.out.println("Error!");
                    System.out.println("Do you want to continue: Y /N");
                    wantContinue = sc.nextLine();
                }
       
            }while(!wantContinue.equalsIgnoreCase("n") && !wantContinue.equalsIgnoreCase("y"));
            
            
           
        
    }
        
    }
    
    
}
