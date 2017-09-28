/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CorrelationView;

import CorrelationController.ControllerFoodMoodCorrelation;

/**
 * This class correspond to the View within the MVC structure. This is where view of this use case
 * Functionality will be take place. Getting the data from the Model and main controls from the 
 * Control class.
 * @author edgardoreinoso
 */
public class ViewFoodMoodCorrelation {
// FIELDS
    private ControllerFoodMoodCorrelation foodMoodCo_controller;
    
    /**
     * This is the default constructor for the ViewFoodMoodCorrelation class
     */
    public ViewFoodMoodCorrelation(){
    
    }
    
// METHOD
    /**
     * @return the foodMoodCo_controller
     */
    public ControllerFoodMoodCorrelation getFoodMoodCo_controller() {
        return foodMoodCo_controller;
    }
}
