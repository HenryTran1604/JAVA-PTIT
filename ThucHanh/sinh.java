/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ThucHanh;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Scanner;

/**
 *
 * @author :Tran Quang Huy
 */
public class sinh {
    private static HashMap <String, HashSet<String>> isA = new HashMap<>();
    private static HashMap <String, HashSet<String>> hasA = new HashMap<>();
    private static HashSet <Integer> vis = new HashSet<>();
    public static boolean dfsHasA(int s, String d){
//        System.out.println(s + " " + d);
//        vis.add(s);
        System.out.println(s);
        if(s == 3) return true;
//        if(isA.containsKey(s) && isA.get(s).contains(d)) return true;
//        if(hasA.containsKey(s)){
            for(int i = s + 1; i < 4; i++){
//                if(!vis.contains(i)){
                    if(dfsHasA(i, d)){
                        return true;
                    }
//                }
            }
//        }
//        if(isA.containsKey(s)){
            for(int i = s + 1; i < 4; i++){
//                if(!vis.contains(i)){
                    if(dfsHasA(i, d)){
                        return true;
                    }
//                }
            }
//        }
        return false;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt(), m = sc.nextInt();
        dfsHasA(1, "");
    }
}