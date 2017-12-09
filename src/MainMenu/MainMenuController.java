package MainMenu;

//our code
import CrudFoodModel.FoodList;
import CrudMoodModel.MoodList;
import Data.InteractWithDB;
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
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JPanel;

public class MainMenuController {
    private MainMenuUI mainMenuUI;
    private ControlViewNotifications notificationsCntrl;
    private StatsController statsCntrl;
    private RecommendationController recommendationCntrl;
    private static MainMenuController mmc1;
    private static InteractWithDB data;
    
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
        populateFMLists();
        
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
     * @return 
     */
    
    public static MainMenuController getMMC() {
        if (mmc1 == null)
        {
            mmc1 = new MainMenuController();
            //populateFMLists();
        }
        
        return mmc1;
    }
    
    public static void populateFMLists() {
        data = InteractWithDB.getIWDB();
        try {
            String s = data.sendGet();
            data.populateLists(s);
        } catch (Exception ex) {
            Logger.getLogger(MainMenuController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void writeFoodMoodToFile(String food, String mood) throws Exception
    {
        try
        {
            data = InteractWithDB.getIWDB();
            data.uploadFoodMood(food, mood);
            //String s = data.sendGet();
            //data.updateLists(s);
            foodData = FoodList.getTheFoodList();
            foodData.addFood(food);
            foodData.getFoodList();
            moodData = MoodList.getTheMoodList();
            moodData.addMood(mood);
            moodData.getMoodList();
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
        statsCntrl.refreshView();
        statsCntrl.setUIvis();
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