/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller_ViewFood_correlation;

import model_ViewFood_correlation.ModelFoodMoodCorrelation;
import view_FoodMood_correlation.ViewFoodMoodCorrelation;

/**
 * This class correspond to the Controller within the MVC structure. This is where the main control of
 * The functionality will take place. This class will connect both the model with the view
 * @author edgardoreinoso
 */
public class ControllerFoodMoodCorrelation {
// FIELDS
    private ViewFoodMoodCorrelation foodMoodCo_view;
    private ModelFoodMoodCorrelation foodMoodCo_model;
    
    /**
     * This is the default constructor for the ControllerFoodMoodCorrelation class
     */
    public ControllerFoodMoodCorrelation(){
    
    }
    
// METHOD
    /**
     * This class is going to return the instance of the view food/mood correlation
     * @return the foodMoodCo_view
     */
    public ViewFoodMoodCorrelation getFoodMoodCo_view() {
        return foodMoodCo_view;
    }

    /**
     * This class is going to return the instance of the model food/mood correlation
     * @return the foodMoodCo_model
     */
    public ModelFoodMoodCorrelation getFoodMoodCo_model() {
        return foodMoodCo_model;
    }
}
