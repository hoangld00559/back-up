/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package regularexpresstioon;

import java.util.regex.Pattern;

/**
 *
 * @author MyPC
 */
public class RegexExample3 {
    public static void main(String [] args){
        System.out.println(Pattern.matches("[amn]", "abcd"));// not a or m or n
        System.out.println(Pattern.matches("amn", "a"));// true among a or m or n
        System.out.println(Pattern.matches("[amn]", "ammmna"));//false m and a comes more than one
    }
}
