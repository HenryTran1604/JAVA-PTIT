/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package J05077_TinhLuong;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 *
 * @author :Tran Quang Huy <HenryTran at github.com/Henrytran1604>
 */
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Map <String, String> map = new HashMap<>();
        for(int i = 0; i < n; i++){
            String maPB = sc.next();
            String tenPB = sc.nextLine().substring(1);
            map.put(maPB, tenPB);
        }
        int m = sc.nextInt();
        ArrayList <NhanVien> listNV = new ArrayList<>();
        for(int i = 0; i < m; i++){
            String ma = sc.next();
            sc.nextLine();
            String ten = sc.nextLine();
            int luongCoBan = sc.nextInt();
            int soNgayCong = sc.nextInt();
            NhanVien x = new NhanVien(ma, ten, luongCoBan, soNgayCong);
            String t = ma.substring(3);
            x.SetPhongBan(map.get(t));
            listNV.add(x);
        }
        for(NhanVien x : listNV){
            System.out.println(x);
        }
    }
}
