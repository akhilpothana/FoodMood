/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package foodmood_v1;

import CrudFoodController.crud_food_control;

/**
 *
 * @author edgardoreinoso
 */
public class TestHarness {
    //FIELDS
    //Classes
    private FoodMoodMaxController testAkhilHarness;
    private crud_food_control foodControlHarness;
    //Other types
    private String food = "dog food";
    
    public TestHarness(){
        foodControlHarness = new crud_food_control(food);
        TestCRUDFood();
    }
    
    public void TestCRUDFood() {
        foodControlHarness.getFood();
    }
}
