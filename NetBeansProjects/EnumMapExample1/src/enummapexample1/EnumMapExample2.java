/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package enummapexample1;

import java.util.EnumMap;
import java.util.Map;

public class EnumMapExample2 {

    public enum Key {
        One, Two, Three, Four
    }
    
    public static void main(String args[]){
        //init enumMap
        EnumMap<Key, Student> enumMap = new EnumMap<Key, Student>(Key.class);
        // add elements to enumMap
        enumMap.put(Key.One, new Student("A", 12, "Hanoi"));
        enumMap.put(Key.Two, new Student("B", 13, "Hanoi"));
        enumMap.put(Key.Three, new Student("C", 15, "Hanoi"));
        enumMap.put(Key.Four, new Student("D", 14, "Hanoi"));
        //show enumMap
        for(Map.Entry<Key, Student> map : enumMap.entrySet()){
            System.out.println(map.getKey() + " " + map.getValue());
        }
    }
}
