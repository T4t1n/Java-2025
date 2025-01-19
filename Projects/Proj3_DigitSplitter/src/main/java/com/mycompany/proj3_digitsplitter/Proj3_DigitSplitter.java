/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.proj3_digitsplitter;

import java.util.Scanner;

/**
 *
 * @author cmjyt
 */
public class Proj3_DigitSplitter {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num;
        String numToString;
        char digit1;
        char digit2;
        char digit3;
        
        System.out.println("Enter a 3-digit integer: ");
        num = input.nextInt();
        input.close();
        
        numToString = String.valueOf(num);
        
        
        
        if (num >= 0 && numToString.length() == 3) {
            digit1 = numToString.charAt(0);
            digit2 = numToString.charAt(1);
            digit3 = numToString.charAt(2);
            System.out.println("First digit of the number " + num + " is: " + digit1);
            System.out.println("Second digit of the number " + num + " is: " + digit2);
            System.out.println("Third digit of the number " + num + " is: " + digit3);
        } else {
            System.out.println("Invalid number");
        }
    } // End Method Main
    }

