/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package J07048_DanhSachSanPham2;

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
class SanPham{
    private String maSP, tenSP;
    private int giaBan, thoiHanBH;

    public SanPham(String maSP, String tenSP, int giaBan, int thoiHanBH) {
        this.maSP = maSP;
        this.tenSP = tenSP;
        this.giaBan = giaBan;
        this.thoiHanBH = thoiHanBH;
    }

    public String getMaSP() {
        return maSP;
    }

    public int getGiaBan() {
        return giaBan;
    }
    
    @Override
    public String toString(){
        return this.maSP + " " + this.tenSP + " " + this.giaBan + " " + this.thoiHanBH;
    }
}
class sortByGiaBanThenMaSP implements Comparator<SanPham>{
    @Override
    public int compare(SanPham a, SanPham b){
        if(a.getGiaBan() == b.getGiaBan())
            return a.getMaSP().compareTo(b.getMaSP());
        return b.getGiaBan() - a.getGiaBan();
    }
}
public class J07048 {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("SANPHAM.in"));
        int n = sc.nextInt();
        ArrayList <SanPham> list = new ArrayList<>();
        for(int i = 0; i < n; i++){
            String maSP = sc.next();
            sc.nextLine();
            String tenSP = sc.nextLine();
            int giaBan = sc.nextInt();
            int thoiHanBH = sc.nextInt();
            list.add(new SanPham(maSP, tenSP, giaBan, thoiHanBH));
        }
        Collections.sort(list, new sortByGiaBanThenMaSP());
        for(SanPham x : list){
            System.out.println(x);
        }
    }
}
