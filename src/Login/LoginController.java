/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Login;

import CrudUserModel.User;
import CrudUserModel.UserList;
import MainMenu.MainMenuController;
import java.io.FileNotFoundException;
import java.io.IOException;
import org.json.simple.parser.ParseException;
        
/**
 *
 * @author akhil
 */
public class LoginController {
    private LoginUI loginView;
    private CreateNewAccUI newAccView;
    //Opening the main menu upon successful login
    MainMenuController mainMenu;
    
    //User data
    private UserList theUserList;
    private boolean validUser;
    //To be deleted
    User user1, user2, user3, user4;
    
    public LoginController() throws IOException {
        System.out.println("Test: made it login controller");
        validUser = false;
        loginView = new LoginUI(this);
        
        loginUI();
        
        
        theUserList = new UserList();
        
        //Creating a list of sample users and adding them to the UserList
        user1 = new User("ed", "bubbles");
        user2 = new User("max", "trees");
        user3 = new User("akhil", "onions");
        user4 = new User("shawn", "password");
        theUserList.addUser(user1);
        theUserList.addUser(user2);
        theUserList.addUser(user3);
        theUserList.addUser(user4);
    }
    
    /**
     * 
     * @param user - The entered username value
     * @param pass - The entered password value
     * @return - Whether the credentials match with a registered user
     */
    public boolean validateUser(String user, String pass) {
        for(int i = 0; i < theUserList.getUserList().size(); i++)
        {
            if(user.equals(theUserList.getUserList().get(i).getUsername()) && pass.equals(theUserList.getUserList().get(i).getPassword()))
            {
                loginView.setVisible(false);
                return true;
            }
        }
        System.out.println("Incorrect username or password");
        return false;
    }

    public void createUserUI(){
        newAccView = new CreateNewAccUI(this);
        newAccView.setLocationRelativeTo(null);
        newAccView.setVisible(true);
    }
    
    public void loginUI(){
        loginView.setLocationRelativeTo(null);
        loginView.setVisible(true);
    }
    
//    public void createUserDb(String first, String last, String email, String username) throws IOException{
//        theUserList.addUser(first, last, email, username);
//    }
    
//    public void mainMenuUI(){
//        mainMenu = new MainMenuController();        
//    }
//    
//    //instant purposes this will be reader
//    public void authenticaUser(String username, String password) throws IOException, ParseException{
//        theUserList.authenticate(username, password);
//
//        validUser = theUserList.authenticate(username, password);
//        return validUser;
//    }
}
