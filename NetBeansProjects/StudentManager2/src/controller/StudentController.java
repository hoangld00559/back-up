/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import entity.Student;
import java.util.ArrayList;
import java.util.Scanner;
import model.StudentModel;

/**
 *
 * @author MyPC
 */
public class StudentController {
    private StudentModel model = new StudentModel();
    
    public boolean createStudent(){
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter roll number: ");
        String rollNum = input.nextLine();
        System.out.println("Please enter name: ");
        String name = input.nextLine();
        System.out.println("Please enter age: ");
        int age = input.nextInt();
        input.nextLine();
        System.out.println("Please enter address: ");
        String address = input.nextLine();
        
        Student st = new Student(rollNum, name, age, address);
        return model.save(st);
    }
    
    public void printListStudent(){
        ArrayList<Student> list = model.load();
        for(Student st:list){
            System.out.println(st.getName());
        }
    }
}
