/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package HistoryModel;

import java.util.ArrayList;

/**
 *
 * @author Akhil
 */
public class FoodMoodHistory_model {
    
    private ArrayList<String> foodList = new ArrayList<String>();
    private ArrayList<String> moodList = new ArrayList<String>();

    /**
     * @return the foodList
     */
    public ArrayList<String> getFoodList() {
        return foodList;
    }

    /**
     * @return the moodList
     */
    public ArrayList<String> getMoodList() {
        return moodList;
    }   
}
