/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package J05012_TinhTien;

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
        ArrayList <HoaDon> list = new ArrayList<>();
        while(n-- > 0){
            String maMatHang = sc.next();
            sc.nextLine();
            String tenMatHang = sc.nextLine();
            long soLuong = sc.nextLong();
            long donGia = sc.nextLong();
            long chietKhau = sc.nextLong();
            list.add(new HoaDon(maMatHang, tenMatHang, soLuong, donGia, chietKhau));
        }
        Collections.sort(list, new Comparator<HoaDon>(){
            @Override
            public int compare(HoaDon o1, HoaDon o2) {
                if(o1.tongTien() < o2.tongTien())
                    return 1;
                return -1;
            }
        });
        for(HoaDon x : list){
            System.out.println(x);
        }
    }
}
