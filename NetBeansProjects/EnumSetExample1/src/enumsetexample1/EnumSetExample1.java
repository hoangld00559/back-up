/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package enumsetexample1;

import java.util.EnumSet;
import java.util.Iterator;
import java.util.Set;

/**
 *
 * @author MyPC
 */

enum days {
    SUNDAY, MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY
}
public class EnumSetExample1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Set<days> set = EnumSet.of(days.MONDAY, days.TUESDAY, days.WEDNESDAY);
        // traversing elements
        Iterator<days> iter = set.iterator();
        while(iter.hasNext()){
            System.out.println(iter.next());
        }
    }
    
}
