/*
 * This class handles creating, reading, updating or deleting a food entry.
 * There is no View class because these different actions will take place 
 * across the application and not within a single UI.
 */
package CrudFoodController;

import CrudFoodModel.CRUDFoodModel;

/**
 *
 * @author Akhil
 */
public class CRUDFoodController {
    private String food;
    private CRUDFoodModel cfm;
    
    public CRUDFoodController(String f)
    {
        food = f;
        cfm = new CRUDFoodModel(f);
    }
    
    /**
     * @return the food
     */
    public String getFood() {
        return cfm.getFood();
    }

    /**
     * @param food the food to set, provided by user
     */
    public void setFood(String food) {
        cfm.setFood(food);
    }
    
    /**
     * 
     * Delete the food entry
     */
    public void deleteFood()
    {
        
    }
}
