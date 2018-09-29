/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examadf1;
/**
 *
 * @author MyPC
 */
public class ExamADF1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ConversionUtil test = new ConversionUtil();
        System.out.println("10.45 Fahrenheit chuyển sang Celsius là: " + test.fahrenheitToCelsius(10.45));
        System.out.println("10.45 cencius chuyển sang Fahrenheit là: " + test.celciusToFahrenheit(10.45));
  
    }
    
}
