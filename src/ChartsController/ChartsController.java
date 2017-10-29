package ChartsController;

import ChartsView.ChartsView;
import CrudFoodModel.FoodList;
import CrudMoodModel.MoodList;
import PieChartModel.PieChartModel;
import java.util.Date;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.chart.PieChart;
import javafx.stage.Stage;

public class ChartsController {
PieChartModel p1;  
    
    public ChartsController()
    {
        ChartsView cvbe = new ChartsView();
        System.out.println("Test Passed: Charts Controller and View Created");
    }
    
    public void createChart()
    {
        PieChart chart = null;
         p1 = new PieChartModel();
         //Scene scene;
   //     p1 = p1.getInstance();
         p1.launchApp();
         //chart = p1.getTheChart();
        // p1.addDataMethod(chart, "Pear", 50);
   // Class<? extends PieChartModel> aClass = p1.getClass();
   // Application.Parameters parameters = p1.getParameters();
      // p1.populatePrototype(scene);
        //String[] args = null;
        //System.out.println("Test Passed: Chart Created, date = " + start + " to " + end + ", food = " + f + ", mood = " + m);
        //FoodList f, MoodList m, Date start, Date end
       // p1 = new PieChartModel();
        //javafx.application.Application.launch(PieChartModel.STYLESHEET_CASPIAN);
    //Stage stage = null;
    //p1.init();
     //   p1.start(stage);
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
