/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package parkmanager;

import java.util.Scanner;

/**
 *
 * @author MyPC
 */
public class Vehicle {
    private String nhaSanXuat;
    private String bienSoXe;
    private int namSanXuat;
    private String idSoHuu;
    private int chieuDai;
    private int chieuRong;
    
    public void input(){
        Scanner input = new Scanner(System.in);
        System.out.println("Nhập nhà sản xuất: ");
        nhaSanXuat = input.nextLine();
        System.out.println("Nhập biển số xe: ");
        bienSoXe = input.nextLine();
        System.out.println("Nhập năm sản xuất: ");
        namSanXuat = input.nextInt();
        input.nextLine();
        System.out.println("Nhập id sở hữu: ");
        idSoHuu = input.nextLine();
        System.out.println("Nhập chiều dài: ");
        chieuDai = input.nextInt();
        System.out.println("Nhập chiều rộng: ");
        chieuRong = input.nextInt();
    }
    
    public void showInfo(){
        System.out.println("Nhà sản xuất: " + nhaSanXuat + ", Biển số xe: " + bienSoXe
        + ", Năm sản xuất: " + namSanXuat + ", Id sở hữu: " + idSoHuu + ", Chiều dài: "
        + chieuDai + ", Chiều rộng: " + chieuRong);
    }
}
