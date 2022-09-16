/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package J07071_TenVietTat;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

/**
 *
 * @author admin
 */

public class J07071 {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("DANHSACH.in"));
        ArrayList <String> list = new ArrayList<>();
        int n = sc.nextInt();
        sc.nextLine();
        for(int i = 0; i < n; i++){
            String fullname = sc.nextLine();
            list.add(fullname);
        }
        int q = sc.nextInt();
        while(q-- > 0){
            String s = sc.next();
            s = s.toUpperCase();
            ArrayList <String> ans = new ArrayList<>();
            for(String x : list){
                String[] arr = x.split("\\s+");
                if(arr.length != (s.length() + 1) / 2)
                    continue;
                int cnt; // * => 1
                if(s.contains("*"))
                    cnt = 1;
                else
                    cnt = 0;
                for(int j = 0; j < s.length(); j += 2){
//                    System.out.println(s.charAt(j) + " " + arr[j/2].charAt(0));
                    if(s.charAt(j) != arr[j/2].charAt(0))
                        cnt --;
                    if(cnt < 0) break;
                }
                if(cnt >= 0) ans.add(x);
            }
            Collections.sort(ans, new Comparator<String>(){
                @Override
                public int compare(String o1, String o2) {
                    String[] arr1 = o1.split("\\s+");
                    String[] arr2 = o2.split("\\s+");
                    if(arr1[arr1.length - 1].equals(arr2[arr2.length - 1]))
                        return arr1[0].compareTo(arr2[0]);
                    return arr1[arr1.length - 1].compareTo(arr2[arr2.length - 1]);
                }
            });
            for(String x : ans){
                System.out.println(x);
            }
        }
    }
}
