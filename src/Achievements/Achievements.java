/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Achievements;

/**
 *
 * @author mlh5614
 */
public class Achievements {
    Achievements ach1;  //the instance of the Achievements class (1 per user)
    String foodieLevel; //the user's status towards the food entry achievement
    String moodieLevel; //the user's status towards the mood entry achievement
    String loginStreak; //the number of days in a row a user has made at least one entry
    
    public Achievements()
    {
        foodieLevel = "new user";
        moodieLevel = "new user";
        loginStreak = "1 day";
    }
    
    public Achievements getAchievementInstance(){
        if (ach1 == null) {
            ach1 = new Achievements();
        }
        
        return ach1;
    }
    
    public String checkFoodieLevel()
    {
        int numFoodEntries; //this variable will be populated based on the number of foods entered
        
        numFoodEntries = 0; //put code to populate numFoodEntries here
        
        if (numFoodEntries == 0) {
            foodieLevel = "New Foodie";
        } 
        else if (numFoodEntries > 10) {
            foodieLevel = "Bronze Foodie";
        }
        else if (numFoodEntries > 100) {
            foodieLevel = "Silver Foodie";
        }
        else if (numFoodEntries > 1000) {
            foodieLevel = "Gold Foodie";
        }
           
        return foodieLevel;
    }
    
    public String checkMoodieLevel()
    {
        int numMoodEntries; //this variable will be populated based on the number of moods entered
        
        numMoodEntries = 0; //put ucode to populate numMoodEntries here
        
        if (numMoodEntries == 0) {
            moodieLevel = "New Moodie";
        } 
        else if (numMoodEntries > 10) {
            moodieLevel = "Bronze Moodie";
        }
        else if (numMoodEntries > 100) {
            moodieLevel = "Silver Moodie";
        }
        else if (numMoodEntries > 1000) {
            moodieLevel = "Gold Moodie";
        }
            
        return moodieLevel;
    }
    
    public String checkStreak()
    {
        int daysInARow; //this variable will be populated based on timestamps once the database or gson is setup
        
        daysInARow = 1; //put code to populate daysInARow here
        
        loginStreak = Integer.toString(daysInARow) + " Days";
        
        return loginStreak;
    }
    
}
