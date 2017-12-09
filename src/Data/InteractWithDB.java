/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Data;

//many extra imports
import CrudFoodModel.FoodList;
import CrudMoodModel.MoodList;
import java.io.IOException;
import java.io.PrintStream;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import javax.swing.table.DefaultTableModel;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

/**
 *
 * @author ELCHOCO
 */
public class InteractWithDB {
    private final String USER_AGENT = "Mozilla/5.0";
    private static InteractWithDB iwdb;
    private static FoodList fl1;
    private static MoodList ml1;

    public InteractWithDB() {
        
    }

    public static InteractWithDB getIWDB() {
        if (iwdb == null) {
            iwdb = new InteractWithDB();
        }
        return iwdb;
    }

    public void uploadFoodMood(String food1, String mood1) {
        try {
            // open a connection to the site
            URL url = new URL("http://foodmood.000webhostapp.com/postFoodMood2.php");
            URLConnection con = url.openConnection();
            // activate the output
            con.setDoOutput(true);
            PrintStream ps = new PrintStream(con.getOutputStream());
            // send your parameters to your site
            ps.print("food="+food1);
            ps.print("&mood="+mood1);

            // we have to get the input stream in order to actually send the request
            con.getInputStream();

            // close the print stream
            ps.close();
        } catch (MalformedURLException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    
    public void uploadNewUser(String firstName, String lastName, String emailAddress, String username, String password){
        System.out.println("email: "+emailAddress+"\nusername: "+username+"\npassword: "+password);
        try {
            // open a connection to the site
            URL url = new URL("http://foodmood.000webhostapp.com/postNewUser.php");
            URLConnection con = url.openConnection();
            // activate the output
            con.setDoOutput(true);
            PrintStream ps = new PrintStream(con.getOutputStream());
            // send your parameters to your site
            ps.print("firstName="+firstName);
            ps.print("&lastName="+lastName);
            ps.print("&emailAddress="+emailAddress);
            ps.print("&username="+username);
            ps.print("&password="+password);
            // we have to get the input stream in order to actually send the request
            con.getInputStream();

            // close the print stream
            ps.close();
        } catch (MalformedURLException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public String sendGet() throws Exception {
        //Fields
        String rv; //return value
        String url = "http://foodmood.000webhostapp.com/pullFromServer.php";
        URL obj = new URL(url);
        HttpURLConnection con = (HttpURLConnection) obj.openConnection();
        con.setRequestMethod("GET");
        con.setRequestProperty("User-Agent", USER_AGENT);
        String inputLine;
        StringBuffer response = new StringBuffer();
        BufferedReader in = new BufferedReader(new InputStreamReader(con.getInputStream()));
        
        
        // optional default is GET
        
        //add request header
        
        int responseCode = con.getResponseCode();
        System.out.println("\nSending 'GET' request to URL : " + url);
        System.out.println("Response Code : " + responseCode);
        
        while ((inputLine = in.readLine()) != null) {
            response.append(inputLine);
        }
        in.close();
        //print result
        System.out.println(response.toString());
        rv = response.toString();

        //pullLists(rv);
        
        return rv;
    }
    
    public void populateLists(String jsonString) {
        try {
            JSONParser parser = new JSONParser();
            JSONArray jsonArray = (JSONArray) parser.parse(jsonString);
            //DefaultTableModel model = (DefaultTableModel)getJTable().getModel();
            String s1;
            String s2;
            fl1 = FoodList.getTheFoodList();
            fl1 = new FoodList(); //first instance
            ml1 = MoodList.getTheMoodList();
            ml1 = new MoodList(); //first instance
            
            //loop to iterate through all the data and popuate the table
            for(int i = 0; i < jsonArray.size(); i++) {
                JSONObject entry = (JSONObject) jsonArray.get(i);
                System.out.println(entry.get("food"));
                s1 = (String) entry.get("food");
                fl1.addFood(s1);
                System.out.println(entry.get("mood"));
                s2 = (String) entry.get("mood");
                ml1.addMood(s2);
                
              //  model.setValueAt(entry.get("food"), i, 0);
                //model.setValueAt(entry.get("mood"), i, 1);
                //model.setValueAt(entry.get("timestamp"), i, 2);
            }
            //ml1.getMoodList();
        } 
        catch (Exception ex) {
        	Logger.getLogger(InteractWithDB.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void pullFoodMoodData() {
        try {
            sendGet();
        } catch (Exception ex) {
            Logger.getLogger(InteractWithDB.class.getName()).log(Level.SEVERE, null, ex);
        }
    } 
}
