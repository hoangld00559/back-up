/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exams;

/**
 *
 * @author MyPC
 */
public class ExamDetails {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
//        StudentResults aStudent = new StudentResults();
//        
//        String sName = aStudent.fullName("Bill Gates");
//        System.out.println(sName);
//        
//        String exam = aStudent.examName("VB");
//        System.out.println(exam);
//        
//        String score = aStudent.examScore(30);
//        System.out.println(score);
//        
//        String grade = aStudent.examGrade(30);
//        System.out.println(grade);

          Certificates c1 = new Certificates();
          String exam = c1.examName("VB");
          System.out.println(exam);
          
          String award = c1.certificateAwarded(50);
          System.out.println(exam + " " + award);
    }
    
}
