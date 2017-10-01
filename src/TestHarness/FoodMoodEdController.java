/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TestHarness;

import CorrelationController.ControllerFoodMoodCorrelation;
import CorrelationModel.ModelFoodMoodCorrelation;
import NotificationsController.ControlViewNotifications;
import NotificationsModel.ModelViewNotifications;

/**
 * Use Cases: View Notifications and View Food/Mood Correlations
 * Each of these use cases has a view and a controller
 * The controller sends and retrieves values from the database for the view
 * @author edgardoreinoso
 */
public class FoodMoodEdController {
    /**
     * Fields
     * Classes
     */
    private ControlViewNotifications controlNotificationHarness;
    private ModelViewNotifications modelNotificationHarness;
    private ControllerFoodMoodCorrelation controlCorrelationHarness;
    private ModelFoodMoodCorrelation modelCorrelationHarness;
    
    
    public FoodMoodEdController(){
        controlNotificationHarness = new ControlViewNotifications();
        modelNotificationHarness = new ModelViewNotifications();
        controlCorrelationHarness = new ControllerFoodMoodCorrelation();
        modelCorrelationHarness = new ModelFoodMoodCorrelation();
        
        TestViewNotifications();
        TestCorrelation();
    }
    
    /**
     * This method is going to test the View Notification use case
     * It is testing the control and the model of this specific use case
     */
    public void TestViewNotifications(){
        controlNotificationHarness.getNotifications_viewDisplay();
        controlNotificationHarness.getViewNofitications_model();
        modelNotificationHarness.isEmailFrequency();
        modelNotificationHarness.getUserEmail();
    }
    
    /**
     * This method is going to test the View Food/Mood Correlation use case
     * It is testing the control and the model of this specific use case
     */
    public void TestCorrelation(){
        controlCorrelationHarness.getFoodMoodCo_model();
        controlCorrelationHarness.getFoodMoodCo_view();
        modelCorrelationHarness.getMood();
        modelCorrelationHarness.getRecordFood();
        modelCorrelationHarness.getUsernameID();
    }
}
