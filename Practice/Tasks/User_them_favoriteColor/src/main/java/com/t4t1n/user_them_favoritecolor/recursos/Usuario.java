
package com.t4t1n.user_them_favoritecolor.recursos;

/**
 *
 * @author cmjyt
 */
public class Usuario {
    String name;
    String favoriteColor;
    
    public Usuario(){}
    
    public Usuario(String name, String favoriteColor) {
        this.name = name;
        this.favoriteColor = favoriteColor;
    }
    
    public String getName() {
        return this.name;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    
    public String getFavoriteColor() {
        return this.favoriteColor;
    }
    
    public void setFavoriteColor(String favoriteColor) {
        this.favoriteColor = favoriteColor;
    }
    
    public String toString() {
        return "Informacion del Usuario: "+ "\n" +
                "Nombre del usuario: " + getName() + "\n" +
                "Color Favorito del usuario: " + getFavoriteColor(); 
    }
}
