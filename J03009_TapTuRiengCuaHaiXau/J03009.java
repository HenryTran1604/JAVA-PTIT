/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package J03009_TapTuRiengCuaHaiXau;

import java.util.Scanner;
import java.util.Map;
import java.util.TreeMap;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Set;
import java.util.TreeSet;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Collections;
import java.util.Comparator;
import java.util.Arrays;
import java.util.ArrayList;
import java.util.List;
import java.io.File;
/**
 *
 * @author admin
 */
public class J03009 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        while(t-- > 0){
            String s1 = sc.nextLine(), s2 = sc.nextLine();
            String[] arr1 = s1.split("\\s+");
            String[] arr2 = s2.split("\\s+");
            TreeSet<String> set1 = new TreeSet<>(), set2 = new TreeSet<>();
            for(String x : arr1)
                set1.add(x);
            for(String x : arr2)
                set2.add(x);
            for(String x : set1)
                if(!set2.contains(x)){
                    System.out.print(x + " ");
                }
            System.out.println("");
        }
    }
}
