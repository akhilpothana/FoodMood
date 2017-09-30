/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package foodmood_v1;

import CrudFoodController.crud_food_control;
import CrudMoodController.crud_mood_control;

/**
 * This class tests the use cases designed by Akhil
 * CRUD Food, CRUD Mood, View Food/Mood history
 * @author akhil
 */
public class FoodMoodAkhilController {
    
    private crud_food_control foodControlHarness;
    private crud_mood_control moodControlHarness;
    
    private String food = "dog food";
    private String mood = "ed makes me feel like shit";

    
    public FoodMoodAkhilController(){
        
        foodControlHarness = new crud_food_control(food);
        moodControlHarness = new crud_mood_control(mood);
        TestCRUDFood();
        TestCRUDMood();
    }
    
    public void TestCRUDFood() {
        foodControlHarness.getFood();
    }
    
    public void TestCRUDMood() {
        moodControlHarness.getMood();
    }
}
