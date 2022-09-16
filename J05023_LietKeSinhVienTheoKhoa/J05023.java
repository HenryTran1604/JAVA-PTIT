/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package J05023_LietKeSinhVienTheoKhoa;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
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
    
    @Override
    public String toString(){
        return this.maSV + " " + this.hoTen + " " + this.lop + " " + this.email; 
    }
}
public class J05023 {
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
        while(q-- > 0){
            String khoaCanTim = sc.next();
            System.out.println("DANH SACH SINH VIEN KHOA " + khoaCanTim + ":");
            for(SinhVien x : list){
                if(x.getLop().substring(1, 3).equals(khoaCanTim.substring(2, 4))){
                    System.out.println(x);
                }
            }
        }
    }
}
