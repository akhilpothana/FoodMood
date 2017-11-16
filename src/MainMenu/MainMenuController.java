package MainMenu;

//our code
import CrudFoodModel.FoodList;
import CrudMoodModel.MoodList;
import NotificationsController.ControlViewNotifications;

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
    
    private MainMenuUI mainMenuUI;
    private ControlViewNotifications notificationsCntrl;
    
    //These will be the only instances of these class and will be 
    //passed around as necessary
    private FoodList foodData;
    private MoodList moodData;
    
    private ArrayList<JPanel> foodMoodPanelsList = new ArrayList<>();
    
    public MainMenuController()
    {
        foodData = new FoodList();
        moodData = new MoodList();
        
        mainMenuUI = new MainMenuUI(this);
        mainMenuUI.setTitle("FoodMood");
        mainMenuUI.setLocationRelativeTo(null);
        mainMenuUI.setVisible(true);       
    }
    
    /**
     * Called when the "Print data" button is pressed
     */
    public void getJTableData(){
        
//        for(int i = 0; i < mainMenuUI.getTable().getRowCount(); i++)
//        {
//            System.out.println((String) mainMenuUI.getTable().getValueAt(i,0));
//            System.out.println((String) mainMenuUI.getTable().getValueAt(i,1));
//            
//        //    writeFoodMoodToFile((String) mainMenuUI.getTable().getValueAt(i,0), (String) mainMenuUI.getTable().getValueAt(i,1));
//        }  
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
     * Populate the JTable with the food and mood data from the text file
     */
    public void populateTableFromFile()
    {
        int rowCounter = 0;
        
//        try{
//            File file = new File("src/food_mood_data.txt");
//            Scanner fileScanner = new Scanner(file);
//
//            while(fileScanner.hasNextLine()){
//                String foodAndMood = fileScanner.nextLine();
//                String foodMood[] = foodAndMood.split(";");
//                
//                mainMenuUI.getTable().setValueAt(foodMood[0], rowCounter, 0);
//                mainMenuUI.getTable().setValueAt(foodMood[1], rowCounter, 1);
//                rowCounter++;
//            }
//            }catch(FileNotFoundException e) {
//	        System.out.print("FileNotFoundException");
//    	}
    }
    
    /**
     * Here is where the UI of Stats is going to be called.
     */
    public void toStatsMaxUseCase(){
        
    }
    
    /**
     * Here is where the UI of notifications is going to be called.
     */
    public void toNotificationCntrl(){
    
    }
            
}
