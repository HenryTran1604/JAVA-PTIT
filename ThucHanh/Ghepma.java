/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ThucHanh;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import java.util.TreeSet;

/**
 *
 * @author :Tran Quang Huy
 */
public class Ghepma {
    public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
        FileInputStream fis = new FileInputStream("DATA1.in");
        ObjectInputStream ois = new ObjectInputStream(fis);
        TreeSet<String> set1 = new TreeSet<>((ArrayList<String>) ois.readObject());
        fis = new FileInputStream("DATA2.in");
        ois = new ObjectInputStream(fis);
        TreeSet<Integer> set2 = new TreeSet<>((ArrayList<Integer>) ois.readObject());
        for(String x : set1){
            for(Integer y : set2){
                System.out.println(x + y);
            }
        }
    }
}
