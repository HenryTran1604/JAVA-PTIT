/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package J08011_LietKeVaDem;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

/**
 *
 * @author admin
 */
class pair{
    private Integer ft, sd;

    public pair(Integer ft, Integer sd) {
        this.ft = ft;
        this.sd = sd;
    }

    public Integer getFt() {
        return ft;
    }

    public Integer getSd() {
        return sd;
    }
    
}
public class J08011 {
    private static boolean check(int n) {
        int r = n % 10;
        n /= 10;
        while(n > 0){
            if(r < n % 10)
                return false;
            r = n % 10;
            n /= 10;
        }
        return true;
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        LinkedHashMap<Integer, Integer> map = new LinkedHashMap<>();
        while(sc.hasNext()){
            int s = sc.nextInt();
            if(check(s)){
                if(map.containsKey(s)){
                    map.put(s, map.get(s) + 1);
                }
                else{
                    map.put(s, 1);
                }
            }
        }
        ArrayList <pair> list = new ArrayList<>();
        Set<Map.Entry<Integer, Integer>> entry = map.entrySet();
        for(Map.Entry<Integer, Integer> x : entry){
            list.add(new pair(x.getKey(), x.getValue()));
        }
        Collections.sort(list, new Comparator<pair>(){
            @Override
            public int compare(pair o1, pair o2){
                return o2.getSd() - o1.getSd();
            }
        });
        for(pair x : list){
            System.out.println(x.getFt() + " " + x.getSd());
        }
    }
}
