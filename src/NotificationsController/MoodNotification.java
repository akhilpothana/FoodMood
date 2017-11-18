/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package NotificationsController;

import java.util.Timer;
import java.util.TimerTask;
import javax.swing.JOptionPane;

/**
 *
 * @author Shawn
 */
public class MoodNotification {
     Timer timer = new Timer();
    TimerTask task = new TimerTask(){
        public void run(){
            JOptionPane.showMessageDialog(null,"You haven't logged any food" +
                    " for a while. Would you like to log some now?");
        }
    };
    
    public void start(){
        timer.schedule(task, 10*1000);
    }
    
}
