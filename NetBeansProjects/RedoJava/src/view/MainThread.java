/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import controller.SinhVienController;
import entity.SinhVien;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.SinhVienModel;

public class MainThread {

    public static void main(String[] args) {
        SinhVienController svctr = new SinhVienController();
        SinhVienModel sm = new SinhVienModel();
//        SinhVien sv = svctr.yeuCauNhapSinhVien();
//        sm.luuSinhVien(sv);

        svctr.inDanhSachSinhVien();
        try {
            sm.layDanhSachSinhVien();
        } catch (SQLException ex) {
            System.err.println("khong hien thi duoc");
        } 
        
    }

}
