/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import entity.Student;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author MyPC
 */
public class StudentModel {

    public boolean save(Student student) {
        try {
            String sqlString = "insert into students (rollnum, name, age, address) values(?,?,?,?)";
            PreparedStatement ps = ConnectionHandle.getInstance().getConnection().prepareStatement(sqlString);
            ps.setString(1, student.getRollNumber());
            ps.setString(2, student.getName());
            ps.setInt(3, student.getAge());
            ps.setString(4, student.getAddress());
            ps.execute();
        } catch (SQLException ex) {
            System.err.println(ex.getMessage());
            System.err.println("Lỗi khi làm việc với database, vui lòng thử lại");
        }
        return false;
    }

    public ArrayList<Student> load() {
        ArrayList<Student> list = new ArrayList<>();
        try {

            String sqlString = "select * from students";
            PreparedStatement ps = ConnectionHandle.getInstance().getConnection().prepareStatement(sqlString);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                String rollNum = rs.getString("rollnum");
                String name = rs.getString("name");
                int age = rs.getInt("age");
                String address = rs.getString("address");
                Student st = new Student(rollNum, name, age, address);
                list.add(st);
            }
        } catch (SQLException ex) {
            System.err.println(ex.getMessage());
            System.err.println("Lỗi làm việc với database, vui lòng thử lại!");
        }
        return list;
    }

    public Student findByRollNumber(String rollNumber) throws SQLException {
        Student student = new Student();
        String sqlString = "select * from students where rollNumber = " + rollNumber;
        PreparedStatement ps = ConnectionHandle.getInstance().getConnection().prepareStatement(sqlString);
        ResultSet rs = ps.executeQuery();
        return student;
    }
//    public static void main(String[] args){
//        StudentModel model = new StudentModel();
//        Student student = new Student("A002", "Khanh", 18, "ha noi");
//        model.save(student);
//        
//        ArrayList<Student> list = model.load();
//        for(Student x: list){
//            System.out.println(x.getName());
//        }
//    }
}
