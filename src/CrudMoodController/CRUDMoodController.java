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
    
    private MoodList cmm;
    
    public CRUDMoodController()
    {
        cmm = new MoodList();
    }
}
