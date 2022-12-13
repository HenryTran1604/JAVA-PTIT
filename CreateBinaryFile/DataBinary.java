/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CreateBinaryFile;

import java.io.DataOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 *
 * @author :Tran Quang Huy
 */
public class DataBinary {
    public static void main(String[] args) throws FileNotFoundException, IOException {
        FileOutputStream fileOutputStream = new FileOutputStream("DATA.in");
        DataOutputStream dataOutStr = new DataOutputStream(fileOutputStream);
        int[] buff = {1, 2, 1, 23, 1000, 998};
        for(int x : buff){
            dataOutStr.writeInt(x);
        }
        fileOutputStream.close();
    }
}
