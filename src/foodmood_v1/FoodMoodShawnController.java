package foodmood_v1;

import CrudUserController.CrudUserController;
import RecommendationController.RecommendationController;
import ResearchController.ResearchController;

public class FoodMoodShawnController {
    private CrudUserController crudUser;
    private RecommendationController recommend;
    private ResearchController research;
    
    public FoodMoodShawnController(){
        System.out.println("___________START OF OUTPUT FOR SHAWN'S TEST___________"); 
        crudUser = new CrudUserController();
        recommend = new RecommendationController();
        research = new ResearchController();
        
        testCRUDUser();
        testRecommend();
        testResearch();
        
        System.out.println("___________END OF OUTPUT FOR SHAWN'S TEST___________\n"); 
    }
    
    public void testCRUDUser()
    {
        System.out.println("Username: " + crudUser.ViewUserName() +
                " Password: " + crudUser.ViewPassword());
    }
    
    public void testRecommend()
    {
         System.out.println("Your Recommended food product is: " + 
                 recommend.GetRecommendation() + ".");       
    }
    
    public void testResearch()
    {
        research.GetSiteLink();
    }
}
