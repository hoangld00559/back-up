/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package copyfilebyte;

import java.util.ArrayList;

public class ArrayListExample3 {

    public static void main(String[] args) {
        // Create list
        ArrayList<String> list = new ArrayList<String>();
        // Add objects to list
        list.add("Java");
        list.add("C++");
        list.add("PHP");
        list.add("Java");
        
        // addAll()
        ArrayList<String> listA = new ArrayList<String>();
        listA.addAll(list);
        System.out.print("listA: ");
        showList(listA);
        
        // retainAll() listA
        ArrayList<String> listB = new ArrayList<String>();
        listB.add("Java");
        listA.retainAll(listB);
        System.out.print("listA: ");
        showList(listA);
        
        // removeAll() listA
        list.removeAll(listA);
        System.out.print("listA: ");
        showList(list);
    }
    
    public static void showList(ArrayList<String> list){
        // Show list through for-each
        for(String obj: list){
            System.out.print("\t" + obj + ", ");
        }
        System.out.println();
    }
}
