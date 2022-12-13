/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package J07085_TongChuSo;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;

/**
 *
 * @author :Tran Quang Huy
 */
public class J07085 {
    public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
        FileInputStream inputStream = new FileInputStream("DATA.in");
        ObjectInputStream ois = new ObjectInputStream(inputStream);
        ArrayList <String> list = (ArrayList<String>) ois.readObject();
        String num;
        int sum;
        for(String x : list){
            num = ""; sum = 0;
            for(int i = 0; i < x.length(); i++){
                if(Character.isDigit(x.charAt(i)))
                    if(!(num.length() == 0 && x.charAt(i) == '0'))
                        num += x.charAt(i);
            }
            for(int i = 0; i < num.length(); i++){
                sum += num.charAt(i) - '0';
            }
            if(sum == 0)
                System.out.println("0 0");
            else
                System.out.println(num + " " + sum);
        }
    }
}
