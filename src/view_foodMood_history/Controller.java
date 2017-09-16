/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view_foodMood_history;

/**
 *
 * @author Akhil
 */
public class Controller {
    
    private String food;
    private String mood;
    
    /**
     * 
     * @param v - the passed instance of the view class
     */
    Controller(View v)
    {
        
    }

    /**
     * @return the food
     */
    public String getFood() {
        return food;
    }

    /**
     * @return the mood
     */
    public String getMood() {
        return mood;
    }
    
    
}
