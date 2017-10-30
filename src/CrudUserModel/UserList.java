package CrudUserModel;

import java.util.ArrayList;
import com.google.gson.Gson; 
import com.google.gson.GsonBuilder;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Iterator;



/**
 * This class maintains an ArrayList of all the registered users
 * This ArrayList contains objects of type User 
 * 
 */
public class UserList {
    private User customers;
    private ArrayList<User> theUserListArray;
    private File filename;
    private Gson gson;
    private JSONParser parser;
    private Object obj;
    //Output
    private PrintWriter output;
    //Reading
    private BufferedReader reader;
    private boolean validUser;
    
    
    public UserList() throws IOException
    {
        validUser = false;
        filename = new File("crud_user.json");
        if(filename.exists()==false){
            System.out.println("No file on the record, creating a new file");
            filename.createNewFile();
        }
        theUserListArray = new ArrayList<User>();
        gson = new GsonBuilder().create();
    }
    
//    public void addUser(String first, String last, String email, String username) throws IOException {
//        customers = new User(first, last, email, username);
//        theUserListArray.add(customers);
//        writeJSON(theUserListArray);
//    }
    
    public void writeJSON(ArrayList<User> theUserListArray) throws IOException {
        output = new PrintWriter(filename);
        output.append(gson.toJson(theUserListArray));
        output.close();
    }
    
//    public boolean authenticate(String username, String password) throws IOException{
//        try{
//            parser = new JSONParser();
//            obj = parser.parse(new FileReader("crud_user.json"));
//            JSONObject jsonObject = (JSONObject) obj;
//
//            Getting all the usernames to be in a JSONArray
//            JSONArray listOfUsers = (JSONArray) jsonObject.get("username");
//            Iterator<String> iterator = listOfUsers.iterator();
//            while(iterator.hasNext()){
//                System.out.println("User: " + iterator.next());
//            }
//        } catch (ParseException e){
//            e.printStackTrace();
//        }
//        return validUser;
//    }
    
    
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