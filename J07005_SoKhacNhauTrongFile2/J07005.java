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

/**
 *
 * @author admin
 */
public class J07005 {
    public static void main(String[] args) throws FileNotFoundException, IOException{
        FileInputStream inputStream = new FileInputStream("DATA.in");
        DataInputStream dataInputStr = new DataInputStream(inputStream);
        int[] f = new int[1001];
        int n = 0;
        for(int i = 0; i < 100000; i++){
            n = dataInputStr.readInt();
            f[n] += 1;
        }
        for(int i = 0; i < 1000; i++){
            if(f[i] != 0){
                System.out.println(i + " " + f[i]);
            }
        }
        dataInputStr.close();
    }
}
