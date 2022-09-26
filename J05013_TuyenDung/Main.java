/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package J05013_TuyenDung;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

/**
 *
 * @author :Tran Quang Huy
 */
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList <ThiSinh> list = new ArrayList<>();
        while(n-- > 0){
            sc.nextLine();
            String hoTen = sc.nextLine();
            double lt = sc.nextDouble();
            double th = sc.nextDouble();
            if(lt > 10) lt /= 10;
            if(th > 10) th /= 10;
            list.add(new ThiSinh(hoTen, lt, th));
        }
        Collections.sort(list, new Comparator<ThiSinh>(){
            @Override
            public int compare(ThiSinh o1, ThiSinh o2) {
                if(o1.diemTB() < o2.diemTB()){
                    return 1;
                }
                return -1;
            }
        });
        for(ThiSinh x : list){
            System.out.println(x);
        }
    }
}

