/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import controller.StudentController;
import java.util.Scanner;

/**
 *
 * @author MyPC
 */
public class MainThread {
    public static void main(String[] args){
        generateMenu();
    }

    private static void generateMenu() {
        Scanner scanner = new Scanner(System.in);
        StudentController controller = new StudentController();
        while(true){
            System.out.println("=====Student Manager======");
            System.out.println("1. Add Student");
            System.out.println("2. List Student");
            System.out.println("3. Update Student");
            System.out.println("4. Delete Student");
            System.out.println("5. Exit");
            System.out.println("--------------------------------");
            System.out.println("Please enter your choise: ");
            int choice = scanner.nextInt();
            scanner.nextLine();
            switch(choice){
                case 1: if(controller.createStudent()){
                    System.out.println("Add student success");
                }
                break;
                case 2: controller.printListStudent();
                break;
                case 3: System.out.println("Bye bye");
                break;
            }
            if(choice == 3){
                break;
            }
        }
    }
}
