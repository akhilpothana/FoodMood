package MainMenu;

//our code
import CrudFoodModel.FoodList;
import CrudMoodModel.MoodList;
import NotificationsController.ControlViewNotifications;
import RecommendationController.RecommendationController;
import StatsController.StatsController;

//java libraries
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;
import javax.swing.JPanel;

public class MainMenuController {

    /**
     * @return the mainMenuUI
     */
    public MainMenuUI getMainMenuUI() {
        return mainMenuUI;
    }

    /**
     * @param mainMenuUI the mainMenuUI to set
     */
    public void setMainMenuUI(MainMenuUI mainMenuUI) {
        this.mainMenuUI = mainMenuUI;
    }
    private MainMenuUI mainMenuUI;
    private ControlViewNotifications notificationsCntrl;
    private StatsController statsCntrl;
    private RecommendationController recommendationCntrl;
    
    //These will be the only instances of these class and will be 
    //passed around as necessary
    private FoodList foodData;
    private MoodList moodData;
    
    private ArrayList<JPanel> foodMoodPanelsList = new ArrayList<>();
    
    public MainMenuController()
    {
        System.out.println("Made it to Main Menu Controller");
        foodData = new FoodList();
        moodData = new MoodList();
        
        mainMenuUI = new MainMenuUI(this);
        mainMenuUI.setTitle("FoodMood");
        mainMenuUI.setLocationRelativeTo(null);
        mainMenuUI.setVisible(true);       
    }
    
    /**
     * A method to write the given food and mood to the text file
     * This will occur either when a new entry is made, or when an existing card is edited
     * @param food
     * @param mood
     */
    public void writeFoodMoodToFile(String food, String mood)
    {
        try
        {
            PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter("src/food_mood_data.txt", true)));
            out.print(food + ";");
            out.print(mood);
            out.println();
            out.close();
        }
        catch (FileNotFoundException fnf) {
        System.out.print("FileNotFoundException: ");
        System.out.println(fnf.getMessage());
        } 
        catch (IOException ioe) {
        System.out.print("IOException");
        System.out.println(ioe.getMessage());
        }
    }
    
    /**
     * Here is where the UI of Stats is going to be called.
     */
    public void toStatsCntrl(){
        statsCntrl = new StatsController();
    }
    
    /**
     * Here is where the UI of notifications is going to be called.
     */
    public void toNotificationCntrl(){
        notificationsCntrl = new ControlViewNotifications();
    }
    
    /**
     * Here is where the UI of recommendations is going to be called.
     */
    public void toRecommendationCntrl(){
        recommendationCntrl = new RecommendationController();        
    }
    
    public MainMenuUI getmmUI()
    {
        return getMainMenuUI();
    }
}