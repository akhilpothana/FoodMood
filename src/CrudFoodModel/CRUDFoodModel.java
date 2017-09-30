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
public class CRUDFoodModel {
    //FIELDS
    private String food;
    
    //CONSTRUCTOR
    public CRUDFoodModel(String f)
    {
        food = f;
    } 

    //METHODS
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
