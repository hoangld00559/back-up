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
public class InTungKyTuTrongChuoi {
    public static void main(String[] args){
        
        String s;
        Scanner sc = new Scanner(System.in);
        System.out.println("Ban hay nhap gia tri cho chuoi: ");
        s = sc.nextLine();
        for(int i = 0; i < s.length(); i ++){
            System.out.println(s.charAt(i));
        }
    }
}
