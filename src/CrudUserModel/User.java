package CrudUserModel;

/**
 *This is the User where user profile data will be held and retrieved from
 * 
 * @author Shawn
 */
public class User {
    private String username, password, lastName, email;

    /**
     * This is the default constructor for CrudUserModel
     */
    public User(String name, String pass){
        this.username = name;
        this.password = pass;
        this.username = username;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
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
        return username;
    }

    public void setName(String name) {
        this.username = name;
    }
    
    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String toString(){
        return "User [first name: "+username+", last name: "+lastName+", email: "+email+", username: "+username+" ]";
    }
}
