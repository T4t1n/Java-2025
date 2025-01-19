/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.proj2_madlibsclone;

import java.util.Scanner;

/**
 *
 * @author cmjyt
 */
public class Proj2_MadLibsClone {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String Adjective1, Girls_Name, Adjective2, Occupation1, Place, Clothing,
                Hobby, Adjective3, Occupation2, Boys_name, Mans_name;
        System.out.println("Enter an adjective: ");
        Adjective1 = input.next();
        System.out.println("Enter a girl's name: ");
        Girls_Name = input.next();
        System.out.println("Enter another adjective: ");
        Adjective2 = input.next();
        System.out.println("Enter an occupation: ");
        Occupation1 = input.next();
        System.out.println("Enter the name of a place: ");
        Place = input.next();
        System.out.println("Enter the name of a piece of clothing: ");
        Clothing = input.next();
        System.out.println("Enter the name of a hobby: ");
        Hobby = input.next();
        System.out.println("Enter another adjective: ");
        Adjective3 = input.next();
        System.out.println("Enter another occupation: ");
        Occupation2 = input.next();
        System.out.println("Enter a boy's name: ");
        Boys_name = input.next();
        System.out.println("Enter a man's name: ");
        Mans_name = input.next();
        
        
        System.out.println("There once was a " + Adjective1 + " girl named " + Girls_Name +
                            " who was a " + Adjective2 + " " + Occupation1 + " in the kingdom of " + Place + "." + '\n' + 
                            "She loved to wear " + Clothing + " and to " + Hobby + "." + " She wanted to marry the " + 
                            Adjective3 + Occupation2 + " named " + Boys_name + " but her father, king " + Mans_name + " " +
                            " forbid her from seeing him.");
    }// End method main
}
