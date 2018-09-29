/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package linkedhashmapexample2;

import java.util.LinkedHashMap;
import java.util.Set;

/**
 *
 * @author MyPC
 */
public class LinkedHashMapExample2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // init linkedHashMap
        LinkedHashMap<String, Student> linkedHashMap;
        linkedHashMap = new LinkedHashMap<String, Student>();
        // add elements to linkedHashMap
        linkedHashMap.put("1", new Student("A", 12, "Hanoi"));
        linkedHashMap.put(null, new Student("C", 13, "Hanoi"));
        linkedHashMap.put("2", null);
        linkedHashMap.put("4", new Student("D", 14, "Hanoi"));
                
        // show linkedHashMap
        show(linkedHashMap);
    }
    
    public static void show(LinkedHashMap<String, Student> linkedHashMap){
        Set<String> keySet = linkedHashMap.keySet();
        for (String key : keySet){
            System.out.println(key + " " + linkedHashMap.get(key));
        }
    }
}
