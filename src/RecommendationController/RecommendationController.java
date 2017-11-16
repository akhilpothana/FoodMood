package RecommendationController;

import MainMenu.MainMenuController;
import RecommendationView.RecommendationView;

/**
 *This is the RecommendationController class that manages all processes in the
 * Recommendations page
 * 
 * @author Shawn
 */
public class RecommendationController {
    private RecommendationView recommendationUI;
    private final String recommendation = "Nothing... yet!";
    private MainMenuController mmc;
    
    public RecommendationController(MainMenuController mmc){
       this.mmc = mmc;
        
        System.out.println("Made it to Recommendation Controller");
        recommendationUI = new RecommendationView(this);
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
    
    public MainMenuController getMMC()
    {
        return mmc;
    }
    
}
