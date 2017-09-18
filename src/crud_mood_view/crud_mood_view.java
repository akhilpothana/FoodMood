/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package crud_mood_view;

import javax.swing.*;

/**
 *
 * @author Akhil
 */
public class crud_mood_view {  
    
    private JTextField tv;
    String mood;
    
    public crud_mood_view(String md)
    {
        tv = new JTextField(md);
    }

    /**
     * @return the tv
     */
    public JTextField getTv() {
        return tv;
    }

    /**
     * @param tv the tv to set
     */
    public void setTv(JTextField tv) {
        this.tv = tv;
    }
    
    String sendInfoToUI(String m)
    {
        return m;
    }
    
    
}
