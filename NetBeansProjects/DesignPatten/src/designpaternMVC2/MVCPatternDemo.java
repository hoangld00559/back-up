/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package designpaternMVC2;

/**
 *
 * @author MyPC
 */
public class MVCPatternDemo {
    public static void main(String[] args){
        // fetch student record based on his roll no from the database
        Student model = retrivesStudentFromDatabase();
        
        // create a view: to write student details on console
        StudentView view = new StudentView();
        
        StudentController controller = new StudentController(model, view);
        
        controller.updateView();
        
        // update model data
        controller.setStudentName("hoang");
        
        controller.updateView();
    }
    
    private static Student retrivesStudentFromDatabase(){
        Student student = new Student();
        student.setName("le");
        student.setRollNo("10");
        return student;
    }
}
