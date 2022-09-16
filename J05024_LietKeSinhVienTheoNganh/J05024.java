/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package J05024_LietKeSinhVienTheoNganh;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 *
 * @author admin
 */
class SinhVien{
    private String maSV, hoTen, lop, email;

    public SinhVien(String maSV, String hoTen, String lop, String email) {
        this.maSV = maSV;
        this.hoTen = hoTen;
        this.lop = lop;
        this.email = email;
    }

    public String getMaSV() {
        return maSV;
    }

    public String getLop() {
        return lop;
    }
    public String nganhHoc(){
        String tmp = this.maSV.substring(5, 7);
        if(this.lop.charAt(0) != 'E' && tmp.equals("CN"))
            return "CONG NGHE THONG TIN";
        if(tmp.equals("KT"))
            return "KE TOAN";
        if(this.lop.charAt(0) != 'E' && tmp.equals("AT"))
            return "AN TOAN THONG TIN";
        if(tmp.equals("VT"))
            return "VIEN THONG";
        if(tmp.equals("DT"))
            return "DIEN TU";
        return "";
    }
    @Override
    public String toString(){
        return this.maSV + " " + this.hoTen + " " + this.lop + " " + this.email; 
    }
}
public class J05024 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList <SinhVien> list = new ArrayList<>();
        while(n-- > 0){
            String maSV = sc.next();
            sc.nextLine();
            String hoTen = sc.nextLine();
            String lop = sc.nextLine();
            String email = sc.nextLine();
            list.add(new SinhVien(maSV, hoTen, lop, email));
        }
        int q = sc.nextInt();
        sc.nextLine();
        while(q-- > 0){
            String nganhCanTim = sc.nextLine();
            nganhCanTim = nganhCanTim.toUpperCase();
            System.out.println("DANH SACH SINH VIEN NGANH " + nganhCanTim + ":");
            for(SinhVien x : list){
                if(x.nganhHoc().equals(nganhCanTim)){
                    System.out.println(x);
                }
            }
        }
    }
}
