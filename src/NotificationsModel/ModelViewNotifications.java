/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package NotificationsModel;
//import userprofilemodel.User;

import CrudUserModel.CrudUserModel;


/**
 * This class correspond to the Model within the MVC structure. This is where the data of this use case
 * Functionality will be stored and reused.
 * @author edgardoreinoso
 */
public class ModelViewNotifications {
// FIELD
    private CrudUserModel usernameID;
    private CrudUserModel userEmail; //assumingt that there would be a string class with email inside the User class
    private boolean emailFrequency;
    
    /**
     * This is the default constructor for the ModelViewNotifications class
     */
    public ModelViewNotifications(){
    
    }

// METHOD
    /**
     * This method will return the email that was set in the setUserEmail
     * @return the userEmail
     */
    public CrudUserModel getUserEmail() {
        System.out.println("Test get user email");
        return userEmail;
    }

    /**
     * This method will set the user email that this use case is going to use in order to send messages
     * It is got from the User class.
     * @param userEmail the userEmail to set
     */
    public void setUserEmail(CrudUserModel userEmail) {
        this.userEmail = userEmail;
    }
    
    /**
     * This class is going to return the boolean value that was set in the setEmailFrequency class
     * @return the emailFrequency
     */
    public boolean isEmailFrequency() {
        System.out.println("Test email frequency");
        return emailFrequency;
    }

    /**
     * This class is going to set to true of the email frequency is set to daily
     * @param emailFrequency the emailFrequency to set
     */
    public void setEmailFrequency(boolean emailFrequency) {
        this.emailFrequency = emailFrequency;
    }
}
