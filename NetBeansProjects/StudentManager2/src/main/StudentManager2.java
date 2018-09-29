/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import controller.StudentController;
import java.util.Scanner;

/**
 *
 * @author MyPC
 */
public class StudentManager2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        StudentController controller = new StudentController();
        int n;
        do {
            System.out.println("=======Student Manager=======");
            System.out.println("1. Add student");
            System.out.println("2. List students");
            System.out.println("3. Quit");
            System.out.println("-------------------------------");
            System.out.println("Please enter your choice: ");
            n = input.nextInt();
            switch(n){
                case 1:
                    if(controller.createStudent()){
                        System.out.println("Add student success!!");
                    }
                    break;
                case 2:
                    controller.printListStudent();
                    break;
                case 3:
                    System.out.println("Bye bye!!");
                    break;
            }
        }while(n!=3);
    }
    
}
