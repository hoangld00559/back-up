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
public class Baitap6 {
    public static void main(String[] args){
        System.out.print("Nhap n= ");
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int i = 0;
        while(i <=n){
            if(Baitap4.laNguyento(i)){
                System.out.print(i + "  ");
            }
            i++;
        }
    }
}
