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
public class QuanHeGiuaCacLop {
    private static HashMap <String, HashSet<String>> isA = new HashMap<>();
    private static HashMap <String, HashSet<String>> hasA = new HashMap<>();
    private static HashSet <String> vis = new HashSet<>();
    public static boolean dfsHasA(String s, String d){
//        System.out.println(s + " " + d);
        vis.add(s);
        if(hasA.containsKey(s) && hasA.get(s).contains(d)) return true;
        if(isA.containsKey(s) && isA.get(s).contains(d)) return true;
        if(hasA.containsKey(s)){
            for(String x : hasA.get(s)){
                if(!vis.contains(x)){
                    if(dfsHasA(x, d)){
                        return true;
                    }
                }
            }
        }
        if(isA.containsKey(s)){
            for(String x : isA.get(s)){
                if(!vis.contains(x)){
                    if(dfsHasA(x, d)){
                        return true;
                    }
                }
            }
        }
        vis.remove(s);
        return false;
    }
    public static boolean dfsIsA(String s, String d){
//        System.out.println(s + " " + d);
        vis.add(s);
        if(isA.containsKey(s) && isA.get(s).contains(d)) return true;
        if(isA.containsKey(s)){
            for(String x : isA.get(s)){
                if(!vis.contains(x)){
                    if(dfsIsA(x, d))
                        return true;
                }
                
            }
        }
        
        return false;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), m = sc.nextInt();
        sc.nextLine();
        for(int i = 0; i < n; i++){
            String s = sc.nextLine();
            String[] arr = s.split("\\s+");
            if(arr[1].equals("is-a")){
                if(isA.containsKey(arr[0])){
                    HashSet <String> tmp = isA.get(arr[0]);
                    tmp.add(arr[2]);
                    isA.put(arr[0], tmp);
                }
                else{
                    HashSet <String> tmp = new HashSet<>();
                    tmp.add(arr[2]);
                    isA.put(arr[0], tmp);
                }
            }
            else{
                if(hasA.containsKey(arr[0])){
                    HashSet <String> tmp = hasA.get(arr[0]);
                    tmp.add(arr[2]);
                    hasA.put(arr[0], tmp);
                }
                else{
                    HashSet <String> tmp = new HashSet<>();
                    tmp.add(arr[2]);
                    hasA.put(arr[0], tmp);
                }
                
            }
        }
        for(int i = 0; i < m; i++){
            String q = sc.nextLine();
            vis.clear();
            String[] arr = q.split("\\s+");
            vis.add(arr[0]);
            System.out.print("Query " + (i + 1) + ": ");
            if(arr[0].equals(arr[2]) && arr[1].equals("is-a")){
                System.out.println(true);
            }
            else{
                if(arr[1].equals("is-a")){
                    System.out.println(dfsIsA(arr[0], arr[2]));
                }
                else{
                    System.out.println(dfsHasA(arr[0], arr[2]));
                }
            }
            
        }
    }
}