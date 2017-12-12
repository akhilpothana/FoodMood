/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MainMenu;

import java.util.Timer;
import java.util.TimerTask;

/**
 *
 * @author Shawn
 */
public class MoodTimer {
    private MainMenuController mmc;
    Timer timer = new Timer();
    TimerTask task = new TimerTask(){
        @Override
        public void run(){
            mmc = MainMenuController.getMMC();
            mmc.moodNotification();
            
        }
       
    };
    
    public void start(){
        timer.schedule(task, 10*1000);
    }
    
}
