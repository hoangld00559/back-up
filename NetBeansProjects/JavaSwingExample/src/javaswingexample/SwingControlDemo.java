/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaswingexample;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 *
 * @author MyPC
 */
public class SwingControlDemo {

    /**
     * @param args the command line arguments
     */
    private JFrame mainFrame;
    private JLabel headerLabel;
    private JLabel statusLabel;
    private JPanel controlPanel;

    public SwingControlDemo() {
        prepareGUI();
    }

    public static void main(String[] args) {
        SwingControlDemo swingControlDemo = new SwingControlDemo();
        swingControlDemo.showEventDemo();
    }

    private void prepareGUI() {
        mainFrame = new JFrame("Java Swing Examples");
        mainFrame.setSize(400, 400);
        mainFrame.setLayout(new GridLayout(3, 1));
        mainFrame.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent windowEvent){
                System.exit(0);
            }
        });
        headerLabel = new JLabel("", JLabel.CENTER);
        statusLabel = new JLabel("", JLabel.CENTER);
        statusLabel.setSize(350, 100);
        controlPanel = new JPanel();
        controlPanel.setLayout(new FlowLayout());
        
        
        
        mainFrame.add(headerLabel);
        mainFrame.add(statusLabel);
        mainFrame.add(controlPanel);
        mainFrame.setVisible(true);
    }

//    private void showLabelDemo() {
//        headerLabel.setText("Control in action: JLabel");
//        JLabel label = new JLabel("", JLabel.CENTER);
//        label.setText("Welcome to swing test");
//        label.setOpaque(true);
//        label.setBackground(Color.gray);
//        label.setForeground(Color.white);
//        controlPanel.add(label);
//        mainFrame.setVisible(true);
//    }
    private void showEventDemo(){
        headerLabel.setText("Control in action: Button");
        
        JButton okButton = new JButton("OK");
        JButton submitButton = new JButton("Submit");
        JButton cancelButton = new JButton("Cancel");
        
        okButton.setActionCommand("OK");
        submitButton.setActionCommand("Submit");
        cancelButton.setActionCommand("Cancel");
        
        okButton.addActionListener(new buttonClickListener());
        submitButton.addActionListener(new buttonClickListener());
        cancelButton.addActionListener(new buttonClickListener());
        
        controlPanel.add(okButton);
        controlPanel.add(submitButton);
        controlPanel.add(cancelButton);
        
       mainFrame.setVisible(true);
    }

    private class buttonClickListener implements ActionListener {      
        @Override
        public void actionPerformed(ActionEvent e) {
            String command = e.getActionCommand();
            if(command.equals("OK")){
                statusLabel.setText("OK Button clicked");
            }else if(command.equals("Submit")){
                statusLabel.setText("Submit Button clicked");
            }else{
                statusLabel.setText("Cancel Button clicked");
            }
        }
    }

}
