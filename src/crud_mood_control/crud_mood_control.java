/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package crud_mood_control;

import crud_mood_model.crud_mood_model;
import crud_mood_view.crud_mood_view;

/**
 *
 * @author Akhil
 */
public class crud_mood_control {
    
    String mood;
    crud_mood_model cmm;
    crud_mood_view cmv;
    
    crud_mood_control(String m)
    {
        mood = m;
        cmm = new crud_mood_model(m);
        cmv = new crud_mood_view(m);
    }
    
    /**
     * @return the food
     */
    public String getMood() {
        return cmm.getMood();
    }

    /**
     * @param food the food to set, provided by user
     */
    public void setMood(String food) {
        cmm.setMood(food);
    }

    /**
     * 
     * @param mo stores the received value of the mood to be removed
     */
    public void deleteMood(String mo)
    {
        mo = cmm.getMood();
    }
}
