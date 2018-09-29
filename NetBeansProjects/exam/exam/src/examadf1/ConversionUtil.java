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
public class ConversionUtil {
    public double fahrenheitToCelsius(double fDegree){
        return (5/9)*(fDegree - 32);
    }
    
    public double celciusToFahrenheit(double cDegree){
        return (9/5)*cDegree + 32;
    }
}
