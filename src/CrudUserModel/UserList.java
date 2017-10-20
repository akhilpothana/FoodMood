package CrudUserModel;

import java.util.ArrayList;

/**
 * This class maintains an ArrayList of all the registered users
 * This ArrayList contains objects of type User 
 * 
 */
public class UserList {
    
    private ArrayList<User> userList;
    
    public UserList()
    {
        userList = new ArrayList<>();
    }
    
    /**
     * 
     * @param u - The User object to be added to the UserList 
     */
    public void addUser(User u)
    {
        userList.add(u);
    }
    
    /**
     * 
     * @param u - The User object to be removed. The first instance of this object in this list is removed 
     */
    public void removeUser(User u)
    {
        userList.remove(u);
    }
    
    public ArrayList<User> getUserList()
    {
        return userList;
    }
    
}
