/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package J07004_SoKhacNhauTrongFile1;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

/**
 *
 * @author admin
 */
public class J07004 {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("DATA.in"));
        TreeMap <Integer, Integer> map = new TreeMap<>();
        while(sc.hasNextInt()){
            int n = sc.nextInt();
            if(map.containsKey(n)){
                map.put(n, map.get(n) + 1);
            }
            else{
                map.put(n, 1);
            }
        }
        for(Map.Entry<Integer, Integer> x : map.entrySet()){
            System.out.println(x.getKey() + " " + x.getValue());
        }
    }
}
