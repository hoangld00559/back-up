/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import entity.SinhVien;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class SinhVienModel {

    public boolean luuSinhVien(SinhVien sv) {
        try {
            System.out.println("Da luu sinh vien thanh cong voi ten la: " + sv.getName());
            Connection cnn = DriverManager.getConnection("jdbc:mysql://localhost:3306/demo", "root", "");
            Statement stt = cnn.createStatement();
            stt.execute("insert into sinhvien (name, masv, age) values ('" + sv.getName() + "', '" + sv.getMasv() + "', " + sv.getAge() + ")");
            return true;
        } catch (SQLException e) {
            System.err.println(e);
            return false;
        }            
    }

    public ArrayList<SinhVien> layDanhSachSinhVien() throws SQLException {
        ArrayList<SinhVien> danhSachSinhVien = new ArrayList<>();
        Connection cnn = DriverManager.getConnection("jdbc:mysql://localhost:3306/demo", "root", "");
        // FileInputStream fis = new FileInputStream("filename.txt");
        Statement stt = cnn.createStatement();
        ResultSet rs = stt.executeQuery("select * from sinhvien");
        // BufferedReader reader.nextLine();

        while (rs.next()) {
            String masinhvien = rs.getString("masv");           
            String ten = rs.getString("name");
            int tuoi = rs.getInt("age");
            SinhVien donGianLaMotCaiTen = new SinhVien(masinhvien, ten, tuoi);
            danhSachSinhVien.add(donGianLaMotCaiTen);
        }
        return danhSachSinhVien;
    }
}
