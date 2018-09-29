/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test1.view;

import java.util.Scanner;
import test1.controller.ProductController;

/**
 *
 * @author dongvu
 */
public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ProductController productController = new ProductController();
        Boolean isSaved = false;
        while (true) {
            System.out.println("============== Product Managerment =============");
            System.out.println("1. Lưu danh sách sản phẩm.");
            System.out.println("2. Sửa thông tin sản phẩm.");
            System.out.println("3. Thoát chương trình.");
            System.out.println("================================================");
            System.out.print("Your choice: ");
            int choice = 0;
            try {
                choice = sc.nextInt();
            } catch (Exception e) {
                System.err.println("Please enter a number !!");
            }
            switch (choice) {
                case 1:
                    isSaved = productController.saveProduct();
                    break;
                case 2:
                    if (isSaved) {
                        productController.update();
                    } else{
                        System.err.println("Save productList first");
                    }
                    break;
                case 3:
                    System.exit(0);
                    break;
                default:
                    System.err.println("Please enter number from 1 to 3");
            }

        }
    }

}
