/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assigment;

import java.util.*;

/**
 *
 * @author MyPC
 */
public class Assigment {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        CollectionBook printBook = new CollectionBook();
        printBook.setListBook();
        Scanner input = new Scanner(System.in);
        int n;
        do {
            System.out.println("Vui lòng chọn chức năng: ");
            System.out.println("1.Xem danh sách   2.Tìm kiếm sách   3.Chức năng      4.thoát");
            n = input.nextInt();
            switch (n) {
                case 1:
                    printBook.getListBook();
                    break;
                case 2:
                    {
                        Scanner sc = new Scanner(System.in);
                        System.out.println("Nhập nội dung tìm kiếm: ");
                        String word = sc.nextLine();
                        int m = printBook.findBook(word);
                        if (m == 10) {
                            System.out.println("Không tìm thấy kết quả nào!");
                        } else {
                            System.out.println("Kết quả là: ");
                            System.out.println("Id :" + printBook.listBook.get(m - 1).getID());
                            System.out.println("Tên sách: " + printBook.listBook.get(m - 1).getNameOfBook());
                            System.out.println("Tác giả: " + printBook.listBook.get(m - 1).getAuthor());
                            System.out.println("Nxb: " + printBook.listBook.get(m - 1).getPublishCompany());
                        }       break;
                    }
                case 3:
                    {
                        Scanner sc = new Scanner(System.in);
                        int a;
                        do {
                            System.out.println("Vui lòng chọn chức năng");
                            System.out.println("1.Sửa    2.Xóa   3.Quay lại");
                            a = sc.nextInt();
                            if (a == 2) {
                                System.out.println("Chọn ID sách muốn xóa");
                                int b = sc.nextInt();
                                printBook.listBook.remove(b - 1);
                                printBook.getListBook();
                            }
                            if (a == 1) {
                                printBook.modifyBook();
                            }
                        } while (a != 3);
                        break;
                    }
                default:
                    break;
            }
        } while (n != 4);
    }

}
