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
public class MayChieu {
    private String hangsanxuat;
    private double gia;
    
    MayChieu(){}
    MayChieu(String hsx, int gia){
        this.hangsanxuat = hsx;
        this.gia = gia;
    }

    public String getHangsanxuat() {
        return hangsanxuat;
    }

    public void setHangsanxuat(String hangsanxuat) {
        this.hangsanxuat = hangsanxuat;
    }

    public double getGia() {
        return gia;
    }

    public void setGia(double gia) {
        this.gia = gia;
    }
    
    
}
