/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Login;

import CrudUserModel.User;
import CrudUserModel.UserList;
import javax.swing.JFrame;

/**
 *
 * @author akhil
 */
public class LoginController {
    LoginUI loginView;
    UserList userList;
    User user1, user2, user3, user4;
    
    //Model: userlist, user, loginModel, serialized collection class
    
    public LoginController() {
        System.out.println("Test: made it login controller; Passed!:) Good job Max");
        loginView = new LoginUI(this);
        loginView.setTitle("FoodMood");
        loginView.setLocationRelativeTo(null);
        loginView.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        loginView.setVisible(true);  
        
        userList = new UserList();
        
        //Creating a list of sample users and adding them to the UserList
        user1 = new User("ed", "bubbles");
        user2 = new User("max", "trees");
        user3 = new User("akhil", "onions");
        user4 = new User("shawn", "password");
        userList.addUser(user1);
        userList.addUser(user2);
        userList.addUser(user3);
        userList.addUser(user4);

    }
    
    /**
     * 
     * @param user - The entered username value
     * @param pass - The entered password value
     * @return - Whether or not the user has been successfully authenticated
     */
    public void validateUser(String user, String pass)
    {
        for(int i = 0; i < userList.getUserList().size(); i++)
        {
            if(user.equals(userList.getUserList().get(i).getUsername()) && pass.equals(userList.getUserList().get(i).getPassword()))
            {
                System.out.println("Successfully logged in " +  userList.getUserList().get(i).getUsername());
                break;
            }
            else if(i == userList.getUserList().size()-1)
            {
                System.out.println("Invalid username or password");
            }
        }
    }
}
