/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package enumsetexample1;

//enum days {

import java.util.EnumSet;
import java.util.Set;

//    SUNDAY, MONDAY, TUESDAY, WEDNESDAY, FRIDAY, SATURDAY
//}
public class EnumSetExample2 {
    public static void main(String[] args){
        Set<days> set1 = EnumSet.allOf(days.class);
        System.out.println("Week Days: " + set1);
        Set<days> set2 = EnumSet.noneOf(days.class);
        System.out.println("Week Days: " + set2);
    }
}
