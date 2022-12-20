/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package J07028_TinhGioChuan;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

/**
 *
 * @author :Tran Quang Huy
 */
public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("MONHOC.in"));
        HashMap<String, MonHoc> mapMon = new HashMap<>();
        int n = sc.nextInt();
        for(int i = 0; i < n; i++){
            String maMon = sc.next();
            String tenMon = sc.nextLine().trim();
            mapMon.put(maMon, new MonHoc(maMon, tenMon));
        }
        sc.close();
        sc = new Scanner(new File("GIANGVIEN.in"));
        HashMap<String, GiangVien> mapGv = new HashMap<>();
        ArrayList <GiangVien> listGv = new ArrayList<>();
        int m = sc.nextInt();
        for(int i = 0; i < m; i++){
            String maGv = sc.next();
            String tenGv = sc.nextLine().trim();
            mapGv.put(maGv, new GiangVien(maGv, tenGv));
            listGv.add(new GiangVien(maGv, tenGv));
        }
        sc.close();
        sc = new Scanner(new File("GIOCHUAN.in"));
        ArrayList <GioChuan> listGio = new ArrayList<>();
        int p = sc.nextInt();
        for(int i = 0; i < p; i++){
            String maGv = sc.next(), maMon = sc.next();
            float gio = sc.nextFloat();
            listGio.add(new GioChuan(mapGv.get(maGv), mapMon.get(maMon), gio));
        }
        for(GiangVien gv : listGv){
            float tong = 0;
            for(GioChuan x : listGio){
                if(x.getGv().getMaGv().equals(gv.getMaGv())){
                    tong += x.getGioChuan();
                }
            }
            System.out.println(gv.getTenGv() + " " + String.format("%.2f", tong));
        }
    }
}
