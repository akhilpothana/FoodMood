package CrudUserModel;

/**
 *This is the User where user profile data will be held and retrieved from
 * 
 * @author Shawn
 */
public class User {
    private String username, password, firstName, lastName, email;

    /**
     * This is the default constructor for CrudUserModel
     */
    public User(String name, String pass){
        this.password = pass;
        this.firstName = name;
    }
//    Ed's change
//    public User(String user, String name, String last, String emailAddress){
//        this.password = pass;
//        this.firstName = name;
//        this.lastName = last;
//        this.email = emailAddress;
//        this.username = user;
//    }

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
        return firstName;
    }

    public void setName(String name) {
        this.firstName = name;
    }
    
    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    
    public String toString(){
        return "User [first name: "+firstName+", last name: "+lastName+", email: "+email+", username: "+username+" ]";
    }
}
