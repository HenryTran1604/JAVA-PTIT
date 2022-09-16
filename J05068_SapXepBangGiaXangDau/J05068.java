/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package J05068_SapXepBangGiaXangDau;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

/**
 *
 * @author admin
 */
class DonHang{
    private String maDonHang;
    private int soLuong;

    public DonHang(String maDonHang, int soLuong) {
        this.maDonHang = maDonHang;
        this.soLuong = soLuong;
    }
    public String hangSanXuat(){
        String tmp = this.maDonHang.substring(3, 5);
        if(tmp.equals("BP"))
            return "British Petro";
        if(tmp.equals("ES"))
            return "Esso";
        if(tmp.equals("SH"))
            return "Shell";
        if(tmp.equals("CA"))
            return "Castrol";
        if(tmp.equals("MO"))
            return "Mobil";
        return "Trong Nuoc";
    }
    public int donGia(){
        char c = this.maDonHang.charAt(0);
        if(c == 'X')
            return 128000;
        if(c == 'D')
            return 11200;
        return 9700;
    }
    public long thue(){
        char c = this.maDonHang.charAt(0);
        double t = 0;
        if(this.maDonHang.substring(3, 5).equals("TN"))
            t = 0;
        else if(c == 'X')
            t = 0.03;
        else if(c == 'D')
            t = 0.035;
        else
            t = 0.02;
        return (long)(1l * this.donGia() * this.soLuong * t);
    }
    public long thanhTien(){
        return 1l * this.soLuong * this.donGia() + this.thue();
    }
    @Override
    public String toString(){
        return this.maDonHang + " " + this.hangSanXuat() + " " + this.donGia()
                + " " + this.thue() + " " + this.thanhTien();
    }
}
public class J05068 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList <DonHang> list = new ArrayList<>();
        while(n-- > 0){
            String maDonHang = sc.next();
            int soLuong = sc.nextInt();
            list.add(new DonHang(maDonHang, soLuong));
        }
        Collections.sort(list, new Comparator<DonHang>(){
            @Override
            public int compare(DonHang o1, DonHang o2) {
                if(o1.thanhTien() < o2.thanhTien())
                    return 1;
                return -1;
            }
        });
        for(DonHang x : list){
            System.out.println(x);
        }
    }
}

