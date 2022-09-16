/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package J07055_XepLoai;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

/**
 *
 * @author admin
 */
class SinhVien{
    private String maSV, hoTen;
    private double d1, d2, d3;
    private static int id = 1;

    public SinhVien(String hoTen, double d1, double d2, double d3) {
        this.maSV = "SV" + String.format("%02d", id++);
        this.hoTen = hoTen;
        this.d1 = d1;
        this.d2 = d2;
        this.d3 = d3;
    }
    public void chuanHoaTen(){
        String[] arr = this.hoTen.trim().split("\\s+");
        StringBuilder sb = new StringBuilder();
        for(String x : arr){
            sb.append(Character.toUpperCase(x.charAt(0)));
            for(int j = 1; j < x.length(); j++){
                sb.append(Character.toLowerCase(x.charAt(j)));
            }
            sb.append(" ");
        }
        sb.deleteCharAt(sb.length() - 1);
        this.hoTen = sb.toString();
    }

    public String getMaSV() {
        return maSV;
    }
    public double diemTrungBinh(){
        return this.d1 * 0.25 + this.d2 * 0.35 + this.d3 * 0.4;
    }
    public String xepLoai(){
        double diem = this.diemTrungBinh();
        if(diem >= 8) return "GIOI";
        if(diem >= 6.5) return "KHA";
        if(diem >= 5) return "TRUNG BINH";
        return "KEM";
    }
    @Override
    public String toString(){
        return this.maSV + " " + this.hoTen + " " + String.format( "%.2f",this.diemTrungBinh()) + " " + this.xepLoai();
    }
}
public class J07055 {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("BANGDIEM.in"));
        int n = sc.nextInt();
        ArrayList <SinhVien> list = new ArrayList<>();
        for(int i = 0; i < n; i++){
            sc.nextLine();
            String hoTen = sc.nextLine();
            double d1 = sc.nextDouble();
            double d2 = sc.nextDouble();
            double d3 = sc.nextDouble();
            SinhVien sv = new SinhVien(hoTen, d1, d2, d3);
            sv.chuanHoaTen();
            list.add(sv);
        }
        Collections.sort(list, new Comparator<SinhVien>(){
            @Override
            public int compare(SinhVien o1, SinhVien o2) {
                if(o1.diemTrungBinh() < o2.diemTrungBinh())
                    return 1;
                return -1;
            }
        });
        
        for(SinhVien x : list){
            System.out.println(x);
        }
    }
}
