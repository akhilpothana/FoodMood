package RecommendationController;

import MainMenu.MainMenuController;
import NotificationsController.ControlViewNotifications;
import RecommendationView.FoodMoodRecommendationContainer;
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
    private FoodMoodRecommendationContainer containerForPanels; //This class is created to control the changes between moods
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
        System.out.println("Made it to Recommendation Controller");
        recommendationUI = new RecommendationView(this);
        containerForPanels = new FoodMoodRecommendationContainer(); // It is instanciated here for users to change view everytime in Recommendations
        recommendationUI.setTitle("FoodMood");
        recommendationUI.setLocationRelativeTo(null);
        recommendationUI.setVisible(true);
    }
    
    /**
     * @return the recommendationUI
     */
    public RecommendationView getRecommendationUI() {
        return recommendationUI;
    }

    /**
     * @param recommendationUI the recommendationUI to set
     */
    public void setRecommendationUI(RecommendationView recommendationUI) {
        this.recommendationUI = recommendationUI;
    }
    
    /**
     * @return the containerForPanels
     */
    public FoodMoodRecommendationContainer getContainerForPanels() {
        return containerForPanels;
    }

    /**
     * @param containerForPanels the containerForPanels to set
     */
    public void setContainerForPanels(FoodMoodRecommendationContainer containerForPanels) {
        this.containerForPanels = containerForPanels;
    }
    
    public void toNotificationCntrl(){
        notificationCntrl = new ControlViewNotifications();
    }
    
    public void toStatsCntrl () {
        statsCntrl = new StatsController();
    }
}


