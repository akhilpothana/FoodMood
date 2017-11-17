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
import java.util.Date;
import java.util.Scanner;
import javax.swing.JPanel;

public class MainMenuController {
    private MainMenuUI mainMenuUI;
    private ControlViewNotifications notificationsCntrl;
    private StatsController statsCntrl;
    private RecommendationController recommendationCntrl;
    
    //These will be the only instances of these class and will be 
    //passed around as necessary
    private FoodList foodData;
    private MoodList moodData;
    private Date date;
    
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
        date = new Date();
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
            out.print(mood + ";");
            out.print(date);
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
    
    public FoodList getFoodList()
    {
        
        
        return foodData;
    }
    
    public MoodList getMoodList()
    {
        
        return moodData;
    }
    
    /**
     * Populate the JTable with the food and mood data from the text file
     */
    public void readFromFile()
    {   
        try{
            File file = new File("src/food_mood_data.txt");
            Scanner fileScanner = new Scanner(file);

            while(fileScanner.hasNextLine()){
                String foodAndMood = fileScanner.nextLine();
                String foodMood[] = foodAndMood.split(";");
            }
            }catch(FileNotFoundException e) {
	        System.out.print("FileNotFoundException");
    	}
    }
    
    /**
     * Here is where the UI of Stats is going to be called.
     */
    public void toStatsCntrl(){
        statsCntrl = StatsController.getStatsController();
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
}