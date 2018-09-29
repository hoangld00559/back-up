/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package threadexcecise1;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author MyPC
 */
public class Student {

    String studRollno;

    public String getStudRollno() {
        return studRollno;
    }

    public void setStudRollno(String studRollno) {
        this.studRollno = studRollno;
    }

    public Student(String studRollno) {
        this.studRollno = studRollno;
    }

}

class Openfile extends Thread {

    ArrayList<Student> validRollNumber = new ArrayList<>();

    public void openfiles() {
        try {
            FileReader file = new FileReader("D:\\java tài liệu\\bài tập java lớp\\bai tap tong hop jp2\\students.txt");
            BufferedReader br = new BufferedReader(file);
            int i;
            while ((i = br.read()) != -1) {
                System.out.print((char) i);
                System.out.println(String.valueOf(i));
//                synchronized (this) {
//                    
//                    if (str.length() == 11 || str.length() == 10 && str.charAt(0) == 'C' || str.charAt(0) == 'T' || str.charAt(0) == 'N'
//                            && str.charAt(5) == 'G' || str.charAt(5) == 'H'
//                            || str.charAt(5) == 'I' || str.charAt(5) == 'K' || str.charAt(5) == 'L' || str.charAt(5) == 'M') {
//                        System.out.println(str);
////                    }
//                }

            }
        } catch (FileNotFoundException ex) {
        } catch (IOException ex) {
        }

    }
}
