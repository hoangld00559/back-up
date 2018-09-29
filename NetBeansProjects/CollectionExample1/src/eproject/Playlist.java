/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eproject;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Arrays;
import javax.swing.JFileChooser;
import javax.swing.JFrame;

/**
 *
 * @author VI-VU
 */
public class Playlist {

    JFileChooser fileChoo = new JFileChooser();
    ArrayList array = new ArrayList();

    //add song.
    void add(JFrame frame) {
        fileChoo.setMultiSelectionEnabled(true);
        int fileValid = fileChoo.showOpenDialog(frame);
        if (fileValid == JFileChooser.CANCEL_OPTION) {
            return;
        } else if (fileValid == JFileChooser.APPROVE_OPTION) {
            File[] file = fileChoo.getSelectedFiles();
            array.addAll(Arrays.asList(file));
        }
    }

    ArrayList getListSong() {
        return array;
    }

    //save playlist
    FileOutputStream fileSave;
    ObjectOutputStream objSave;

    public void saveAsPlaylist(JFrame frame) {
        fileChoo.setMultiSelectionEnabled(false);
        int valid = fileChoo.showSaveDialog(frame);
        if (valid == JFileChooser.CANCEL_OPTION) {
            return;
        } else if (valid == JFileChooser.APPROVE_OPTION) {
            File file = fileChoo.getSelectedFile();
            try {
                fileSave = new FileOutputStream(file + ".tgr");
                objSave = new ObjectOutputStream(fileSave);
                for (int i = 0; i < array.size(); i++) {
                    File tmp = (File) array.get(i);
                    objSave.writeObject(tmp);
                }
                objSave.close();
            } catch (Exception e) {
                System.err.println("Error");
            }
        }
    }

    //open file
    FileInputStream fileOpen;
    ObjectInputStream objOpen;

    public void openPlaylist(JFrame frame) {
        fileChoo.setMultiSelectionEnabled(false);
        int vaild = fileChoo.showOpenDialog(frame);
        if (vaild == JFileChooser.CANCEL_OPTION) {
            return;
        }

        if (vaild == JFileChooser.APPROVE_OPTION) {
            File pls = fileChoo.getSelectedFile();
            System.out.println("abc");
            try {
                fileOpen = new FileInputStream(pls);
                objOpen = new ObjectInputStream(fileOpen);
                File tmp;
                while ((tmp = (File) objOpen.readObject()) != null) {
                    array.add(tmp);
                }
                if ((tmp = (File) objOpen.readObject()) == null) {
                    array.isEmpty();
                }
                objOpen.close();
            } catch (Exception e) {
                System.err.println("Error");
            }
        }
    }
}
