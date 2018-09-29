/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package regularexpresstioon;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author MyPC
 */
public class RegexExample8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(true){
            System.out.println("Enter regex pattern: ");
            Pattern pattern = Pattern.compile(sc.nextLine());
            System.out.println("Enter text:");
            Matcher matcher = pattern.matcher(sc.nextLine());
            boolean found = false;
            while(matcher.find()){
                System.out.println("I found the text " + matcher.group() + " start at index"
                + matcher.start() + " and ending at index " + matcher.end());
                found = true;
            }
            if(!found){
                System.out.println("No match found");
            }
        }
    }
}
