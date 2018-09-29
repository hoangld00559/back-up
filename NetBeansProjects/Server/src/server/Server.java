/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package server;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.SocketTimeoutException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author MyPC
 */
public class Server extends Thread {

    private ServerSocket serverSocket;
    public Server(int port) throws IOException {
        serverSocket = new ServerSocket(port);
    }
    @Override
    public void run(){
        while(true){
            try {
                System.out.println("Listening for client message on port "
                + serverSocket.getLocalPort());
                Socket socket = serverSocket.accept();
                DataInputStream in = new DataInputStream(socket.getInputStream());
                DataOutputStream out = new DataOutputStream(socket.getOutputStream());
                out.writeUTF("Hello from server.");
            }catch (SocketTimeoutException sTException){
                sTException.printStackTrace();
            } catch (IOException ex) {
                ex.printStackTrace();
            }finally {
                try{
                    serverSocket.close();
                }catch(IOException ioException){
                    ioException.printStackTrace();
                }
            }
        }
    }   
    public static void main(String[] args) {
        // TODO code application logic here
        try {
            Thread thread= new Server(6060);
            thread.start();
        }catch(IOException e){
            e.printStackTrace();
        }
    }
    
}
