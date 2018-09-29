/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package server;

import java.io.IOException;
import java.io.InputStream;
import java.net.Socket;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author MyPC
 */
public class Client {
    public static void main(String[] args) {
        try {
            Socket clientSocket = new Socket("localhost", 6060);
            InputStream inFromServer = clientSocket.getInputStream();
            System.out.println("Message received from server: " + inFromServer.read());
            clientSocket.close();
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }
}
