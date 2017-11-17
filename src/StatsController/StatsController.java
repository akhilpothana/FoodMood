/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package StatsController;
 
import ChartsView.ChartsView;
import MainMenu.MainMenuController;
import NotificationsController.ControlViewNotifications;
import RecommendationController.RecommendationController;
import StatsView.StatsView;

/**
 * The ChartsController pulls requested data from the database on the back-end.
 * @author mlh5614
 */
public class StatsController {
    private MainMenuController mmc;
    private ControlViewNotifications notificationsCntrl;
    private RecommendationController recommendationCntrl;
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
//        this.mmc = mmc;
//        StatsView sv1 = new StatsView();
//        System.out.println("Test Passed: Stats Controller and View Created");        
        System.out.println("Made it to Stats Controller");
        statsUI = new StatsView(this);
        statsUI.setTitle("FoodMood");
        statsUI.setLocationRelativeTo(null);
        statsUI.setVisible(true);
    }
    
    public void toNotificationsCntrl (){
        notificationsCntrl = new ControlViewNotifications();
    }
    
    public void toRecommendationCntrl () {
        recommendationCntrl = new RecommendationController();
    }
    
    /**
     * Create a new Chart.
     */
    public void createDashboard()
    {
        if (statsUI == null)
        {
            statsUI = new StatsView(this);
        }
    }
    
    public StatsView getStatsController() {
        return statsUI;
    }
    
    public void refreshView()
    {
        if (statsUI == null)
        {
            createDashboard();
        }
        
        statsUI.refreshView();
    }
    

}



