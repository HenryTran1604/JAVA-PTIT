/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package J07072_ChuanHoaVaSapXep;

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
public class J07072 {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("DANHSACH.in"));
        ArrayList <String> list = new ArrayList<>();
        while(sc.hasNext()){
            String s = sc.nextLine();
            String[] arr = s.trim().split("\\s+");
            StringBuilder sb = new StringBuilder();
            for(String x : arr){
                sb.append(Character.toUpperCase(x.charAt(0)));
                for(int j = 1; j < x.length(); j++){
                    sb.append(Character.toLowerCase(x.charAt(j)));
                }
                sb.append(" ");
            }
            sb.deleteCharAt(sb.length() - 1);
            list.add(sb.toString());
        }
        Collections.sort(list, new Comparator<String>(){
            @Override
            public int compare(String o1, String o2) {
                String[] arr1 = o1.split(" ");
                String[] arr2 = o2.split(" ");
                if(arr1[arr1.length - 1].equals(arr2[arr2.length - 1])){
                    int i = 0, j = 0;
                    while(i < arr1.length - 1 && j < arr2.length - 1){
                        if(!arr1[i].equals(arr2[j])){
                            return arr1[i].compareTo(arr2[j]);
                        }
                        i++; j++;
                    }
                }
                return arr1[arr1.length - 1].compareTo(arr2[arr2.length - 1]);
            }
        });
        for(String x : list){
            System.out.println(x);
        }
    }
}
