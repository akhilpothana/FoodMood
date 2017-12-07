package CrudUserController;

import CrudUserView.CreateNewAccUI;
import Data.InteractWithDB;
import Login.LoginController;
import java.io.IOException;
import javax.swing.JFrame;

/**
 *This is the CrudUserController, where the application will manage all
 * processes concerning user profiles
 * 
 * @author Shawn
 */
public class CrudUserController {
    private InteractWithDB userDb;
    private CreateNewAccUI newAccView;
    private LoginController loginController;
    
    public CrudUserController(){
        System.out.println("Made it to CrudUserController");
        goToNewAccountView();
        if (userDb == null){
            setUserDb(new InteractWithDB());
        } else {
            System.out.println("CrudUserController: Database has been created already");
        }
    }
    
    public void goToNewAccountView(){
        newAccView = new CreateNewAccUI(this);
        newAccView.setTitle("FoodMood");
        newAccView.setLocationRelativeTo(null);
        newAccView.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        newAccView.setVisible(true);
    }
    
    public void goBackToLogin() throws IOException {
        loginController = new LoginController();
    }
    
    /**
     * @return the userDb
     */
    public InteractWithDB getUserDb() {
        return userDb;
    }

    /**
     * @param userDb the userDb to set
     */
    public void setUserDb(InteractWithDB userDb) {
        this.userDb = userDb;
    }
}
