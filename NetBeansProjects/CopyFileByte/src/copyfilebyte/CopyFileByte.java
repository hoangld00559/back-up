/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package copyfilebyte;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;


public class CopyFileByte {
    private static final String FILENAME = "D:\\testout.txt";
    public static void main(String[] args){
        BufferedWriter bw = null;
        FileWriter fw = null;
        
        try {
            String data = " This is new content";
            File file = new File(FILENAME);
            //If file doesnt exists, then create it
            if(!file.exists()){
                file.createNewFile();
            }
            //true = append file
            fw = new FileWriter(file.getAbsoluteFile(), true);
            bw = new BufferedWriter(fw);
            bw.write(data);
            System.out.println("Success.....");
        }catch (IOException e){
            e.printStackTrace();
        }finally {
            try {
                if(bw != null) bw.close();
                if(fw != null) fw.close();                
            }catch (IOException ex){
                ex.printStackTrace();
            }
        }
    }
}
