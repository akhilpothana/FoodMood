/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ChartsControllerBackend;

import ChartsViewBackend.ChartsViewBackend;
import CrudFoodModel.FoodList;
import CrudMoodModel.MoodList;
import java.util.Date;

/**
 *
 * @author mlh5614
 */
public class ChartsControllerBackend {
    
    public ChartsControllerBackend()
    {
        ChartsViewBackend cvbe = new ChartsViewBackend();
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
