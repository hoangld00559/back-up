/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package collectionexample1;

import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

/**
 *
 * @author MyPC
 */
public class TestClass {

    public static void main(String[] args) {
        
//        LinkedList a = new LinkedList();
//        a.add("con ga");
//        a.add("con lon");
//        a.add("con cho");
//        a.add("con trau");
//        Iterator k = a.iterator();
//        
//        while(k.hasNext()){
//            System.out.println(k.next());
//        }
//       
//        Collections.sort(a);
//        System.out.println(a.get(3));
//        Stack a = new Stack();
//        a.push("linh hieu");
//        a.push("con ga");
//        a.push("con nguoi");
//        a.push("do vat");
//        System.out.println(a.size());
//        System.out.println(a);
//        System.out.println(a.empty());
//        System.out.println(a.search("con ga"));
//        System.out.println(a.peek());
//        System.out.println(a.pop());
//        System.out.println(a);
//        System.out.println();
//        ArrayList b = new ArrayList();
//        b.add("fe");
//        b.add(1);
//        System.out.println(b);
//          Vector v = new Vector();
//          System.out.println("Capacity of v = " + v.capacity());
//          System.out.println("size of v = " + v.size());
//          v.addElement(10);
//          v.addElement(10.75f);
//          System.out.println(v);
//          v.add(1, "A");
//          System.out.println(v);
//          Object obj = v.remove(1);
//          System.out.println(obj);
//          v.remove("A");
//          System.out.println(v);
//          HashSet hs = new HashSet();
//          hs.add(2);
//          hs.add(534324);
//          hs.add(31);
//          hs.add(null);
//          hs.add(188);
//          System.out.println(hs);
//          System.out.println(hs.size());
//          Iterator i = hs.iterator();
//          while(i.hasNext()){
//              System.out.println(i.next());
//          }
//        LinkedHashSet lhs = new LinkedHashSet();
//        lhs.add("con bo");
//        lhs.add("con trau");
//        lhs.add(1);
//        lhs.add("con nguoi");
//        System.out.println(lhs.size());
//        System.out.println(lhs);
//        Iterator i = lhs.iterator();
//        System.out.println("Forward Direction");
//
//        while (i.hasNext()) {
//            System.out.println(i.next());
//        }
//        HashMap<Integer,String> hm = new HashMap<>(); 
//        hm.put(5, "nghich");
//        hm.put(112, "deo");
//        hm.put(231, "zen");
//        hm.put(323, "porter");
//        hm.put(0, "piter");
//        hm.put(9999, "sdfsdf");
//        System.out.println(hm);
//        for (Map.Entry m : hm.entrySet()) {
//            System.out.println(m.getKey() + " " + m.getValue());
//            
//        }

//        TreeMap<Integer, String> tm = new TreeMap<>();
//        tm.put(1, "Deo");
//        tm.put(2, "xen");
//        tm.put(5, "piter");
//        tm.put(3, "fad");
//        tm.put(0, "dfd");
//        for(Map.Entry m: tm.entrySet()){
//            System.out.println(m.getKey()+ " " + m.getValue());
//        }
        Queue queueA = new LinkedList();

        queueA.add("element 1");
        queueA.add("element 2");
        queueA.add("element 3");

        Deque dequeA = new LinkedList();

        dequeA.add("element 1"); //add element at tail
        dequeA.addFirst("element 2"); //add element at head
        dequeA.addLast("element 3"); //add element at tail

        Stack stack = new Stack();

        stack.push("1");
        stack.push("2");
        stack.push("3");
        
        int index = stack.search("3");     //index = 1

    }

}
