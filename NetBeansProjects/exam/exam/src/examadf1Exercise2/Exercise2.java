/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examadf1Exercise2;
import java.util.StringTokenizer;
import java.util.Scanner;
/**
 *
 * @author MyPC
 */
public class Exercise2 {
    public static void main(String[] args){
        System.out.println("Enter a string: ");
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        StringTokenizer st = new StringTokenizer(input);
        System.out.println("Result: ");
        while(st.hasMoreTokens()){
            System.out.println(st.nextToken());
        }
    }
}
