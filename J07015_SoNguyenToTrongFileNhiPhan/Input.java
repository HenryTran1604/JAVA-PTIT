/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package J07015_SoNguyenToTrongFileNhiPhan;

import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

/**
 *
 * @author :Tran Quang Huy
 */
public class Input {
    public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
        FileOutputStream fileOutputStream = new FileOutputStream("SONGUYEN.in");
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
        ArrayList <Integer> list = new ArrayList<>();
        list.add(12);
        list.add(2);
        list.add(3);
        list.add(3);
        list.add(12);
        list.add(7);
        list.add(133);
        objectOutputStream.writeObject(list);
        fileOutputStream.close();
    }
}
