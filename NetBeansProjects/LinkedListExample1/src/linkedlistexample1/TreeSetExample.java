/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package linkedlistexample1;

import java.util.TreeSet;

class Student2 implements Comparable<Student2>{
    private String name;
    private int age;
    private String address;

    public Student2() {
    }

    public Student2(String name, int age, String address) {
        this.name = name;
        this.age = age;
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "Student: name=" + name + ",age=" + age + ",address" + address;
    }

    @Override
    public int compareTo(Student2 student) {
        return this.getName().compareTo(student.getName());
    }
    
}
public class TreeSetExample {
    public static void main(String[] args){
        //init treeSet
        TreeSet<Student2> treeSet = new TreeSet<Student2>();
        //create students object
        Student2 student1 = new Student2("Cong", 17, "Ha noi");
        Student2 student2 = new Student2("Dung", 16, "Hai Phong");
        Student2 student3 = new Student2("Ngon", 18, "Ha noi");
        Student2 student4 = new Student2("Hanh", 19, "Da nang");
        // add students object to treeSet
        treeSet.add(student1);
        treeSet.add(student2);
        treeSet.add(student3);
        treeSet.add(student4);
        treeSet.add(student1);
        
        // show treeSet
        for(Student2 student : treeSet){
            System.out.println(student.toString());
        }
    }
}
