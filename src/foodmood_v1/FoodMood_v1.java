/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package foodmood_v1;

import CrudFoodController.crud_food_control;

/**
 * This class is the initiator of the application
 * @author Akhil
 */
public class FoodMood_v1 {
    public static void main(String[] args) {
            TestHarness test = new TestHarness();
    }
}

class TestHarness {
    //FIELDS
    //Classes
    private FoodMoodAkhilController testAkhilHarness;
    private crud_food_control foodControlHarness;
    
    //Other types
    private String food = "dog food";
    
    public TestHarness(){
        testAkhilHarness = new FoodMoodAkhilController();
    }
}