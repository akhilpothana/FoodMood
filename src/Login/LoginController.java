package Login;

import CrudUserModel.User;
import CrudUserModel.UserList;
import MainMenu.MainMenuController;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.IOException;
import org.json.simple.parser.ParseException;
import java.io.File;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;

/**
 * This class handles logging in as well as creating new users
 * @author akhil
 */

public class LoginController {

    /**
     * @return the mainMenu
     */
    public MainMenuController getMainMenu() {
        return mainMenu;
    }
    
    private LoginUI loginView;
    private CreateNewAccUI newAccView;
    
    //Opening the main menu upon successful login
    private MainMenuController mainMenu;
    
    //User data
    private UserList theUserList;
    private boolean validUser;
    
    public LoginController() throws IOException {
        validUser = false;
        loginView = new LoginUI(this);
        newAccView = new CreateNewAccUI(this);
        showLoginUI();
    }
    
    /**
     * 
     * @param username - The entered username value
     * @param password - The entered password value
     * @return - Whether the credentials match with a registered user
     */
    public boolean validateUser(String username, String password) {
        try{
            File file = new File("src/users.txt");
            Scanner fileScanner = new Scanner(file);

            //Reading through the file line by line
            while(fileScanner.hasNextLine()) {
                String user = fileScanner.nextLine();
                String userData[] = user.split(";");

                if(username.equals(userData[0]) && password.equals(userData[4]))
                {
                    loginView.setVisible(false);
                    System.out.println("Logged in!");
                    return true;
                }
            }
            }catch(FileNotFoundException e) {
	        System.out.print("FileNotFoundException");
    	}
        return false;
    }

    public void toMainMenuUICntrl(){
        mainMenu = new MainMenuController();
    }
    
    public void createUserUI(){
        newAccView.setTitle("FoodMood");
        newAccView.setLocationRelativeTo(null);
        newAccView.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        newAccView.setVisible(true);
    }
    
    public void showLoginUI(){
        loginView.setTitle("FoodMood");
        loginView.setLocationRelativeTo(null);
        loginView.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        loginView.setVisible(true);
    }

    /**
     * Reading user profile data from the text file
     */
    public void readUserfromFile()
    {
        try{
            File file = new File("src/users.txt");
            Scanner fileScanner = new Scanner(file);

            while(fileScanner.hasNextLine()){
                String user = fileScanner.nextLine();
                String userData[] = user.split(";");
                System.out.println(userData[4]);
            }
            }catch(FileNotFoundException e) {
	        System.out.print("FileNotFoundException");
    	}
    }
    
    /**
     * This method is called when the user clicks on the "Sign Up" button in CreateNewAccUI
     * @param uname - username
     * @param fname - first name
     * @param lname - last name
     * @param email - email
     * @param password - password
     */
    public void writeUserToFile(String uname, String fname, String lname, String email, String password) {
        try
        {
            PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter("src/users.txt", true)));
            out.print(uname + ";");
            out.print(fname + ";");
            out.print(lname + ";");
            out.print(email + ";");
            out.print(password);
            out.println();
            out.close();
        }
        catch (FileNotFoundException e) {
        System.out.print("FileNotFoundException: ");
        System.out.println(e.getMessage());
        } 
        catch (IOException ex) {
        System.out.print("IOException");
        }    
    }
}
