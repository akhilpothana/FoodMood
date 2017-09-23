/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CrudFoodController;

import CrudFoodModel.crud_food_model;
import CrudFoodView.crud_food_view;
import HistoryModel.FoodMoodHistory_model;

/**
 *
 * @author Akhil
 */
public class crud_food_control {
    
    String food;
    crud_food_model cfm;
    crud_food_view cfv;
    
    crud_food_control(String f)
    {
        food = f;
        cfm = new crud_food_model(f);
        cfv = new crud_food_view(f);
    }
    
    /**
     * @return the food
     */
    public String getFood() {
        return cfm.getFood();
    }

    /**
     * @param food the food to set, provided by user
     */
    public void setFood(String food) {
        cfm.setFood(food);
    }
    
    /**
     * 
     * Delete the food entry
     */
    public void deleteFood()
    {
        
    }
}
