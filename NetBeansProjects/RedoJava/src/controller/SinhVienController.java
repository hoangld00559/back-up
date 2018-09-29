/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import entity.SinhVien;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Scanner;
import model.SinhVienModel;

public class SinhVienController {

    public SinhVien yeuCauNhapSinhVien() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap ten sinh vien");
        String ten = scanner.nextLine();
        System.out.println("Nhap ma sinh vien");
        String msv = scanner.nextLine();
        System.out.println("Nhap tuoi:");
        int tuoi = scanner.nextInt();
        SinhVien sinhvien = new SinhVien(ten, msv, tuoi);
        return sinhvien;
    }

    public void inDanhSachSinhVien() {
        SinhVienModel model = new SinhVienModel();

        try {
            ArrayList<SinhVien> danhsach = model.layDanhSachSinhVien();
            danhsach = model.layDanhSachSinhVien();
            for (int i = 0; i < danhsach.size(); i++) {
                SinhVien sv = danhsach.get(i);
                System.out.println(sv.getMasv() + " -- " + sv.getName() + " -- " + sv.getAge());
            }
        } catch (SQLException ex) {
            System.err.println(ex.getMessage());
            System.err.println("Khong the hien thi danh sach sinh vien, vui long thu lai...");
        }

    }
}
