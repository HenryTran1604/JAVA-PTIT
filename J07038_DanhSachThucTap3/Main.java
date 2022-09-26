/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package J07038_DanhSachThucTap3;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 *
 * @author :Tran Quang Huy
 */
public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        ArrayList <SinhVien> listSV = new ArrayList<>();
        ArrayList <DoanhNghiep> listDN = new ArrayList<>();
        Map<String, SinhVien> mapSV = new HashMap<>();
        Map<String, DoanhNghiep> mapDN = new HashMap<>();
        Scanner sc = new Scanner(new File("SINHVIEN.in"));
        int n = Integer.parseInt(sc.nextLine());
        while(n-- > 0){
            SinhVien sv = new SinhVien(sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextLine());
            sv.chuanHoaTen();
            mapSV.put(sv.getMaSinhVien(), sv);
            listSV.add(sv);
        }
        sc.close();
        sc = new Scanner(new File("DN.in"));
        int m = Integer.parseInt(sc.nextLine());
        while(m-- > 0){
            DoanhNghiep dn = new DoanhNghiep(sc.nextLine(), sc.nextLine(), Integer.parseInt(sc.nextLine()));
            mapDN.put(dn.getMaDoanhNghiep(), dn);
            listDN.add(dn);
        }
        sc.close();
        sc = new Scanner(new File("THUCTAP.in"));
        ArrayList <Pair<String, String>> listPair = new ArrayList<>();
        int p = Integer.parseInt(sc.nextLine());
        while(p-- > 0){
            listPair.add(new Pair<>(sc.next(), sc.next()));
        }
        int q = sc.nextInt();
        while(q-- > 0){
            String maDN = sc.next();
            System.out.println("DANH SACH THUC TAP TAI " + mapDN.get(maDN).getTenDoanhNghiep() + ":");
            ArrayList <SinhVien> pass = new ArrayList<>();
            for(Pair<String, String> x : listPair){
                if(x.getSecond().equals(maDN)){
                    pass.add(mapSV.get(x.getFirst()));
                }
            }
            Collections.sort(pass);
            int limit = mapDN.get(maDN).getSoSinhVien();
            for(int i = 0; i < Math.min(pass.size(), limit); i++){
                System.out.println(pass.get(i));
            }
        }
    }
}
