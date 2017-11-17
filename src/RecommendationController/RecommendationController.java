package RecommendationController;

import MainMenu.MainMenuController;
import NotificationsController.ControlViewNotifications;
import RecommendationView.RecommendationView;
import StatsController.StatsController;

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
    private StatsController statsCntrl;
    private ControlViewNotifications notificationCntrl;
    
    /**
     * Constructor will have this MainMenuController parameter because 
     * We want user to be able to go back to the previous page instead
     * Of starting a whole new frame again
     * @param mmc 
     */
    public RecommendationController(){
//        this.mmc = mmc;
        System.out.println("Made it to Recommendation Controller");
        recommendationUI = new RecommendationView(this);
        recommendationUI.setTitle("FoodMood");
        recommendationUI.setLocationRelativeTo(null);
        recommendationUI.setVisible(true);
    }
    
    public void toNotificationCntrl(){
        notificationCntrl = new ControlViewNotifications();
    }
    
    public void toStatsCntrl () {
        statsCntrl = new StatsController();
    }
}


