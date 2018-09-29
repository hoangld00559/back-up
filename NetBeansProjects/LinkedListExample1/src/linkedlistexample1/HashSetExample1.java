/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package linkedlistexample1;

import java.util.HashSet;
import java.util.Set;

/**
 *
 * @author MyPC
 */
public class HashSetExample1 {
    public static void main(String[] args){
        // init set object
        Set<String> set = new HashSet<String>();
        set.add("Java");
        set.add("C++");
        set.add("Java");
        set.add("PHP");
        // show set
        for(String str : set){
            System.out.println(str);
        }
    }
}
