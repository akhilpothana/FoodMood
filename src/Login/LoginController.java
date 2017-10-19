/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Login;

import javax.swing.JFrame;

/**
 *
 * @author akhil
 */
public class LoginController {
    LoginUI loginView;
    //Model: userlist, user, loginModel, serialized collection class
    
    public LoginController() {
        System.out.println("Test: made it login controller; Passed!:) Good job Max");
        loginView = new LoginUI(this);
        loginView.setTitle("FoodMood");
        loginView.setLocationRelativeTo(null);
        loginView.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        loginView.setVisible(true);
                
    }
}
