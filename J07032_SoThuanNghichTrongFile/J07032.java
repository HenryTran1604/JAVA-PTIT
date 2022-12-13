/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package J07032_SoThuanNghichTrongFile;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.TreeMap;

/**
 *
 * @author :Tran Quang Huy
 */
public class J07032 {
    public static boolean check(int n){
        int cnt = 0, r = 0, tmp = n;
        while(tmp > 0){
            int d = tmp % 10;
            if(d % 2 == 0) return false;
            r = 10 * r + d;
            cnt += 1;
            tmp /= 10;
        }
        return cnt > 1 && cnt % 2 == 1 && r == n;
    }
    public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
        FileInputStream inputStream = new FileInputStream("DATA1.in");
        ObjectInputStream ois = new ObjectInputStream(inputStream);
        ArrayList<Integer> list1 = (ArrayList<Integer>) ois.readObject();
        HashMap<Integer, Integer> map1 = new HashMap<>();
        for(int x : list1){
            if(map1.containsKey(x)){
                map1.put(x, map1.get(x) + 1);
            }
            else{
                map1.put(x, 1);
            }
        }
        inputStream = new FileInputStream("DATA2.in");
        ois = new ObjectInputStream(inputStream);
        ArrayList<Integer> list2 = (ArrayList<Integer>) ois.readObject();
        HashMap<Integer, Integer> map2 = new HashMap<>();
        for(int x : list2){
            if(map2.containsKey(x)){
                map2.put(x, map2.get(x) + 1);
            }
            else{
                map2.put(x, 1);
            }
        }
        TreeMap<Integer, Integer> map = new TreeMap<>();
        for(Map.Entry<Integer, Integer> x : map1.entrySet()){
            Integer key = x.getKey();
            if(check(key) && map2.containsKey(key)){
                if(map.containsKey(key)){
                    map.put(key, map.get(key) + map1.get(key) + map2.get(key));
                }
                else{
                    map.put(key, map1.get(key) + map2.get(key));
                }
            }
        }
        int cnt = 10;
        for(Map.Entry<Integer, Integer> x : map.entrySet()){
            System.out.println(x.getKey() + " " + x.getValue());
            cnt -= 1;
            if(cnt == 0){
                break;
            }
        }
    }
}
