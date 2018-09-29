/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mapexample1;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Set;

/**
 *
 * @author MyPC
 */
public class HashMapExample1 {
    public static void main(String args[]){
        // init hashMap
        LinkedHashMap<Integer, String> linkedHashMap 
                = new LinkedHashMap<Integer, String>();
        // add elements to hashMap
        linkedHashMap .put(1, "Java");
        linkedHashMap .put(3, "C++");
        linkedHashMap .put(2, "PHP");
        linkedHashMap .put(4, "Python");
        // show hashMap
        show(linkedHashMap );
        // remove hashMap
        linkedHashMap .remove(2);
        //show hashMap after remove
        System.out.println("After remove: ");
        //show hashMap
        show(linkedHashMap );
    }
    
    public static void show(HashMap<Integer, String> hashMap){
        Set<Integer> keySet = hashMap.keySet();
        for(Integer key : keySet){
            System.out.println(key + " " + hashMap.get(key));
        }
    }
}
