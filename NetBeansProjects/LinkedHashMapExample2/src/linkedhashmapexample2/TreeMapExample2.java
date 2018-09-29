/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package linkedhashmapexample2;

import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

/**
 *
 * @author MyPC
 */
public class TreeMapExample2 {
    public static void main(String args[]){
    // init treeMap
    Map<String, Student> treeMap = new TreeMap<String, Student>();
    // add elements to treeMap
    treeMap.put("1", new Student("A", 12, "Hanoi"));
    treeMap.put("3", new Student("C", 13, "Hanoi"));
    treeMap.put("2", null);
    treeMap.put("4", new Student("D", 14, "Hanoi"));
    treeMap.put("5", null);
    // show treeMap
    show(treeMap);
    }
    
    public static void show(Map<String, Student> map){
        Set<String> keySet = map.keySet();
        for(String key : keySet){
            System.out.println(key + " " + map.get(key));
        }
    }
}
