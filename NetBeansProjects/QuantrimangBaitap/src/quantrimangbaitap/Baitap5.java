/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quantrimangbaitap;
import java.util.Scanner;
/**
 *
 * @author MyPC
 */
public class Baitap5 {
    public static void main(String[] agrs){
        Scanner input = new Scanner(System.in);
        System.out.println("Nhap n= ");
        int n = input.nextInt();
        
        for(int i = 0; i < n; i ++){
            if(Baitap4.laNguyento(i)){
                System.out.print(i + "    ");
            }
        }
        
    }
    
}
