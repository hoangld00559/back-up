/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package conditionallogic;

/**
 *
 * @author MyPC
 */
import java.util.Scanner;

public class IfStatements {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner user_input = new Scanner(System.in);

        System.out.print("Enter your time: ");
        int time = user_input.nextInt();
        
        for (int i = 0; i <=10; i ++){
            System.out.println(i + " times 10 = " + 10 * i);
        }
        
//        if(colour.equals("Black")){
//            System.out.println("You must be a Goth!");
//        }
//        else if(colour.equals("White")){
//            System.out.print("You are a very nure person1");
//        }
//        else if(colour.equals("Red")){
//            System.out.print("You are fun and outgoing");
//        }
//        else if(colour.equals("Blue")){
//            System.out.print("You're not a Chelsea fan, are you?");
//        }
//        else {
//            System.out.print("Sorry, didn't catch that!");
//        }
//        switch (user) {
//            case 0: case 1: case 2: case 3: case 4: case 5:
//                System.out.println("Age is between 0 and 5");
//                break;
//            case 6: case 7: case 8: case 9: case 10: case 11:
//                System.out.println("Age is between 6 and 11");
//                break;
//            default:
//                System.out.println("nothing to do");
//        }
        
//        if (user <= 18) {
//            System.out.println("User is 18 or younger");
//        }
//        else if (user >18 && user < 40) {
//            System.out.println("User is between 19 and 39");
//        }
//        else if (user == 45 || user == 50) {
//            System.out.println("User is either 45 or 50");
//        }            
//        else {
//            System.out.println("User is older than 40");
//        }
    }
}
