/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package J05021_SapXepTheoMaSinhVien;

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
public class J05021 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList <SinhVien> list = new ArrayList<>();
        while(sc.hasNext()){
            String maSV = sc.nextLine();
            String hoTen = sc.nextLine();
            String lop = sc.nextLine();
            String email = sc.nextLine();
            list.add(new SinhVien(maSV, hoTen, lop, email));
        }
        Collections.sort(list, new Comparator<SinhVien>(){
            @Override
            public int compare(SinhVien o1, SinhVien o2) {
                return o1.getMaSV().compareTo(o2.getMaSV());
            }
        });
        for(SinhVien x : list){
            System.out.println(x);
        }
    }
}
