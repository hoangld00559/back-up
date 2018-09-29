/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tiendungtcuOop;
import java.util.Scanner;
/**
 *
 * @author MyPC
 */
public class Oopbaitap1 {
    public static void main(String[] args){
        
        Scanner input = new Scanner(System.in);
        System.out.println("Moi nhap ban kinh hinh tron: ");
        HinhTron abc = new HinhTron(input.nextInt());
        System.out.println("Dien tich cua hinh tron: " + abc.getDienTich());
        System.out.println("Chu vi cua hinh tron: " + abc.getChuVi());
    }    
}
