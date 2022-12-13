/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package J07011_ThongKeTuKhacNhauTrongFileVanban;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;

/**
 *
 * @author :Tran Quang Huy
 */
class Pair{
    private String first;
    private int second;
    
    public Pair(String first, int second) {
        this.first = first;
        this.second = second;
    }

    public String getFirst() {
        return first;
    }

    public int getSecond() {
        return second;
    }
    public String toString(){
        return this.first + " " + this.second;
    }
}
public class J07011 {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("VANBAN.in"));
        HashMap<String, Integer> map = new HashMap<>();
        int n = Integer.parseInt(sc.nextLine());
        for(int t = 0; t < n; t++){
            String s = sc.nextLine() + " ";
            String x = "";
            for(int i = 0; i < s.length(); i++){
                if(Character.isAlphabetic(s.charAt(i)) || Character.isDigit(s.charAt(i))){
                    x += Character.toLowerCase(s.charAt(i));
                }
                else{
                    if(x != ""){
                        if(map.containsKey(x)){
                            map.put(x, map.get(x) + 1);
                        }
                        else{
                            map.put(x, 1);
                        }
                        x = "";
                    }
                }
            }
        }
        ArrayList<Pair> list = new ArrayList<>();
        for(Map.Entry<String, Integer> x : map.entrySet()){
            list.add(new Pair(x.getKey(), x.getValue()));
        }
        Collections.sort(list, new Comparator<Pair>(){
            @Override
            public int compare(Pair o1, Pair o2) {
                if(o1.getSecond() == o2.getSecond())
                    return o1.getFirst().compareTo(o2.getFirst());
                return o2.getSecond() - o1.getSecond();
            }
        });
        for(Pair x : list){
            System.out.println(x);
        }
    }
}
