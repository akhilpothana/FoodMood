package CrudFoodModel;

import java.util.ArrayList;

public class FoodList {
    
    //FIELDS
    private static ArrayList<String> foodList;
    private static FoodList fl1;
    
    //CONSTRUCTOR
    public FoodList()
    {
        foodList = new ArrayList<>();
    } 

    //METHODS
    /**
     * @return the the food at the given position in the list
     * @param pos - the index of the food being retrieved
     */
    public String getFoodAt(int pos) {
        return foodList.get(pos);
    }
    
    public static FoodList getTheFoodList() {
        if (fl1 == null) {
            fl1 = new FoodList();
        }
        return fl1;
    }
    
    /**
     *  @param f - the food to add to the list
     */
    public void addFood(String f)
    {
        foodList.add(f);
    }
    
    public void removeFood(String f)
    {
        foodList.remove(f);
    }

    public static ArrayList<String> getFoodList() {
        for (int i = 0; i < foodList.size(); i++) {
            System.out.println("food="+foodList.get(i));
        }
        return foodList;
    }
}
