/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package array;

import java.util.Scanner;

/**
 *
 * @author MyPC
 */
public class DemKyTuTrongChuoi {
    public static void main(String[] args){
        String s;
        Scanner sc = new Scanner(System.in);
        System.out.println("Ban hay nhap noi dung cho chuoi: ");
        s = sc.nextLine();
        System.out.println("Ban hay nhap ky tu: ");
        char c;
        c = sc.next().charAt(0);
        int count = 0;
        for(int i = 0; i < s.length(); i++){
            if(s.charAt(i) == c){
                count++;
            }
        }
        System.out.println("So lan xuat hien cua " + c + " la: " + count);
    }
    
}
