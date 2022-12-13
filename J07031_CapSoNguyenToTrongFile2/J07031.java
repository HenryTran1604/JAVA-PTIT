/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package J07031_CapSoNguyenToTrongFile2;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import java.util.HashSet;

/**
 *
 * @author :Tran Quang Huy
 */
public class J07031 {
    public static boolean[] p = new boolean[1000001];
    public static void sang(){
        for(int i = 2; i <= 1000000; i++){
            p[i] = true;
        }
        p[0] = p[1] = false;
        for(int i = 2; i <= 1000; i++){
            if(p[i]){
                for(int j = i * i; j <= 1000000; j += i){
                    p[j] = false;
                }
            }
        }
    }
    public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
        FileInputStream inputStream = new FileInputStream("DATA1.in");
        ObjectInputStream ois = new ObjectInputStream(inputStream);
        ArrayList<Integer> list1 = (ArrayList<Integer>) ois.readObject();
        HashSet<Integer> set1 = new HashSet<>(list1);
        inputStream = new FileInputStream("DATA2.in");
        ois = new ObjectInputStream(inputStream);
        ArrayList<Integer> list2 = (ArrayList<Integer>) ois.readObject();
        HashSet<Integer> set2 = new HashSet<>(list2);
        sang();
        for(int i = 2; i < 500000; i++){
            if(p[i] && p[1000000 - i]){
                if(set1.contains(i) && set1.contains(1000000 - i) && !set2.contains(i) && !set2.contains(1000000 - i)){
                    System.out.println(i + " " + (1000000 - i));
                }
            }
        }
    }
}
