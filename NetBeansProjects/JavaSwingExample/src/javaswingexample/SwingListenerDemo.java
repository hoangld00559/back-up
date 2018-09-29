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
import java.awt.event.ComponentEvent;
import java.awt.event.ComponentListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 *
 * @author MyPC
 */
public class SwingListenerDemo {

    private JFrame mainFrame;
    private JLabel headerLabel;
    private JLabel statusLabel;
    private JPanel controlPanel;
    
    public SwingListenerDemo() {
        prepareGUI();
    }

    public static void main(String[] args) {
        SwingListenerDemo swingListenerDemo = new SwingListenerDemo();
//        swingListenerDemo.showActionListenerDemo();
        swingListenerDemo.showComponentListenerDemo();
    }
    
    private void prepareGUI() {
        mainFrame = new JFrame("Java Swing Examples");
        mainFrame.setSize(400, 400);
        mainFrame.setLayout(new GridLayout(3, 1));
        
        headerLabel = new JLabel("", JLabel.CENTER);
        statusLabel = new JLabel("", JLabel.CENTER);
        statusLabel.setSize(350, 100);
        
        mainFrame.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent windowEvent){
                System.exit(0);
            }
        });
        
        controlPanel = new JPanel();
        controlPanel.setLayout(new FlowLayout());
        
        mainFrame.add(headerLabel);
        mainFrame.add(controlPanel);
        mainFrame.add(statusLabel);
        mainFrame.setVisible(true);
    }

    private void showComponentListenerDemo() {
        headerLabel.setText("Listener in action: ComponentListener");
        
        JPanel panel = new JPanel();
        panel.setBackground(Color.magenta);
        
        JLabel msglabel = new JLabel("Welcome to TutorialPoint Swing tutorial.", JLabel.CENTER);
        panel.add(msglabel);
        
        msglabel.addComponentListener(new CustomComponentListener());
        controlPanel.add(panel);
        mainFrame.setVisible(true);
    }

    class CustomComponentListener implements ComponentListener {


        @Override
        public void componentResized(ComponentEvent e) {
            statusLabel.setText(statusLabel.getText()+ e.getComponent().getClass().getSimpleName()+ " resized.");
        }

        @Override
        public void componentMoved(ComponentEvent e) {
            statusLabel.setText(statusLabel.getText()+ e.getComponent().getClass().getSimpleName()+ " moved.");
        }

        @Override
        public void componentShown(ComponentEvent e) {
            statusLabel.setText(statusLabel.getText() + e.getComponent().getClass().getSimpleName()+ " shown.");
        }

        @Override
        public void componentHidden(ComponentEvent e) {
            statusLabel.setText(statusLabel.getText()+ e.getComponent().getClass().getSimpleName()+ " hidden.");
        }
    }
    
//    private void showActionListenerDemo() {
//        headerLabel.setText("Listener in action: ActionListener");
//        
//        JPanel panel = new JPanel();
//        panel.setBackground(Color.magenta);
//        JButton okButton = new JButton("OK");
//        
//        okButton.addActionListener(new CustonActionListener());
//        panel.add(okButton);
//        controlPanel.add(panel);
//        mainFrame.setVisible(true);
//    }

//    class CustonActionListener implements ActionListener {
//
//       
//
//        @Override
//        public void actionPerformed(ActionEvent e) {
//            statusLabel.setText("OK Button Clicked.");
//        }
//    }
}
