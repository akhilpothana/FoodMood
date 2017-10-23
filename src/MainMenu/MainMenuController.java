package MainMenu;

import CrudFoodModel.FoodList;
import CrudMoodModel.MoodList;

public class MainMenuController {
    
    MainMenuUI mainUI;
    
    //These will be the only instances of these class and will be 
    //passed around as necessary
    FoodList foodData;
    MoodList moodData;
    
    public MainMenuController()
    {
        foodData = new FoodList();
        moodData = new MoodList();
        
        mainUI = new MainMenuUI();
        mainUI.setLocationRelativeTo(null);
        mainUI.setVisible(true);       
    }
 
}
