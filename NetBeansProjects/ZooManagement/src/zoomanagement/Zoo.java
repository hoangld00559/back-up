/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zoomanagement;

import java.util.ArrayList;

/**
 *
 * @author MyPC
 */
public class Zoo {
    private static ArrayList<Chuong> danhSachChuong = new ArrayList<>();
    
    public void themChuong(Chuong c){
        danhSachChuong.add(c);
        System.out.println("Thêm thành công chuông với mã là: " + c.getMaChuong());
    }
    public boolean xoaChuong(int machuong){
        for(int i=0; i<danhSachChuong.size(); i++){
            if(danhSachChuong.get(i).getMaChuong() == machuong){
                danhSachChuong.remove(i);
                return true;
            }
        }
        return false;
    }

    public ArrayList<Chuong> getDanhSachChuong() {
        return danhSachChuong;
    }

    public void setDanhSachChuong(ArrayList<Chuong> danhSachChuong) {
        this.danhSachChuong = danhSachChuong;
    }
    
}
