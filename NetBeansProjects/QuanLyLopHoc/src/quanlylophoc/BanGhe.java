/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quanlylophoc;

/**
 *
 * @author MyPC
 */
public class BanGhe {
    private double chieudai;
    private double chieurong;
    private double gia;
    private String mausac;
    
    public BanGhe(){};
    public BanGhe(double cd, double cr, double gia, String mau){
        this.chieudai = cd;
        this.chieurong = cr;
        this.gia = gia;
        this.mausac = mau;
    };

    public double getChieudai() {
        return chieudai;
    }

    public void setChieudai(double chieudai) {
        this.chieudai = chieudai;
    }

    public double getChieurong() {
        return chieurong;
    }

    public void setChieurong(double chieurong) {
        this.chieurong = chieurong;
    }

    public double getGia() {
        return gia;
    }

    public void setGia(double gia) {
        this.gia = gia;
    }

    public String getMausac() {
        return mausac;
    }

    public void setMausac(String mausac) {
        this.mausac = mausac;
    }
    
    
}
