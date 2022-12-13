/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package J07074_LichGiangDayTheoMonHoc;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

/**
 *
 * @author :Tran Quang Huy
 */
public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("MONHOC.in"));
        int n = sc.nextInt();
        ArrayList <MonHoc> listMh = new ArrayList<>();
        for(int i = 0; i < n; i++){
            String maMh = sc.next();
            sc.nextLine();
            String tenMh = sc.nextLine();
            int soTinChi = sc.nextInt();
            listMh.add(new MonHoc(maMh, tenMh, soTinChi));
        }
        sc = new Scanner(new File("LICHGD.in"));
        int m = sc.nextInt();
        ArrayList <NhomHocPhan> listHp = new ArrayList<>();
        for(int i = 0; i < m; i++){
            String maMh = sc.next();
            int ngay = sc.nextInt();
            int kip = sc.nextInt();
            sc.nextLine();
            String giangVien = sc.nextLine();
            String phongHoc = sc.nextLine();
            listHp.add(new NhomHocPhan(i + 1, maMh, ngay, kip, giangVien, phongHoc));
        }
        String monCanTim = sc.next();
        System.out.print("LICH GIANG DAY MON ");
        for(MonHoc x : listMh){
            if(x.getMaMon().equals(monCanTim)){
                System.out.println(x.getTenMon() + ":");
                break;
            }
        }
        listHp.sort(new Comparator<NhomHocPhan>(){
            @Override
            public int compare(NhomHocPhan o1, NhomHocPhan o2) {
                if(o1.getNgay() == o2.getNgay()){
                    if(o1.getKip() == o2.getKip()){
                        return o1.getGiangVien().compareTo(o2.getGiangVien());
                    }
                    return o1.getKip() - o2.getKip();
                }
                return o1.getNgay() - o2.getNgay();
            }
            
        });
        for(NhomHocPhan x : listHp){
            if(x.getMaMon().equals(monCanTim)){
                System.out.println(x);
            }
        }
    }
}
