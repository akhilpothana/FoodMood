/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Data;

//many extra imports
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

/**
 *
 * @author ELCHOCO
 */
public class InteractWithDB {
    private final String USER_AGENT = "Mozilla/5.0";
    private static InteractWithDB iwdb;

    public InteractWithDB() {
        //    iwdb = new InteractWithDB();
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


    public String sendGet() throws Exception {
        String rv; //return value
        String url = "http://foodmood.000webhostapp.com/pullFromServer.php";
        URL obj = new URL(url);
        HttpURLConnection con = (HttpURLConnection) obj.openConnection();
        // optional default is GET
        con.setRequestMethod("GET");
        //add request header
        con.setRequestProperty("User-Agent", USER_AGENT);
              int responseCode = con.getResponseCode();
        System.out.println("\nSending 'GET' request to URL : " + url);
        System.out.println("Response Code : " + responseCode);
        BufferedReader in = new BufferedReader(
            new InputStreamReader(con.getInputStream()));
        String inputLine;
        StringBuffer response = new StringBuffer();
        while ((inputLine = in.readLine()) != null) {
        response.append(inputLine);
        }
        in.close();
        //print result
        System.out.println(response.toString());
        rv = response.toString();

        return rv;
    }

    public void pullFoodMoodData() {
        try {
                    sendGet();
        } catch (Exception ex) {
                    Logger.getLogger(InteractWithDB.class.getName()).log(Level.SEVERE, null, ex);
        }
    } 
}
