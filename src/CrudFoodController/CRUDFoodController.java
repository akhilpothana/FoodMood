/*
 * This class handles creating, reading, updating or deleting a food entry.
 * There is no View class because these different actions will take place 
 * across the application and not within a single UI.
 */
package CrudFoodController;

import CrudFoodModel.FoodList;

/**
 *
 * @author Akhil
 */
public class CRUDFoodController {

    private FoodList cfm;
    
    public CRUDFoodController()
    {
        cfm = new FoodList();
    }
}
