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
        
        mainUI = new MainMenuUI(this);
        mainUI.setLocationRelativeTo(null);
        mainUI.setVisible(true);       
    }
    
    public void getJTableData(){
        
        for(int i = 0; i < 4; i++)
        {
            System.out.println((String) mainUI.getTable().getValueAt(i,0));
            System.out.println((String) mainUI.getTable().getValueAt(i,1));
        }       
    }
 
}
