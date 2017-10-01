/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package foodmood_v1;

import CrudUserController.CrudUserController;
import RecommendationController.RecommendationController;
import ResearchController.ResearchController;

/**
 *
 * @author edgardoreinoso
 */
public class FoodMoodShawnController {
    private CrudUserController crudUser;
    private RecommendationController recommend;
    private ResearchController research;
    
    public FoodMoodShawnController(){
        crudUser = new CrudUserController();
        recommend = new RecommendationController();
        research = new ResearchController();
        
        research.GetSiteLink();
        System.out.println("Your Recommended food product is: " +
                recommend.GetRecommendation() + ".");
        System.out.println(crudUser.ViewUserName());
        System.out.println(crudUser.ViewPassword());
        
    }
}
