package HistoryController;

import CrudFoodModel.FoodList;
import CrudMoodModel.MoodList;
import HistoryView.FoodMoodHistory_view;
import javax.swing.table.TableModel;

/**
 *
 * @author Akhil
 */
public class FoodMoodHistory_control {
    
    private FoodList food;
    private MoodList mood;
    
    FoodMoodHistory_view historyView;
    
    TableModel tableModel;

    FoodMoodHistory_control()
    {
        historyView = new FoodMoodHistory_view(tableModel); 
        food = new FoodList();
        mood = new MoodList();
    }

    /**
     * @return the food
     */
    public FoodList getFood() {
        return food;
    }

    /**
     * @return the mood
     */
    public MoodList getMood() {
        return mood;
    }
    
    /**
     * 
     * @param f receives a new food entry and puts it in the arrayList 
     * @param m receives a new mood entry and puts it in the arrayList
     */
    public void addToHistory(String f, String m)
    {
        food.getFoodList().add(f);
        mood.getMoodList().add(m);
    }
    
    /**
     * 
     * @param f receives a new food entry and removes it from in the arrayList
     * @param m receives a new mood entry and removes it from in the arrayList
     */
    public void removeFromHistory(String f, String m)
    {
        food.getFoodList().remove(f);
        mood.getMoodList().remove(m);
    }
}
