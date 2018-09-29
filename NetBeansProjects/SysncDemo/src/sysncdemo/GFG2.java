/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sysncdemo;

import java.util.ArrayList;
import java.util.List;

class Greek{
    String name = "";
    public int count = 0;
    
    public void greekName(String geek, List<String> list){
        // Only one thread is permitted
        // to change geek's name at a time.
        synchronized(this){
            name = geek;
            count ++; // how many threads change geek's name.
            
        }
        
        // All other threads are permitted
        // to add geek name into list.
        list.add(geek);
    }
}
public class GFG2 {
    public static void main(String[] args){
        Greek gk = new Greek();
        List<String> list = new ArrayList<String>();
        gk.greekName("hoang", list);
        System.out.println(gk.name);
        System.out.println(gk.count);
    }
}
