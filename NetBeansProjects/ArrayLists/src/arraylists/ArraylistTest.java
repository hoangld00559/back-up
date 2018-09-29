/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arraylists;

/**
 *
 * @author MyPC
 */
import java.util.ArrayList;
import java.util.Iterator;
public class ArraylistTest {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ArrayList listTest = new ArrayList();
        
        listTest.add("first item");
        listTest.add("second item");
        listTest.add("third item");
        listTest.add(7);
        
        Iterator it = listTest.iterator();
        
        while(it.hasNext()){
            System.out.println(it.next());
        }
        
        // Remove an item from the list
        listTest.remove("second item");
        
        //print out the new list
        System.out.println("Whole list=" + listTest);
        
        //get the item at index possion 1
        System.out.println("Possiton 1 = " + listTest.get(1));
    }
    
}
