/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package J03020_TimTuThuanNghichDaiNhat;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

/**
 *
 * @author admin
 */
public class J03020 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        LinkedHashMap <String, Integer> map = new LinkedHashMap<>();
        int maxLen = 0;
        while(sc.hasNext()){
            String s = sc.next();
            StringBuilder tmp = new StringBuilder(s);
            if(s.equals(tmp.reverse().toString()) && s.length() >= maxLen){
                if(map.containsKey(s)){
                    int t = map.get(s);
                    map.put(s, t + 1);
                }
                else{
                    map.put(s, 1);
                }
                maxLen = Math.max(maxLen, s.length());
            }
        }
        Set<Map.Entry<String, Integer>> entry = map.entrySet();
        for(Map.Entry<String, Integer> x : entry){
            if(x.getKey().length() == maxLen){
                System.out.println(x.getKey() + " " + x.getValue());
            }
        }
        
    }
}
