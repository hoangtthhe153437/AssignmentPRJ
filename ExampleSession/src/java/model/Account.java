/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.List;

/**
 *
 * @author Admin
 */
public class Account {

    private int userId;
    private String username;
    private String password;
    private int creator;

    public Account() {
    }

    public Account(int userId, String username, String password, int creator) {
        this.userId = userId;
        this.username = username;
        this.password = password;
        this.creator = creator;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getCreator() {
        return creator;
    }

    public void setCreator(int creator) {
        this.creator = creator;
    }

    @Override
    public String toString() {
        return "Account{" + "userId=" + userId + ", username=" + username + ", password=" + password + ", creator=" + creator + '}';
    }

    

   
}
