/**
 * This class handles creating, reading, updating or deleting a mood entry.
 * There is no View class because these different actions will take place 
 * across the application and not within a single UI.
 */
package CrudMoodController;

import CrudMoodModel.MoodList;

/**
 *
 * @author Akhil
 */
public class CRUDMoodController {
    
    private String mood;
    private MoodList cmm;
    
    public CRUDMoodController(String m)
    {
        mood = m;
        cmm = new MoodList(m);
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
