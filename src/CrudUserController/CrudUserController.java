/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CrudUserController;

/**
 *This is the CrudUserController, where the application will manage all
 * processes concerning user profiles
 * 
 * @author Shawn
 */
public class CrudUserController {
    
    /**
     * username data
     */
    private String username = "FoodLover87";
    /**
     * password data string
     */
    private String password = "Luncheon";
    
    /**
     * create a new user
     */
    public void CreateUser(){
        
    }
    
    /**
     * edit user settings
     */
    public void EditUser(){
        
    }
    
    public String ViewUserName(){
        return username;
    }
    
    public String ViewPassword(){
        return password;
    }
    
    /**
     * deletes user information
     */
    public void DeleteUser(){
        
    }
    
    /**
     * This is the default constructor for CrudUserController
     */
    public CrudUserController(){
        
    }
    
}
