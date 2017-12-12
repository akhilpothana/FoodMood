/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MainMenu;

import java.util.Timer;
import java.util.TimerTask;
import MainMenu.MainMenuController;
import MainMenu.MainMenuUI;

/**
 *
 * @author Shawn
 */
public class IdleTimer {
    private MainMenuController mmc;
    private MainMenuUI menuUI;
    Timer timer = new Timer();
    TimerTask task = new TimerTask(){
        @Override
        public void run(){
            mmc = MainMenuController.getMMC();
            mmc.idleNotification();
        }
       
    };
    
    public void start(){
        timer.schedule(task, 24*60*60*1000);
    }
    
}
