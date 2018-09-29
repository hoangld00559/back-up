/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package formpack;

public class Student {
    private String user_name;
    private int age;
    private String user_message;
    private String user_class;

    public Student() {
    }

    public Student(String user_name, int age, String user_message, String user_class) {
        this.user_name = user_name;
        this.age = age;
        this.user_message = user_message;
        this.user_class = user_class;
    }

    public String getUser_name() {
        return user_name;
    }

    public void setUser_name(String user_name) {
        this.user_name = user_name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getUser_message() {
        return user_message;
    }

    public void setUser_message(String user_message) {
        this.user_message = user_message;
    }

    public String getUser_class() {
        return user_class;
    }

    public void setUser_class(String user_class) {
        this.user_class = user_class;
    }
    
}
