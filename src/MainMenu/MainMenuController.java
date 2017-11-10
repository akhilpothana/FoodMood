package MainMenu;

import CrudFoodModel.FoodList;
import CrudMoodModel.MoodList;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;
import javax.swing.table.DefaultTableModel;

public class MainMenuController {
    
    private MainMenuUI mainMenuUI;
    
    //These will be the only instances of these class and will be 
    //passed around as necessary
    private FoodList foodData;
    private MoodList moodData;
    
    public MainMenuController()
    {
        foodData = new FoodList();
        moodData = new MoodList();
        
        mainMenuUI = new MainMenuUI(this);
        mainMenuUI.setLocationRelativeTo(null);
        mainMenuUI.setVisible(true);       
    }
    
    /**
     * Called when the "Print data" button is pressed
     */
    public void getJTableData(){
        
        for(int i = 0; i < mainMenuUI.getTable().getRowCount(); i++)
        {
            System.out.println((String) mainMenuUI.getTable().getValueAt(i,0));
            System.out.println((String) mainMenuUI.getTable().getValueAt(i,1));
            
        //    writeFoodMoodToFile((String) mainMenuUI.getTable().getValueAt(i,0), (String) mainMenuUI.getTable().getValueAt(i,1));
        }  
    }
    
    /**
     * A method to write the given food and mood to the text file
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
        
        try{
            File file = new File("src/food_mood_data.txt");
            Scanner fileScanner = new Scanner(file);

            while(fileScanner.hasNextLine()){
                String foodAndMood = fileScanner.nextLine();
                String foodMood[] = foodAndMood.split(";");
                
                mainMenuUI.getTable().setValueAt(foodMood[0], rowCounter, 0);
                mainMenuUI.getTable().setValueAt(foodMood[1], rowCounter, 1);
                rowCounter++;
            }
            }catch(FileNotFoundException e) {
	        System.out.print("FileNotFoundException");
    	}
    }
    
    /**
     * Add a new row to the table
     */
    public void addRowToTable()
    {
        DefaultTableModel model = (DefaultTableModel) mainMenuUI.getTable().getModel();
        model.addRow(new Object[]{"", ""});
    }
 
}
