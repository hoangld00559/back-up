/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package collectionsexample;

import java.io.FileWriter;
import java.util.Properties;

/**
 *
 * @author MyPC
 */
public class PropertiesExample3 {
    public static void main(String[] args) throws Exception{
        // create properties object
        Properties properties = new Properties();
        // add property into propertiess object
        properties.setProperty("user", "admin");
        properties.setProperty("password", "admin123");
        // write properties to a file
        properties.store(new FileWriter("info.properties"), "Comment here");
    }
}
