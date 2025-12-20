
package com.t4t1n.collections;

/**
 *
 * @author Jaimisky
 */
public class User {
    private String username;
    private String favoriteColor;
    
    public User(){};
    
    public User(String username, String favoriteColor) {
        this.username = username;
        this.favoriteColor = favoriteColor;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getFavoriteColor() {
        return favoriteColor;
    }

    public void setFavoriteColor(String favoriteColor) {
        this.favoriteColor = favoriteColor;
    }

    @Override
    public String toString() {
        return" username: " + username + ", favoriteColor: " + favoriteColor;
    }
    
    
    
    
    
    
    
}
