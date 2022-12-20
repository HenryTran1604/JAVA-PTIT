/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package J06008_TinhGioChuanChoTungGiaoVien;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

/**
 *
 * @author :Tran Quang Huy
 */
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        HashMap <String, MonHoc> mapMh = new HashMap<>();
        int n = sc.nextInt();
        for(int i = 0; i < n; i++){
            String maMh = sc.next();
            String tenMh = sc.nextLine().trim();
            mapMh.put(maMh, new MonHoc(maMh, tenMh));
        }
        HashMap <String, GiaoVien> mapGv = new HashMap<>();
        int m = sc.nextInt();
        for(int i = 0; i < m; i++){
            String maGv = sc.next();
            String tenGv = sc.nextLine().trim();
            mapGv.put(maGv, new GiaoVien(maGv, tenGv));
        }
        ArrayList <LopHocPhan> listLop = new ArrayList<>();
        int q = sc.nextInt();
        for(int i = 0; i < q; i++){
            String maGv = sc.next(), maMh = sc.next();
            float gioChuan = sc.nextFloat();
            listLop.add(new LopHocPhan(mapGv.get(maGv), mapMh.get(maMh), gioChuan));
        }
        String magv = sc.next();
        System.out.println("Giang vien: " + mapGv.get(magv));
        float tong = 0;
        for(LopHocPhan x : listLop){
            if(x.getGv().getMaGV().equals(magv)){
                System.out.println(mapMh.get(x.getMonHoc().getMaMon()) + " " + x.getSoGio());
                tong += x.getSoGio();
            }
        }
        System.out.printf("Tong: %.2f", tong);
    }
}
