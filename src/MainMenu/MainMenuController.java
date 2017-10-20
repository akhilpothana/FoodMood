package MainMenu;

/**
 *
 * @author akhil
 */
public class MainMenuController {
    
    MainMenuUI mainUI;
    
    public MainMenuController()
    {
        mainUI = new MainMenuUI();
        mainUI.setLocationRelativeTo(null);
        mainUI.setVisible(true);       
    }
 
}
