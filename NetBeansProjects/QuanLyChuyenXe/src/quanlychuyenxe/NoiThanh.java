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
public class NoiThanh extends ChuyenXe {
    private double SoKm;
    private String SoTuyen;
    Scanner in = new Scanner(System.in);

    public double getSoKm() {
        return SoKm;
    }

    public void setSoKm(double SoKm) {
        this.SoKm = SoKm;
    }

    public String getSoTuyen() {
        return SoTuyen;
    }

    public void setSoTuyen(String SoTuyen) {
        this.SoTuyen = SoTuyen;
    }
    
    public NoiThanh(){
        super();
        this.SoTuyen = "";
        this.SoKm = 0;
    }
    
    public NoiThanh(String ma, String name, String sx, double dt, String st, double skm){
        super(ma, name, sx, dt);
        this.SoTuyen = st;
        this.SoKm = skm;
    }
    
    @Override
    public void nhap(){
        super.nhap();
        System.out.println("Nhap So Tuyen: ");
        this.SoTuyen = in.nextLine();
        System.out.println("So Km: ");
        this.SoKm = in.nextDouble();
    }

    @Override
    public String toString() {
        return "Chuyen xe noi thanh " + super.toString()
                + "\n So Tuyen: " + this.SoTuyen + "\nSo Km: "
                + this.SoKm + "\nDoanh Thu: " + this.DoanhThu;
    }
    
    
}
