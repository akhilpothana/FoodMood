package foodmood_v1;

import CrudFoodController.CRUDFoodController;
import CrudMoodController.CRUDMoodController;
import HistoryController.FoodMoodHistory_control;

/**
 * This class tests the use cases designed by Akhil
 * CRUD Food, CRUD Mood, View Food/Mood history
 * @author akhil
 */
public class FoodMoodAkhilController {
    
    /**
     * 
     */
    private CRUDFoodController foodControlHarness;
    private CRUDMoodController moodControlHarness;
    private FoodMoodHistory_control dataHistoryHarness;
    
    //Sample inputs that will be set by the user
    private String food = "pineapples";
    private String mood = "euphoria";

    /**
     * 
     */
    public FoodMoodAkhilController(){
        System.out.println("___________START OF OUTPUT FOR AKHIL'S TEST___________");        
        TestCRUDFood();
        TestCRUDMood();
        TestViewFoodMoodHistory();
        System.out.println("___________END OF OUTPUT FOR AKHIL'S TEST___________\n");
    }
    
    /**
     * Run the CRUDFood test
     */
    public void TestCRUDFood(){
        foodControlHarness = new CRUDFoodController(food);
        System.out.println("The food is: " + foodControlHarness.getFood());
    }
    
    /**
     * Run the CRUDMood test
     */
    public void TestCRUDMood(){
        moodControlHarness = new CRUDMoodController(mood);
        System.out.println("The mood is: " + moodControlHarness.getMood());
    }
    
    /**
     * Run the TestViewFoodMoodHistory test
     */
    public void TestViewFoodMoodHistory(){
        dataHistoryHarness = new FoodMoodHistory_control();        
    }
}
