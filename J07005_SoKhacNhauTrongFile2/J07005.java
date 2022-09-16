/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package J07005_SoKhacNhauTrongFile2;

import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.TreeMap;

/**
 *
 * @author admin
 */
public class J07005 {
    public static void main(String[] args) throws FileNotFoundException, IOException{
        FileInputStream inputStream = new FileInputStream("DATA.in");
        DataInputStream dataInputStr = new DataInputStream(inputStream);
        TreeMap <Integer, Integer> map = new TreeMap<>();
        int n = 0;
        while(dataInputStr.available() > 0){
            n = dataInputStr.readInt();
            System.out.println(n);
        }
    }
}
