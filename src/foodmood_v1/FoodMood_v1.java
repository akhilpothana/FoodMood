package foodmood_v1;

import Login.LoginController;
import TestHarness.FoodMoodAkhilController;
import TestHarness.FoodMoodEdController;
import TestHarness.FoodMoodMaxController;
import TestHarness.FoodMoodShawnController;

/**
 * This class is the initiator of the application
 * @author Akhil
 */
public class FoodMood_v1 {
    public static void main(String[] args) {
//        TestHarness test = new TestHarness();
    
        LoginController loginToApp = new LoginController();
    }
}

class TestHarness{
    
    private FoodMoodAkhilController testAkhilHarness;
    private FoodMoodMaxController testMaxHarness;
    private FoodMoodShawnController testShawnHarness;
    private FoodMoodEdController testEdHarness;
    
    //This constructor intializes all the sub-test harnesses
    public TestHarness(){
        testAkhilHarness = new FoodMoodAkhilController();
        
        //Tests StatsView, StatsController, ChartsViewBackend, ChartsControllerBackend
        testMaxHarness = new FoodMoodMaxController();  
        testShawnHarness = new FoodMoodShawnController();
        testEdHarness = new FoodMoodEdController();    
    }
}