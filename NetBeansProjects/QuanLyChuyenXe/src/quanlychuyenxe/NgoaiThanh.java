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
public class NgoaiThanh extends ChuyenXe{
    private String NoiDen;
    private int SoNgay;

    public String getNoiDen() {
        return NoiDen;
    }

    public void setNoiDen(String NoiDen) {
        this.NoiDen = NoiDen;
    }

    public int getSoNgay() {
        return SoNgay;
    }

    public void setSoNgay(int SoNgay) {
        this.SoNgay = SoNgay;
    }
    Scanner in = new Scanner(System.in);
    
    public NgoaiThanh(){
        super();
        this.SoNgay = 0;
        this.NoiDen = "";
    }
    
    public NgoaiThanh(String ma, String name, String sx, double dt, String nd, int sn){
        super(ma, name, sx, dt);
        this.SoNgay = sn;
        this.NoiDen = nd;
    }
    
    @Override
    public void nhap(){
        super.nhap();
        System.out.println("Noi Den: ");
        this.NoiDen = in.nextLine();
        System.out.println("So Ngay: ");
        this.SoNgay = in.nextInt();
    }

    @Override
    public String toString() {
        return "Chuyen Xe Ngoai Thanh" + super.toString() + "\nNoi Den: "
                + this.NoiDen + "\nSo Ngay: " + this.SoNgay + "\nDoanh Thu: "
                + this.DoanhThu;
    }
    
    
}
