/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package NotificationsView;

import NotificationsController.ControlViewNotifications;


/**
 * This class correspond to the View within the MVC structure. This is where view of this use case
 * Functionality will be take place. Getting the data from the Model and main controls from the 
 * Control class.
 * @author edgardoreinoso
 */
public class ViewNotifications {
// FIELDS
    private ControlViewNotifications viewNotification_controller;
    private String messageSent;
    
    /**
     * This is the default constructor for the ViewNotifications class
     */
    public ViewNotifications(){
    
    }
    
    
// METHOD
    /**
     * This method will be built with the purpose of the getting the message sent from the model and send
     * it to the user.
     * @return the messageSent
     */
    public String getMessageSent() {
        return messageSent;
    }
    
    /**
    * This class is supposed to get the instance from the controller in this use case.
    * It would be crucial to get the controller since this how the information is going to be passed
    * To the front-end view
    * @return the viewNotification_controller
    */
    public ControlViewNotifications getViewNotification_controller() {
        return viewNotification_controller;
    }
}
