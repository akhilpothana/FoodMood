package CrudUserModel;

import java.util.ArrayList;

/**
 * This class maintains an ArrayList of all the registered users
 * This ArrayList contains objects of type User 
 * 
 */
public class UserList {
    private User customers;
    private ArrayList<User> theUserListArray;
    
    public UserList()
    {
        theUserListArray = new ArrayList<>();
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
        return theUserListArray;
    }
    
}