/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CorrelationController;

import CorrelationModel.CorrelationModel;
import CorrelationView.CorrelationUI;

/**
 * This class correspond to the Controller within the MVC structure. This is where the main control of
 * The functionality will take place. This class will connect both the model with the view
 * @author edgardoreinoso
 */
public class CorrelationController {
// FIELDS
    private CorrelationUI foodMoodCo_view;
    private CorrelationModel foodMoodCo_model;
    
    /**
     * This is the default constructor for the ControllerFoodMoodCorrelation class
     */
    public CorrelationController(){
    
    }
    
// METHOD
    /**
     * This class is going to return the instance of the view food/mood correlation
     * @return the foodMoodCo_view
     */
    public CorrelationUI getFoodMoodCo_view() {
        System.out.println("Test get food/mood view");
        return foodMoodCo_view;
    }

    /**
     * This class is going to return the instance of the model food/mood correlation
     * @return the foodMoodCo_model
     */
    public CorrelationModel getFoodMoodCo_model() {
        System.out.println("Test get food/mood model");
        return foodMoodCo_model;
    }
}
