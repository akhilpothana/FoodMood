/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package crud_food_model;

/**
 *
 * @author Akhil
 */
public class crud_food_model {
    
    private String food;
    
    public crud_food_model(String f)
    {
        food = f;
    } 

    /**
     * @return the food
     */
    public String getFood() {
        return food;
    }

    /**
     * @param food the food to set
     */
    public void setFood(String food) {
        this.food = food;
    }
}
