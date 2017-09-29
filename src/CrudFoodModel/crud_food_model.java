/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CrudFoodModel;

/**
 *
 * @author Akhil
 */
public class crud_food_model {
    //FIELDS
    private String food;
    
    //CONSTRUCTOR
    public crud_food_model(String f)
    {
        food = f;
    } 

    //METHODS
    /**
     * @return the food
     */
    public String getFood() {
        System.out.println("Test food model class");
        return food;
    }

    /**
     * @param food the food to set
     */
    public void setFood(String food) {
        this.food = food;
    }
}
