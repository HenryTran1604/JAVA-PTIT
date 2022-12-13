/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package J07023_NguyenToVaThuanNghich;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;

/**
 *
 * @author :Tran Quang Huy
 */
public class J07023 {
    public static boolean[] p = new boolean[10000];
    public static void sang(){
        for(int i = 0; i < 10000; i++){
            p[i] = true;
        }
        p[0] = p[1] = false;
        for(int i = 2; i < Math.sqrt(10000); i++){
            if(p[i]){
                for(int j = i * i; j < 10000; j+=i){
                    p[j] = false;
                }
            }
        }
    }
    public static boolean thuanNghich(int n){
        int tmp = n,r = 0;
        while(tmp > 0){
            r = 10 * r + tmp % 10;
            tmp /= 10;
        }
        return n == r;
    }
    public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
        FileInputStream fileInputStream = new FileInputStream("DATA1.in");
        ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
        ArrayList<Integer> list1 = (ArrayList<Integer>) objectInputStream.readObject();
        int[] f1 = new int[10000];
        for(int x : list1) f1[x] += 1;
        fileInputStream = new FileInputStream("DATA2.in");
        objectInputStream = new ObjectInputStream(fileInputStream);
        ArrayList<Integer> list2 = (ArrayList<Integer>) objectInputStream.readObject();
        int[] f2 = new int[10000];
        for(int x : list2) f2[x] += 1;
        sang();
        for(int i = 2; i < 10000; i++){
            if(p[i] && f1[i] != 0 && f2[i] != 0 && thuanNghich(i)){
                System.out.println(i + " " + f1[i] + " " + f2[i]);
            }
        }
    }
}
