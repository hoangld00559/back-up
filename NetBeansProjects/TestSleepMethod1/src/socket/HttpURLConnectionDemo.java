/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package socket;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author MyPC
 */
public class HttpURLConnectionDemo {
    public static void main(String[] args) {
        try {
            URL url = new URL("http://www.javatpoint.com/java-tutorial");
            HttpURLConnection huc = (HttpURLConnection)url.openConnection();
            for(int i=1; i<8; i++){
                System.out.println(huc.getHeaderFieldKey(i)+ " = " +huc.getHeaderField(i));
                huc.disconnect();
            }
        } catch (MalformedURLException ex) {
            Logger.getLogger(HttpURLConnectionDemo.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(HttpURLConnectionDemo.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
