/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package J05031_BangDiemThanhPhan2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

/**
 *
 * @author admin
 */
class SinhVien{
    private String maSV, hoTen, lop;
    private float d1, d2, d3;

    public SinhVien(String maSV, String hoTen, String lop, float d1, float d2, float d3) {
        this.maSV = maSV;
        this.hoTen = hoTen;
        this.lop = lop;
        this.d1 = d1;
        this.d2 = d2;
        this.d3 = d3;
    }

    public String getHoTen() {
        return hoTen;
    }

    
    @Override
    public String toString(){
        return this.maSV + " " + this.hoTen + " " + this.lop + " " + String.format("%.1f %.1f %.1f", this.d1, this.d2, this.d3);
    }
}
public class J05031 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList <SinhVien> list = new ArrayList<>();
        for(int i = 0; i < n; i++){
            String maSV = sc.next();
            sc.nextLine();
            String hoTen = sc.nextLine();
            String lop = sc.next();
            float d1 = sc.nextFloat();
            float d2 = sc.nextFloat();
            float d3 = sc.nextFloat();
            list.add(new SinhVien(maSV, hoTen, lop, d1, d2, d3));
        }
        Collections.sort(list, new Comparator<SinhVien>(){
            @Override
            public int compare(SinhVien o1, SinhVien o2) {
                return o1.getHoTen().compareTo(o2.getHoTen());
            }
        });
        for(int i = 0; i < n; i++){
            System.out.print(i + 1 + " ");
            System.out.println(list.get(i));
        }
    }
}
