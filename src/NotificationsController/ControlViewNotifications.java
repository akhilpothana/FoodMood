/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package NotificationsController;
import MainMenu.MainMenuController;
import NotificationsModel.ModelViewNotifications;
import NotificationsView.ViewNotificationsUI;
import RecommendationController.RecommendationController;
import StatsController.StatsController;

/**
 * This class correspond to the View within the MVC structure. This is where view of this use case
 * Functionality will be take place. Getting the data from the Model and main controls from the 
 * Control class.
 * @author edgardoreinoso
 */
public class ControlViewNotifications {
    private MainMenuController mmc;
    private RecommendationController recommendationsCntrl;
    private StatsController statsCntrl;
    private ModelViewNotifications viewNofitications_model;
    private ViewNotificationsUI notificationsUI;
    
    /**
     * Constructor will have this MainMenuController parameter because 
     * We want user to be able to go back to the previous page instead
     * Of starting a whole new frame again
     * @param mmc 
     */
    public ControlViewNotifications(){
//        this.mmc = mmc;
        //Test Harness pritning line
        System.out.println("Made it to Notification Controller");
        notificationsUI = new ViewNotificationsUI(this);
        notificationsUI.setTitle("FoodMood");
        notificationsUI.setLocationRelativeTo(null);
        notificationsUI.setVisible(true);
    }
    
    public void toRecommendationCntrl (){
        recommendationsCntrl = new RecommendationController();
    }
    
    public void toStatsCntrl () {
        statsCntrl = new StatsController();
    }
}