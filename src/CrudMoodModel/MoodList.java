package CrudMoodModel;

import java.util.ArrayList;

public class MoodList {
    //FIELDS
    private static ArrayList<String> mood;
    
    //CONSTRUCTOR
    public MoodList()
    {
        mood = new ArrayList<>();  
    }

    //METHODS
    /**
     * @return the historical mood data
     */
    public static ArrayList<String> getMoodList() {
        return mood;
    }

    /**
     * @param mo - the mood to set
     */
    public void addMood(String mo) {
        mood.add(mo);
    }
    
    public void removeFood(int i)
    {
        mood.remove(i);
    }

    /**
     * @param i - the index at which the desired food is located
     * @return - the desired food
     */
    public String getMoodAt(int i) {
        return mood.get(i);
    }
    
}
