/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package linkedhashmapexample2;

import java.util.Hashtable;

/**
 *
 * @author MyPC
 */
public class HashTableExample2 {
    public static void main(String args[]){
        Hashtable<String, Student> hashMap = new Hashtable<String, Student>();
        // add elements to hashMap
        hashMap.put("1", new Student("A", 12, "Hanoi"));
        
    }
}
