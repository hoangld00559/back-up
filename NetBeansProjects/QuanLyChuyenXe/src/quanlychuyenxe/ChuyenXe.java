/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quanlychuyenxe;

import java.util.Scanner;

/**
 *
 * @author MyPC
 */
public class ChuyenXe {
    protected String Macx, NameTX, SoX;
    protected double DoanhThu;
    Scanner in = new Scanner(System.in);

    public String getMacx() {
        return Macx;
    }

    public void setMacx(String Macx) {
        this.Macx = Macx;
    }

    public String getNameTX() {
        return NameTX;
    }

    public void setNameTX(String NameTX) {
        this.NameTX = NameTX;
    }

    public double getDoanhThu() {
        return DoanhThu;
    }

    public void setDoanhThu(double DoanhThu) {
        this.DoanhThu = DoanhThu;
    }
    
    public String getSoX() {
        return SoX;
    }

    public void setSoX(String SoX) {
        this.SoX = SoX;
    }
    
    protected ChuyenXe(){
        this.Macx = "";
        this.NameTX = "";
        this.SoX = "";
        this.DoanhThu = 0;
    }
    
    protected ChuyenXe(String ma, String name, String sx, double dt){
        this.Macx = ma;
        this.NameTX = name;
        this.SoX = sx;
        this.DoanhThu = dt;
    }
    
    protected void nhap(){
        System.out.println("Nhap MaSo Chuyen: ");
        this.Macx = in.nextLine();
        System.out.println("Ho Ten Tai Xe: ");
        this.NameTX = in.nextLine();
        System.out.println("So Xe: ");
        this.SoX = in.nextLine();
        System.out.println("Doanh thu: ");
        this.DoanhThu = in.nextDouble();
    }
    
    

    @Override
    public String toString() {
        return "\nMS chuyen: " + this.Macx + "\nName Tai Xe" +
                this.NameTX + "\nSo Xe: " + this.SoX;
    }
}
