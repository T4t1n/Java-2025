/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.proj_5;

/**
 *
 * @author cmjyt
 */
public class Proj_5 {

    public static void main(String[] args) {
        String[][] wordsSpanish = {{ "Hola", "Jugar", "Bailar", "Prestar", "Deber",
                                  "Apostar", "Correr", "Buscar", "Averguar",
                                   "Caminar" }, { "Hello", "Play", "Dance", "Lend", "Owe", "Bet",
                                  "Run", "Look for", "Figure out", "Walk" }};
        
        
       

        System.out.printf("%-15s | %-15s%n", "Español", "Inglés");
        System.out.println("-------------------------------");

        for (int i = 0; i < wordsSpanish[0].length; i++) {
            System.out.printf("%-15s | %-15s%n", wordsSpanish[0][i], wordsSpanish[1][i]);
        }
        
        
       
    }
}
