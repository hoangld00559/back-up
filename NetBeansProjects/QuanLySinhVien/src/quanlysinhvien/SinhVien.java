/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quanlysinhvien;

import java.util.Scanner;

/**
 *
 * @author MyPC
 */
public class SinhVien {
    private int Id;
    private String Hoten;
    Scanner input = new Scanner(System.in);

    public int getId() {
        return Id;
    }

    public void setId(int Id) {
        this.Id = Id;
    }

    public String getHoten() {
        return Hoten;
    }

    public void setHoten(String Hoten) {
        this.Hoten = Hoten;
    }

    public SinhVien() {
    }

    public SinhVien(int Id, String Hoten) {
        this.Id = Id;
        this.Hoten = Hoten;
    }
    
    @Override
    public String toString() {
        return "Ho Ten: " + this.Hoten + "Id: " + this.Id + "     "; 
    }
    
    
}
