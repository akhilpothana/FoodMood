package CrudMoodModel;

import java.util.ArrayList;

public class MoodList {
    //FIELDS
    private static ArrayList<String> mood;
    private static MoodList ml1;
    
    //CONSTRUCTOR
    public MoodList()
    {
        mood = new ArrayList<>();  
    }

    //METHODS
    /**
     * @return the historical mood data
     */
    public static MoodList getTheMoodList() {
        if (ml1 == null) {
            ml1 = new MoodList();
        }
        return ml1;
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
    
    public static ArrayList<String> getMoodList() {
        for (int i = 0; i < mood.size(); i++) {
            System.out.println("mood="+mood.get(i));
        }
        return mood;
    }
}
