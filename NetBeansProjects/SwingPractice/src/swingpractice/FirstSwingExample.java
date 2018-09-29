/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package swingpractice;

import javax.swing.JButton;
import javax.swing.JFrame;

/**
 *
 * @author MyPC
 */
public class FirstSwingExample {
    public static void main(String[] args){
        JFrame f = new JFrame(); // creating instance of jframe
        JButton b = new JButton("Click"); // creating instance of JButton
        
        b.setBounds(130, 100, 100, 40);// x axis, y axis, width, heigh
        
        f.add(b); // adding button in JFrame
        
        f.setSize(400, 500); // 400 width and 500 height
        f.setLayout(null); // using no layout managers
        f.setVisible(true); // making the frame visible
    }
}
