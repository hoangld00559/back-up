/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zoomanagement;

import java.util.Scanner;

/**
 *
 * @author MyPC
 */
public class TestZoo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        int n;
        Zoo zoo = new Zoo();
//        Chuong chuong = new Chuong();
        do {
            System.out.println("=========Zoo Management=======");
            System.out.println("1. Thêm chuồng");
            System.out.println("2. Xóa chuồng");
            System.out.println("3. Thêm con vật");
            System.out.println("4. Xóa con vật");
            System.out.println("5. Xem tất cả các con vật");
            System.out.println("6. Thoát");
            System.out.println("-------------------------------");
            System.out.println("Nhập lựa chọn: ");
            n = input.nextInt();
            input.nextLine();
            switch (n) {
                case 1:
                    System.out.println("Nhập mã chuồng");
                    int machuong = input.nextInt();
//                    input.nextLine();                    
                    zoo.themChuong(new Chuong(machuong));
                    break;
                case 2:
                    System.out.println("Nhập mã chuồng cần xóa:");
                    int xoaMaChuong = input.nextInt();
                    input.nextLine();
                    if (zoo.xoaChuong(xoaMaChuong)) {
                        System.out.println("Thành công");
                    } else {
                        System.out.println("Lỗi");
                    }
                    break;
                case 3:
                    System.out.println("Nhập tên con vật: ");
                    String ten = input.nextLine();
                    System.out.println("Nhập tuổi con vật: ");
                    int tuoi = input.nextInt();
                    input.nextLine();
                    System.out.println("Nhập mô tả: ");
                    String mota = input.nextLine();
                    System.out.println("1. tiger   2. dog    3. cat");
                    int k = input.nextInt();
                    System.out.println("Nhập mã chuồng bỏ con vật vào: ");
                    int maChuongBo = input.nextInt();
                    input.nextLine();
                    switch (k) {
                        case 1:
                            Tiger tiger = new Tiger(ten, tuoi, mota);
                            for (int i = 0; i < zoo.getDanhSachChuong().size(); i++) {
                                if (zoo.getDanhSachChuong().get(i).getMaChuong() == maChuongBo) {
                                    zoo.getDanhSachChuong().get(i).themConVat(tiger);
                                }
                            }
                            break;
                        case 2:
                            Dog dog = new Dog(ten, tuoi, mota);
                            for (int i = 0; i < zoo.getDanhSachChuong().size(); i++) {
                                if (zoo.getDanhSachChuong().get(i).getMaChuong() == maChuongBo) {
                                    zoo.getDanhSachChuong().get(i).themConVat(dog);
                                }
                            }
                            break;
                        case 3:
                            Cat cat = new Cat(ten, tuoi, mota);
                            for (int i = 0; i < zoo.getDanhSachChuong().size(); i++) {
                                if (zoo.getDanhSachChuong().get(i).getMaChuong() == maChuongBo) {
                                    zoo.getDanhSachChuong().get(i).themConVat(cat);
                                }
                            }
                            break;
                    }
                    break;
                case 4:
                    System.out.println("Nhập tên con vật cần xóa: ");
                    String tenCanXoa = input.nextLine();
                    for(int i = 0; i< zoo.getDanhSachChuong().size(); i ++){
                        if(zoo.getDanhSachChuong().get(i).xoaConVat(tenCanXoa)){
                            System.out.println("thanh cong");
                        }else {
                            System.out.println("loi");
                        }
                    }
                    break;
                case 5:
                    for (Chuong s : zoo.getDanhSachChuong()) {
                        System.out.println(s.getMaChuong());
                        for (Animal a : s.getAnimalList()) {
                            a.xemThongTin();
                        }
                        System.out.println("===============================");
                    }
                    break;
                case 6:
                    System.out.println("bye bye");
                    break;
                default:
                    System.out.println("Nhập sai, vui lòng nhập lại!");
            }
        } while (n != 6);
    }

}
