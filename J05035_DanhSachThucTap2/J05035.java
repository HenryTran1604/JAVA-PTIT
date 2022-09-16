/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package J05035_DanhSachThucTap2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

/**
 *
 * @author admin
 */
class SinhVien{
    private int stt;
    private String maSinhVien, hoTen, lop, email, doanhNghiep;

    public SinhVien(int stt, String maSinhVien, String hoTen, String lop, String email, String doanhNghiep) {
        this.stt = stt;
        this.maSinhVien = maSinhVien;
        this.hoTen = hoTen;
        this.lop = lop;
        this.email = email;
        this.doanhNghiep = doanhNghiep;
    }

    public String getMaSinhVien() {
        return maSinhVien;
    }



    public String getDoanhNghiep() {
        return doanhNghiep;
    }
    
    @Override
    public String toString(){
        return this.stt + " " + this.maSinhVien + " " + this.hoTen + " " + this.lop + " " + this.email + " " + this.doanhNghiep;
    }
}
public class J05035 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList <SinhVien> list = new ArrayList<>();
        for(int i = 0; i < n; i++){
            String maSinhVien = sc.next();
            sc.nextLine();
            String hoTen = sc.nextLine();
            String lop = sc.next();
            String email = sc.next();
            String doanhNghiep = sc.next();
            list.add(new SinhVien(i + 1, maSinhVien, hoTen, lop, email, doanhNghiep));
        }
        Collections.sort(list, new Comparator<SinhVien>(){
            @Override
            public int compare(SinhVien o1, SinhVien o2) {
                return o1.getMaSinhVien().compareTo(o2.getMaSinhVien());
            }
        });
        int q = sc.nextInt();
        while(q-- > 0){
            String dn = sc.next();
            for(SinhVien x : list){
                if(x.getDoanhNghiep().equals(dn)){
                    System.out.println(x);
                }
            }
        }
    }
}
