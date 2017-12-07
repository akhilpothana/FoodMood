package CrudUserModel;

import Data.InteractWithDB;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * This class maintains an ArrayList of all the registered users
 * This ArrayList contains objects of type User 
 * 
 */
public class UserList {
//    private static FoodMoodLists fmls;
    private static InteractWithDB iwdb;
    private ArrayList<User> theUserListArray;
    String theJsonString;
    
    public UserList() {
        theUserListArray = new ArrayList<>();
        iwdb = new InteractWithDB();
    }

    /**
     * 
     * @param u - The User object to be removed. The first instance of this object in this list is removed 
     */
    public void removeUser(User u)
    {
        theUserListArray.remove(u);
    }
    
    /**
     * 
     * @param u - The User object to be added to the UserList 
     */
    public void addUser(User u){
        theUserListArray.add(u);
    }
    
    public ArrayList<User> getUserList()
    {
        if (theUserListArray == null) {
            theUserListArray = new ArrayList<>();
        }
        return theUserListArray;
    }
    
//    public void manipulateTheJsonString() {
//        String pickApart;
////        String testString = "[{\"id\":\"1\",\"food\":\"apple\",\"mood\":\"happy\",\"timestamp\":\"2017-12-02 14:06:42\"},{\"id\":\"2\",\"food\":\"corn\",\"mood\":\"corny\",\"timestamp\":\"2017-12-02 14:12:50\"}]";
//
//        pickApart = getTheJsonString();
//    }

//    public String getTheJsonString() {
//        try {
//            iwdb = InteractWithDB.getIWDB();
//            theJsonString = iwdb.sendGet();
//        } catch (Exception ex) {
//            Logger.getLogger(User.class.getName()).log(Level.SEVERE, null, ex);
//        }
//        return theJsonString;
//    }

/*    
    public static FoodMoodLists getFoodMoodLists() {
        if (fmls == null) {
            fmls = new FoodMoodLists();
        }
        return fmls;
    }
    public FoodMoodLists(){
        iwdb = new InteractWithDB();
        fmls = new FoodMoodLists();
    }
*/
}