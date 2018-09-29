/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tiendungcubai3;
import java.util.Scanner;

/**
 *
 * @author MyPC
 */
public class tiendungcubai3string {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Nhap vao 1 chuoi ky tu: ");
        String str = input.next();
        System.out.print("Ky tu can dem so lan xuat hien: ");
        char ch=(char) input.next().charAt(0);
        int count = 0;
        for(int i = 0; i < str.length(); i ++)
            if(ch == str.charAt(i)) count++;
        
        System.out.println("So lan xuat hien " + ch + ": " + count);
    }
    
    
}
