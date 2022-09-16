/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package J07054_TinhDiemTrungBinh;

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
    private int xepLoai;
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
        return (this.d1 * 3 + this.d2 * 3 + this.d3 * 2) / 8;
    }
    public void setXepLoai(int i){
        this.xepLoai = i;
    }
    @Override
    public String toString(){
        return this.maSV + " " + this.hoTen + " " + String.format( "%.2f",this.diemTrungBinh()) + " " + this.xepLoai;
    }
}
public class J07054 {
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
                if(o1.diemTrungBinh() == o2.diemTrungBinh()){
                    return o1.getMaSV().compareTo(o2.getMaSV());
                }
                if(o1.diemTrungBinh() < o2.diemTrungBinh())
                    return 1;
                return -1;
            }
        });
        double diem = -1;
        int rank = 0, cnt = 1;
        for(int i = 0; i < n; i++){
            if(list.get(i).diemTrungBinh() == diem){
                list.get(i).setXepLoai(rank);
                cnt++;
            }
            else{
                rank += cnt;
                list.get(i).setXepLoai(rank);
                diem = list.get(i).diemTrungBinh();
                cnt = 1;
            }
        }
        for(SinhVien x : list){
            System.out.println(x);
        }
    }
}
