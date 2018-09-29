/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import controller.ProductController;
import java.util.Scanner;

/**
 *
 * @author MyPC
 */
public class MainThread {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ProductController controller = new ProductController();
        while (true) {
            System.out.println("====== Student Manager ======");
            System.out.println("1. Add 10 product.");
            System.out.println("2. List product.");
            System.out.println("3. Edit product.");
            System.out.println("4. Exit.");
            System.out.println("=============================");
            System.out.println("Please enter your choice: ");
            int choice = scanner.nextInt();
            scanner.nextLine();
            switch (choice) {
                case 1:
                    if (controller.create10Product()) {
                        System.out.println("Thêm mới sinh viên thành công.");
                    }
                    break;
                case 2:
                    controller.printListProduct();
                    break;
                case 3:
                    controller.editProduct();
                    break;
            }
            if (choice == 4) {
                break;
            }
        }
    }
}
