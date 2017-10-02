package foodmood_v1;

import CrudFoodController.CRUDFoodController;

/**
 * This class is the initiator of the application
 * @author Akhil
 */
public class FoodMood_v1 {
    public static void main(String[] args) {
        TestHarness test = new TestHarness();
    }
}

/**
 * The TestHarness class instantiates the individual harness classes
 * Each of these harness classes tests 
 * @author Akhil
 */
class TestHarness{
    
    //Declaring individual controller objects 
    private FoodMoodAkhilController testAkhilHarness;
    private FoodMoodMaxController testMaxHarness;
    private FoodMoodShawnController testShawnHarness;
    private FoodMoodEdController testEdHarness;
    
    //This constructor intializes all the sub-test harnesses
    public TestHarness(){
        testAkhilHarness = new FoodMoodAkhilController();
        testMaxHarness = new FoodMoodMaxController();  //Tests StatsView, StatsController, ChartsViewBackend, ChartsControllerBackend
        testShawnHarness = new FoodMoodShawnController();
        testEdHarness = new FoodMoodEdController();    
    }
}