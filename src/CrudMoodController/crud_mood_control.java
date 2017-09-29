/**
 * This class handles creating, reading, updating or deleting a mood entry.
 * There is no View class because these different actions will take place 
 * across the application and not within a single UI.
 */
package CrudMoodController;

import CrudMoodModel.crud_mood_model;

/**
 *
 * @author Akhil
 */
public class crud_mood_control {
    
    private String mood;
    private crud_mood_model cmm;
    
    public crud_mood_control(String m)
    {
        mood = m;
        cmm = new crud_mood_model(m);
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
