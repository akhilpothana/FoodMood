/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package HistoryController;

import HistoryModel.FoodMoodHistory_model;
import HistoryView.FoodMoodHistory_view;

/**
 *
 * @author Akhil
 */
public class FoodMoodHistory_control {
    
    private String food;
    private String mood;
    FoodMoodHistory_model historyModel;
    FoodMoodHistory_view historyView;
    
    /**
     * 
     */
    public FoodMoodHistory_control()
    {
        historyModel = new FoodMoodHistory_model();
        historyView = new FoodMoodHistory_view();        
    }

    /**
     * @return the food
     */
    public String getFood() {
        return food;
    }

    /**
     * @return the mood
     */
    public String getMood() {
        return mood;
    }
    
    /**
     * 
     * @param f receives a new food entry and puts it in the arrayList 
     * @param m receives a new mood entry and puts it in the arrayList
     */
    public void addToHistory(String f, String m)
    {
        historyModel.getFoodList().add(f);
        historyModel.getMoodList().add(m);
    }
    
    /**
     * 
     * @param f receives a new food entry and removes it from in the arrayList
     * @param m receives a new mood entry and removes it from in the arrayList
     */
    public void removeFromHistory(String f, String m)
    {
        historyModel.getFoodList().remove(f);
        historyModel.getMoodList().remove(m);
    }
}
