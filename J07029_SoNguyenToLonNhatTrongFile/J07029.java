/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package J07029_SoNguyenToLonNhatTrongFile;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Objects;

/**
 *
 * @author :Tran Quang Huy
 */
public class J07029 {
    public static boolean isPrime(int n){
        for(int i = 2; i <= Math.sqrt(n); i++){
            if(n % i == 0){
                return false;
            }
        }
        return n > 1;
    }
    public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
        FileInputStream file = new FileInputStream("DATA.in");
        ObjectInputStream ois = new ObjectInputStream(file);
        ArrayList <Integer> list = (ArrayList<Integer>) ois.readObject();
        Collections.sort(list, Comparator.reverseOrder());
        Map<Integer, Integer> map = new LinkedHashMap<>();
        for(int i = 0; i < list.size() - 1; i++){
            int x = list.get(i);
            if(isPrime(x)){
                if(map.containsKey(x)){
                    map.put(x, map.get(x) + 1);
                }
                else{
                    map.put(x, 1);
                }
            }
        }
        int cnt = 10;
        for(Map.Entry<Integer, Integer> x : map.entrySet()){
            System.out.println(x.getKey() + " " + x.getValue());
            cnt -= 1;
            if(cnt == 0) break;
        }
    }
}
