/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package J05062_HocBongSinhVien;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

/**
 *
 * @author :Tran Quang Huy
 */
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), m = sc.nextInt();
        ArrayList <SinhVien> list = new ArrayList<>(), list2;
        for(int i = 0; i < n; i++){
            sc.nextLine();
            String hoTen = sc.nextLine();
            double gpa = sc.nextDouble(), drl = sc.nextDouble();
            list.add(new SinhVien(hoTen, gpa, drl));
        }
        list2 = (ArrayList<SinhVien>)list.clone();
        list2.sort(new Comparator<SinhVien>(){
            @Override
            public int compare(SinhVien o1, SinhVien o2) {
                if(o1.getGpa() > o2.getGpa())
                    return 1;
                return -1;
            }
        });
        double d = list2.get(m-1).getGpa();
        for(SinhVien x : list){
            x.setLoaiHb(d);
            System.out.println(x);
        }
    }
}
