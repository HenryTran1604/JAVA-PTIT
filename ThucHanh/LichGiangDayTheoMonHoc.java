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
class monhoc{
    private String maMon, tenMon;
    private int soTinChi;

    public monhoc(String maMon, String tenMon, int soTinChi) {
        this.maMon = maMon;
        this.tenMon = tenMon;
        this.soTinChi = soTinChi;
    }

    public String getMaMon() {
        return maMon;
    }

    public String getTenMon() {
        return tenMon;
    }
    
}
class LopHocPhan{
    private String maNhom, maMon;
    private int ngay, kip;
    private String giangVien, phongHoc;
    public LopHocPhan(int id, String maMon, int ngay, int kip, String giangVien, String phongHoc) {
        this.maNhom = String.format("HP%03d", id);
        this.maMon = maMon;
        this.ngay = ngay;
        this.kip = kip;
        this.giangVien = giangVien;
        this.phongHoc = phongHoc;
    }

    public String getMaNhom() {
        return maNhom;
    }

    public String getMaMon() {
        return maMon;
    }

    public int getNgay() {
        return ngay;
    }

    public int getKip() {
        return kip;
    }

    public String getGiangVien() {
        return giangVien;
    }

    public String getPhongHoc() {
        return phongHoc;
    }
    public String toString(){
        return this.maNhom + " " + this.ngay + " " + this.kip + " " + this.giangVien + " " + this.phongHoc;
    }
}
public class LichGiangDayTheoMonHoc {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("MONHOC.in"));
        int n = Integer.parseInt(sc.nextLine());
        ArrayList<monhoc> listMh = new ArrayList<>();
        for(int i = 0; i < n; i++){
            String maMh = sc.nextLine();
            String tenMh = sc.nextLine();
            int soTc = Integer.parseInt(sc.nextLine());
            listMh.add(new monhoc(maMh, tenMh, soTc));
        }
        sc = new Scanner(new File("LICHGD.in"));
        int m = Integer.parseInt(sc.nextLine());
        ArrayList<LopHocPhan> listHp = new ArrayList<>();
        for(int i = 1; i <= m; i++){
            String maMon = sc.nextLine();
            int thu = Integer.parseInt(sc.nextLine());
            int kip = Integer.parseInt(sc.nextLine());
            String gv = sc.nextLine();
            String phongHoc = sc.nextLine();
            listHp.add(new LopHocPhan(i, maMon, thu, kip, gv, phongHoc));
        }
        Collections.sort(listHp, new Comparator<LopHocPhan>(){
            @Override
            public int compare(LopHocPhan o1, LopHocPhan o2) {
                if(o1.getNgay() == o2.getNgay()){
                    if(o1.getKip() == o2.getKip()){
                        return o1.getGiangVien().compareTo(o2.getGiangVien());
                    }
                    return o1.getKip() - o2.getKip();
                }
                return o1.getNgay() - o2.getNgay();
            }
        });
        String maMonCanTim = sc.nextLine();
        System.out.print("LICH GIANG DAY MON ");
        for(monhoc x : listMh){
            if(x.getMaMon().equals(maMonCanTim)){
                System.out.println(x.getTenMon()+":");
                break;
            }
        }
        for(LopHocPhan x : listHp){
            if(x.getMaMon().equals(maMonCanTim)){
                System.out.println(x);
            }
        }
    }
}
