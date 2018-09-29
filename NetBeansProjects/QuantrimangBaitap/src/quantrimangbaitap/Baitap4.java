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
public class Baitap4 {
    public static int nhap(){
        Scanner input = new Scanner(System.in);
        boolean check = false;
        int n = 0;
        while(!check){
            System.out.print(" ");
            try {
                n = input.nextInt();
                check = true;
            }catch(Exception e){
                System.out.println("Ban phai nhap so! hay nhap lai ...");
                input.nextLine();
            }
        }
        return (n);
    }
    
    public static boolean laNguyento(int a){
        boolean n = true;
        for(int i = 2; i <= a/2; i ++){
            if(a%i == 0) n = false;
        }
        return n;
    }
    
    public static void phanTich(int n){
        int i = 2;
        while(n > 1){
            if(laNguyento(i)){
                if(n%i == 0){
                    n/=i;
                    if(n == 1) System.out.println(i + "    ");
                    else System.out.print(i + " * ");                    
                }
                else i++;
            }
            else i++;
        }
    }
    
    public static void main(String[] args){
        
        System.out.println("Nhap n");
        int n = nhap();
        System.out.print("n = ");
        phanTich(n);

    }
}


