package TestHarness;

import ChartsController.ChartsController;
import StatsController.StatsController;

/**
 * Use Cases: Charts on Analysis app and Stats (Dashboard) on Mobile app
 * Each of these use cases has a view and a controller
 * The controller sends and retrieves values from the database for the view
 * @author mlh5614 
 */
public class FoodMoodMaxController {
    /**
     * Fields
     * Classes
     */
    private ChartsController ccbe;
    private StatsController sc1;
    
    public FoodMoodMaxController(){
        ccbe = new ChartsController();
        sc1 = new StatsController();
        
        testStats(sc1);
        testCharts(ccbe);
    }
    
    public void testStats(StatsController sc1)
    {
        sc1.createDashboard();
        sc1.deleteStats();
        sc1.reorganizeDashboard(1, 2); //move the object in position 1 to position 2
        sc1.refreshView();
    }
    
    public void testCharts(ChartsController ccbe)
    {
        ccbe.createChart();
        ccbe.deleteChart(null, null, null, null);
        ccbe.updateChart(null, null, null, null);
        ccbe.refreshView();
    }
    
}
