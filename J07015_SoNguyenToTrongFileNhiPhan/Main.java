/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package J07015_SoNguyenToTrongFileNhiPhan;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;

/**
 *
 * @author :Tran Quang Huy
 */
public class Main {
    public static boolean isPrime(int n){
        for(int i = 2; i <= Math.sqrt(n); i++){
            if(n % i == 0) return false;
        }
        return n > 1;
    }
    public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
        FileInputStream fileInputStream = new FileInputStream("SONGUYEN.in");
        ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
        ArrayList<Integer> list = (ArrayList<Integer>) objectInputStream.readObject();
        int[] f = new int[10001];
        for(int x : list){
            if(isPrime(x)){
                f[x] += 1;
            }
        }
        for(int i = 2; i < 10001; i++){
            if(f[i] != 0){
                System.out.println(i + " " + f[i]);
            }
        }
    }
}
