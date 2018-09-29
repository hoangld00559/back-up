/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package shapebaitap;

/**
 *
 * @author MyPC
 */
public class ShapeBaitap {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int number = 1;
        while(number <= 5){
            for(int i = 1; i <= number; i ++){
                System.out.print(i + " ");
            }
            System.out.println();
            number ++;
        }
    }
    
}
