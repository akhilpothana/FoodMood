/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package RecommendationController;

import RecommendationView.RecommendationView;

/**
 *This is the RecommendationController class that manages all processes in the
 * Recommendations page
 * 
 * @author Shawn
 */
public class RecommendationController {
    private RecommendationView recommendationUI;
    private String recommendation = "nothing... yet!";
    
    public RecommendationController(){
        System.out.println("Made it to Recommendation Controller");
        recommendationUI = new RecommendationView();
        recommendationUI.setTitle("FoodMood");
        recommendationUI.setLocationRelativeTo(null);
        recommendationUI.setVisible(true);
    }
    
    
    /**
     * This is the default constructor for the RecommendationController
     * class
     */
    public String GetRecommendation(){
        
        /**
         * parseFood(), sortFood(), retrieveInfo() would be the most likely
         * methods to make and use for this step, and then an if statement to
         * check for empty food lists, something like this:
         * if(recommendation != null){
         * return recommendation
         * }
         * else{
         * return "nothing... yet!";
         * }
         */
        return recommendation;
    }
    
}
