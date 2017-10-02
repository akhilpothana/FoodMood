/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package foodmood_v1;

import ChartsControllerBackend.ChartsControllerBackend;
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
    private ChartsControllerBackend ccbe;
    private StatsController sc1;
    
    public FoodMoodMaxController(){
        System.out.println("___________START OF OUTPUT FOR MAX'S TEST___________"); 
        ccbe = new ChartsControllerBackend();
        sc1 = new StatsController();
        
        testStats(sc1);
        testCharts(ccbe);
        System.out.println("___________END OF OUTPUT FOR MAX'S TEST___________\n"); 
    }
    
    public void testStats(StatsController sc1)
    {
        sc1.createDashboard();
        sc1.deleteStats();
        sc1.reorganizeDashboard(1, 2); //move the object in position 1 to position 2
        sc1.refreshView();
    }
    
    public void testCharts(ChartsControllerBackend ccbe)
    {
        ccbe.createChart(null, null, null, null);
        ccbe.deleteChart(null, null, null, null);
        ccbe.updateChart(null, null, null, null);
        ccbe.refreshView();
    }
    
}
