/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package NotificationsController;
import NotificationsModel.ModelViewNotifications;
import NotificationsView.ViewNotifications;

/**
 * This class correspond to the View within the MVC structure. This is where view of this use case
 * Functionality will be take place. Getting the data from the Model and main controls from the 
 * Control class.
 * @author edgardoreinoso
 */
public class ControlViewNotifications {
// FIELDS
    private ModelViewNotifications viewNofitications_model;
    private ViewNotifications notifications_viewDisplay;
    
    /**
     * This is the default constructor for the ControlViewNotifications class
     */
    public ControlViewNotifications(){
    
    }
    
// METHOD
    /**
     * This class is going to return the model for the model notification use case
     * @return the viewNofitications_model
     */
    public ModelViewNotifications getViewNofitications_model() {
        return viewNofitications_model;
    }

    /**
     * This class is going to return the model for the view notification use case
     * @return the notifications_viewDisplay
     */
    public ViewNotifications getNotifications_viewDisplay() {
        return notifications_viewDisplay;
    }
}
