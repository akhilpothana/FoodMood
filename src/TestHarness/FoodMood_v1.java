package TestHarness;

import Login.LoginController;

import CrudUserModel.UserList;

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

/**
 * The TestHarness class instantiates the individual harness classes
 * Each of these harness classes tests 
 * @author Akhil
 */
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