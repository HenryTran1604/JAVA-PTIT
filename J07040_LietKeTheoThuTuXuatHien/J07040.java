/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package J07040_LietKeTheoThuTuXuatHien;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.Scanner;

/**
 *
 * @author :Tran Quang Huy
 */
public class J07040 {
    public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
        FileInputStream inputStream = new FileInputStream("NHIPHAN.in");
        ObjectInputStream ois = new ObjectInputStream(inputStream);
        ArrayList<String> list1 = (ArrayList<String>) ois.readObject();
        LinkedHashSet <String> set1 = new LinkedHashSet<>();
        for(String x : list1){
            for(String y : x.split("\\s+"))
                set1.add(y.toLowerCase());
        }
        Scanner sc = new Scanner(new File("VANBAN.in"));
        LinkedHashSet <String> set2 = new LinkedHashSet<>();
        while(sc.hasNext()){
            set2.add(sc.next().toLowerCase());
        }
        for(String x : set2){
            if(set1.contains(x)){
                System.out.println(x);
            }
        }
    }
}
