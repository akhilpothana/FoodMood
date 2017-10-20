package TestHarness;

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
    
    private String food = "pineapples";
    private String mood = "euphoria";

    /**
     * 
     */
    public FoodMoodAkhilController(){ 
        foodControlHarness = new CRUDFoodController();
        moodControlHarness = new CRUDMoodController(mood);
        dataHistoryHarness = new FoodMoodHistory_control();
        
        TestCRUDFood();
        TestCRUDMood();
        TestCRUDFood();
        TestCRUDMood();
        TestViewFoodMoodHistory();
    }
    
    /**
     * Run the CRUDFood test
     */
    public void TestCRUDFood(){
     //   System.out.println(foodControlHarness.getFood());
    }
    
    /**
     * Run the CRUDMood test
     */
    public void TestCRUDMood(){
        System.out.println(moodControlHarness.getMood());
    }
    
    /**
     * Run the TestViewFoodMoodHistory test
     */
    public void TestViewFoodMoodHistory(){
        System.out.println("Testing this class by displaying a sample table");
        
    }
}
