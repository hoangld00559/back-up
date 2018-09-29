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
public class Certificates extends StudentResults {
    private String certificate;
    
    Certificates() {
        super();
        certificate = "No Certificate Awarded";
    }
    String certificateAwarded(int aScore){
        String aGrade = examGrade(aScore);
        
        if(aGrade.equals("Grade is A")){
            this.certificate = "Certificate of Excellence";
        }
        else if(aGrade.equals("Grade is B")){
            this.certificate = "Certificate of Achievement";
        }
        else if(aGrade.equals("Grade is C")){
            this.certificate = "Certificate of Achievement";
        }
        else {
            this.certificate = "No Certificate Awarded";
        }
        
        return this.certificate;
    }
}
