/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package J07075_LichGiangDayTheoGiangVien;

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
        String giangVienCanTim = sc.nextLine();
        System.out.println("LICH GIANG DAY GIANG VIEN " + giangVienCanTim + ":");
        listHp.sort(new Comparator<NhomHocPhan>(){
            @Override
            public int compare(NhomHocPhan o1, NhomHocPhan o2) {
                if(o1.getNgay() == o2.getNgay()){
                    return o1.getKip() - o2.getKip();
                }
                return o1.getNgay() - o2.getNgay();
            }
            
        });
        for(NhomHocPhan x : listHp){
            if(x.getGiangVien().equals(giangVienCanTim)){
                System.out.print(x.getMaNhom() + " ");
                for(MonHoc y : listMh){
                    if(x.getMaMon().equals(y.getMaMon())){
                        System.out.print(y.getTenMon() + " ");
                        break;
                    }
                }
                System.out.println(x.getNgay() + " " + x.getKip() + " " + x.getPhongHoc());
            }
        }
    }
}
