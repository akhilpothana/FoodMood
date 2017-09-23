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
    FoodMoodHistory_model fmhModel;
    FoodMoodHistory_view fmhView;
    
    /**
     * 
     * @param v - the passed instance of the view class
     * @param f - received value for food
     * @param m - received value for mood
     */
    FoodMoodHistory_control(FoodMoodHistory_view v, String f, String m)
    {
        food = f;
        mood = m;
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
        fmhModel.getFoodList().add(f);
        fmhModel.getMoodList().add(m);
    }
    
    /**
     * 
     * @param f receives a new food entry and removes it from in the arrayList
     * @param m receives a new mood entry and removes it from in the arrayList
     */
    public void removeFromHistory(String f, String m)
    {
        fmhModel.getFoodList().remove(f);
        fmhModel.getMoodList().remove(m);
    }
}
