/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package collectionsexample;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 *
 * @author MyPC
 */
public class CollectionsExample {

    
    public static void main(String[] args) {
        // create list
        List<String> list = new ArrayList<String>();
        // add elements to list
        list.add("C++");
        list.add("Java");
        list.add("PHP");
        // print list
        System.out.println(list);
        
        // add element to list
        Collections.addAll(list, "Servlet", "JSP");
        // print list
        System.out.println(list);
        
        // create array of string
        String[] strArr = {"C#", ".Net"};
        // add elements to list
        Collections.addAll(list, strArr);
        // print list
        System.out.println(list);
    }
    
}
