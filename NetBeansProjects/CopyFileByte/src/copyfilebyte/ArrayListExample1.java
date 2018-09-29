/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package copyfilebyte;

import java.util.ArrayList;
import java.util.Iterator;

/**
 *
 * @author MyPC
 */
public class ArrayListExample1 {
    public static void main(String args[]){
        // Creating arraylist
        ArrayList<String> list = new ArrayList<String>();
        // Add objects to arraylist
        list.add("Java");
        list.add("C++");
        list.add("PHP");
        list.add("Java");
        // Show list through Iterator
        Iterator<String> itr = list.iterator();
        while(itr.hasNext()){
            System.out.print(itr.next() + ", ");
        }
        // show list through for-each
        System.out.println();
        for(String abj:list){
            System.out.print(abj + ", ");
        }
        
        // Show list through index
        System.out.println();
        int size = list.size();
        for(int i=0; i <size; i++){
            System.out.print(list.get(i) + ", ");
        }
    }
}
