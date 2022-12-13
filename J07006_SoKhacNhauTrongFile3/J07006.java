/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package J07006_SoKhacNhauTrongFile3;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;

/**
 *
 * @author :Tran Quang Huy
 */
public class J07006 {
    public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
        FileInputStream file = new FileInputStream("DATA.in");
        ObjectInputStream ois = new ObjectInputStream(file);
        ArrayList <Integer> list = (ArrayList<Integer>) ois.readObject();
        int[] f = new int[1000];
        for(int x : list){
            f[x] += 1;
        }
        for(int i = 0; i < 1000; i++){
            if(f[i] > 0)
                System.out.println(i + " " + f[i]);
        }
    }
}
