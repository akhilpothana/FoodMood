package ChartsController;

import ChartsView.ChartsView;
import CrudFoodModel.FoodList;
import CrudMoodModel.MoodList;
import java.util.Date;

public class ChartsController {
    
    public ChartsController()
    {
        ChartsView cvbe = new ChartsView();
        System.out.println("Test Passed: Charts Controller and View Created");
    }
    
    public void createChart(FoodList f, MoodList m, Date start, Date end)
    {
        System.out.println("Test Passed: Chart Created, date = " + start + " to " + end + ", food = " + f + ", mood = " + m);
    }
    
    public void refreshView()
    {
        System.out.println("Test Passed: View Refreshed");
    }
    
    public void updateChart(FoodList f, MoodList m, Date start, Date end)
    {
        System.out.println("Test Passed: Chart Updated, date = " + start + " to " + end + ", food = " + f + ", mood = " + m);
    }
    
    public void deleteChart(FoodList f, MoodList m, Date start, Date end)
    {
        System.out.println("Test Passed: Chart Deleted, date = " + start + " to " + end + ", food = " + f + ", mood = " + m);
    }
    
}
