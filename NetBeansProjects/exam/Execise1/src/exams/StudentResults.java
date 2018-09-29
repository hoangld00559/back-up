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
public class StudentResults {
    
    private String Full_Name;
    private String Exam_Name;
    private String Exam_Score;
    private String Exam_Grade;
    
    StudentResults(){
        Full_Name = "No Name Given";
        Exam_Name = "Unknown";
        Exam_Score = "No Score";
        Exam_Grade = "Unknown";
    }
    
    String fullName(String aName) {
        Full_Name = aName;
        return Full_Name;
    }
    
    String examName(String examCode){
        if(examCode.equals("VB")){
            Exam_Name = "Visual Basic .NET";
        }
        else if(examCode.equals("JV")){
            Exam_Name = "Java";
        }
        else if(examCode.equals("C#")){
            Exam_Name = "C# .NET";
        }
        else if(examCode.equals("PH")){
            Exam_Name = "PHP";
        }
        else {
            Exam_Name = "No Exam Selected";
        }
        return Exam_Name;
    }
    
    String examScore(int aScore){
        Exam_Score = aScore + " out of 50";
        return Exam_Score;
    }
    
    private String getGrade(int aScore){
        String examGrade = "";
        
        if(aScore >= 0 && aScore <= 10){
            examGrade = "E";
        }
        else if(aScore >= 11 && aScore <= 20){
            examGrade = "D";
        }
        else if(aScore >= 21 && aScore <= 30){
            examGrade = "C";
        }
        else if(aScore >= 31 && aScore <= 40){
            examGrade = "B";
        }
        else if(aScore >= 41){
            examGrade = "A";
        }
        return "Grade is " + examGrade;
    }
    
    String examGrade(int aScore){
        Exam_Grade = getGrade(aScore);
        return Exam_Grade;
    }
}
