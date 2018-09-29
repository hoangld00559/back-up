/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mapexample1;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 *
 * @author MyPC
 */
public class MapExample2 {
    public static void main(String[] args){
        //init map
        Map map = new HashMap();
        //add elements to map
        map.put(1, "Java");
        map.put(3, 2);
        map.put(2, "PHP");
        map.put(4, "Python");
        // show Map
        Set set = map.keySet();
        for(Object key: set){
            System.out.println(key + " " + map.get(key));
        }
    }
}
