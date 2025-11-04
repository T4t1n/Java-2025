
package com.t4t1n.users_their_favoritecolor.resources;

import java.io.Serializable;

/**
 *
 * @author Jaimisky
 */
public class User implements Serializable{
    
    private String userName;
    private String favoriteColor;
    
    
    public User() {}
    
    public User(String userName, String favoriteColor) {
        this.userName = userName;
        this.favoriteColor = favoriteColor;
    }
    
    public String getUserName() {
        return this.userName;
    }
    
    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getFavoriteColor() {
        return favoriteColor;
    }

    public void setFavoriteColor(String favoriteColor) {
        this.favoriteColor = favoriteColor;
    }
}
