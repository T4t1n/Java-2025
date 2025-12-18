

package com.t4t1n.collections;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

/**
 *
 * @author Jaimisky
 */
public class Collections {
    
    public static void main(String[] args) {
        ArrayList<String> colors = new ArrayList<>();
        HashSet<String> uniqueColors = new HashSet<>();
        HashMap<String, String> useColors = new HashMap<>();
        
        
        colors.add("Red");
        colors.add("Blue");
        colors.add("Green");
        colors.add("Green");
        
        System.out.println(colors);
        
        
        uniqueColors.add("Red");
        uniqueColors.add("Blue");
        uniqueColors.add("Green");
        uniqueColors.add("Green");
        
        System.out.println(uniqueColors);
        
        useColors.put("Cambiaso", "Red");
        useColors.put("Locatelli", "Green");
        useColors.put("Gatti", "Gray");
        useColors.put("Gatti", "Gray");
        useColors.put("Kelly", "Gray");
        
        System.out.println(useColors);
        
        
        /*  ###### Why duplicates behave differently ##### */
        
        
        
        
        
        
        
    }
}
