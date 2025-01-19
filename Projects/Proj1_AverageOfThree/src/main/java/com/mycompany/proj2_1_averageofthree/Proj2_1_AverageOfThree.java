/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.proj2_1_averageofthree;

import java.util.Locale;
import java.util.Scanner;


/**
 *
 * @author cmjyt
 */
public class Proj2_1_AverageOfThree {

    public static void main(String[] args) {
        
        /* Average of  Three Parameters */
        
        /**
         * Prompt the user for three different real numbers.
         * Print out their average (mean value) to the console.
         */
        
        Scanner input = new Scanner(System.in);
        input.useLocale(Locale.US); //For locale issue
        float realNum1;
        float realNum2;
        float realNum3;
        float average;
        
        System.out.println("Please enter three numbers: ");
        realNum1 = input.nextFloat();
        realNum2 = input.nextFloat();
        realNum3 = input.nextFloat();
        average = (realNum1 + realNum2 + realNum3) / 3;
        
        System.out.println("The average is : " + average);
    }// End main
}
