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
public class People {
    private String id;
    private String ten;
    private int tuoi;
    private String diaChi;
    private String gioiTinh;
    private int namSinh;

    public People() {
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public int getTuoi() {
        return tuoi;
    }

    public void setTuoi(int tuoi) {
        this.tuoi = tuoi;
    }

    public String getDiaChi() {
        return diaChi;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }

    public String getGioiTinh() {
        return gioiTinh;
    }

    public void setGioiTinh(String gioiTinh) {
        this.gioiTinh = gioiTinh;
    }

    public int getNamSinh() {
        return namSinh;
    }

    public void setNamSinh(int namSinh) {
        this.namSinh = namSinh;
    }
    
    public void input(){
        Scanner input = new Scanner(System.in);
        System.out.println("Nhập Id: ");
        id = input.nextLine();
        System.out.println("Nhập tên: ");
        ten = input.nextLine();
        System.out.println("Nhập tuổi: ");
        tuoi = input.nextInt();
        input.nextLine();
        System.out.println("Nhập địa chỉ: ");
        diaChi = input.nextLine();
        System.out.println("Nhập giới tính: ");
        gioiTinh = input.nextLine();
        System.out.println("Nhập năm sinh: ");
        namSinh = input.nextInt();
        input.nextLine();
    }
    
    public void showInfo(){
        System.out.println("Id :" + id + ", Tên: " + ten + ", Tuổi: " + tuoi + ", Địa chỉ: " + diaChi + ", Giới tính: " + gioiTinh + ", Năm sinh: " + namSinh);
    }
}
