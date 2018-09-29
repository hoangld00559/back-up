/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Execise3;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

/**
 *
 * @author MyPC
 */
public class excercise {

    public static void main(String[] args) throws IOException {
        ObjectOutputStream oos = null;
        oos = new ObjectOutputStream(new FileOutputStream("D:\\testout.txt"));
        // Create student
        Student student1 = new Student(){
           
           
        };
//        Student student2 = new Student("Nguyen Van B", 12, "09166554339");
//        Student student3 = new Student("Nguyen Van C", 22, "09124434567");

        // write student
        oos.writeObject(student1);
//        oos.writeObject(student2);
//        oos.writeObject(student3);
        System.out.println("Success...");

        ObjectInputStream ois = null;
        ois = new ObjectInputStream(new FileInputStream("D:\\testout.txt"));
        try {
            // read student

            Student student4 = (Student) ois.readObject();
            Student student5 = (Student) ois.readObject();

            // show student
            System.out.println(student4.toString());
            System.out.println(student5.toString());

        } catch (ClassNotFoundException ex) {

        }
    }
}
