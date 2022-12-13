/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ThucHanh;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

/**
 *
 * @author :Tran Quang Huy
 */
public class ChuanHoaVaSapXep {
    public static String chuanHoa(String s){
        String[] arr = s.trim().split("\\s+");
        StringBuilder sb = new StringBuilder();
        for(String x : arr){
            sb.append(Character.toUpperCase(x.charAt(0)));
            for(int j = 1; j < x.length(); j++){
                sb.append(Character.toLowerCase(x.charAt(j)));
            }
            sb.append(" ");
        }
        return sb.toString().trim();
    }
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("DANHSACH.in"));
        ArrayList <String> list = new ArrayList<>();
        while(sc.hasNextLine()){
            list.add(chuanHoa(sc.nextLine()));
        }
        Collections.sort(list, new Comparator<String>(){
            @Override
            public int compare(String o1, String o2) {
                String[] arr1 = o1.split(" ");
                String[] arr2 = o2.split(" ");
                String cm1 = arr1[arr1.length - 1] + " " + o1;
                String cm2 = arr2[arr2.length - 1] + " " + o2;
                return cm1.compareTo(cm2);
            }
        });
        for(String x : list){
            System.out.println(x);
        }
    }
}
