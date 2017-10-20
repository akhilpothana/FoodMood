package CrudUserModel;

/**
 *This is the User where user profile data will be held and retrieved from
 * 
 * @author Shawn
 */
public class User {
    
     /**
     * username data
     */
    private String username;
    /**
     * password data string
     */
    private String password;
    
    private String name;

    /**
     * This is the default constructor for CrudUserModel
     */
    public User(String user, String pass){
        
        username = user;
        password = pass;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
    
    
}
