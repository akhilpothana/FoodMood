/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CrudMoodModel;

/**
 *
 * @author Akhil
 */
public class MoodList {
    //FIELDS
    private String mood;
    
    //CONSTRUCTOR
    public MoodList(String m)
    {
        mood = m;  
    }

    //METHODS
    /**
     * @return the mood
     */
    public String getMood() {
        return mood;
    }

    /**
     * @param mood the mood to set
     */
    public void setMood(String mood) {
        this.mood = mood;
    }
    
}
