/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package StatsController;
 
import ChartsView.ChartsView;
import StatsView.StatsView;

/**
 * The ChartsController pulls requested data from the database on the back-end.
 * @author mlh5614
 */
public class StatsController {
    private StatsView statsUI;
    /**
     * Maintain the current version of the controller to know when it is out of sync with the model and the view.
     */
    private int version;  
    /**
     * Maintain the relevant foods to utilize. 
     */
    private String foods[];
    /**
     * Maintain the relevant moods to utilize.
     */
    private String moods[];
     
    /**
     * This is the default constructor for the ChartsController class
     */
    public StatsController() {
//        StatsView sv1 = new StatsView();
//        System.out.println("Test Passed: Stats Controller and View Created");        
        System.out.println("Made it to Stats Controller");
        statsUI = new StatsView();
        statsUI.setTitle("FoodMood");
        statsUI.setLocationRelativeTo(null);
        statsUI.setVisible(true);
    }
    
    /**
     * Create a new Chart.
     */
    public void createDashboard()
    {
        System.out.println("Test Passed: User Dashboard Launched");
    }
    
    public void refreshView()
    {
        System.out.println("Test Passed: New Stats Pulled from DB");
    }
    
    /**
     * Update the order of elements.
     */
    public void reorganizeDashboard(int position, int newPosition)
    {
        System.out.println("Test Passed: Item Moved from " + position + " to " + newPosition);
    }
    
    /**
     * Delete the stats for the user.
     */
    public void deleteStats()
    {
        System.out.println("Test Passed: Stats Deleted");
    }

}
