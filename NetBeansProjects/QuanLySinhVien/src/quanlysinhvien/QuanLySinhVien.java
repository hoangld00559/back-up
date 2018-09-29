/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quanlysinhvien;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author MyPC
 */
public class QuanLySinhVien {

    public static void main(String[] args) throws IOException{
        ArrayList<SinhVien> listSinhVien = new ArrayList<>();
        Scanner input = new Scanner(System.in);
        int n = 0;
        do {
            System.out.println("1.Nhap them sv     2.Hien thi ds SV   3.Thoat");
            try {
                n = Integer.parseInt(input.nextLine());
            } catch(Exception e) {
            }
            switch (n) {
                case 1:
                    System.out.println("Nhap so sv them vao: ");
                    int k = input.nextInt();
                    for (int i = 0; i < k; i++) {
                        SinhVien sv = new SinhVien();
                        try {
                            System.out.println("Nhap ID: ");
                            sv.setId(Integer.parseInt(input.nextLine()));
                            System.out.println("Nhap ho ten: ");
                            sv.setHoten(input.next());
                        } catch (Exception e){
                            System.out.println("Nhap sai");
                        }
                        listSinhVien.add(sv);
                    }
                    break;
                case 2:
                    System.out.println(listSinhVien);
                    break;
                default:
                    System.out.println();
            }

        } while (n != 3);
    }

}
