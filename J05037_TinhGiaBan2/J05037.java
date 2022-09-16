/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package J05037_TinhGiaBan2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

/**
 *
 * @author admin
 */
class MatHang{
    private String maHang, tenHang, donViTinh;
    private int donGia, soLuong;
    private static int id = 1;
    public MatHang(String tenHang, String donViTinh, int donGia, int soLuong) {
        this.maHang = "MH" + String.format("%02d", id++);
        this.tenHang = tenHang;
        this.donViTinh = donViTinh;
        this.donGia = donGia;
        this.soLuong = soLuong;
    }
   
    public int phiVanChuyen(){
        return Math.round(this.donGia*this.soLuong*0.05f);
    }
    public int thanhTien(){
        return this.donGia * this.soLuong + this.phiVanChuyen();
    }
    public int giaBan(){
        return (int) Math.ceil(this.thanhTien() * 0.0102f/this.soLuong) * 100;
    }
    
    @Override
    public String toString(){
        return this.maHang + " " + this.tenHang + " " + this.donViTinh +  " " + this.phiVanChuyen() + " " + this.thanhTien() + " " + this.giaBan();
    }
}
public class J05037 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList <MatHang> list = new ArrayList<>();
        while(n -- > 0){
            sc.nextLine();
            String tenHang = sc.nextLine();
            String donViTinh = sc.nextLine();
            int donGia = sc.nextInt();
            int soLuong = sc.nextInt();
            list.add(new MatHang(tenHang, donViTinh, donGia, soLuong));
        }
        Collections.sort(list, new Comparator<MatHang>(){
            @Override
            public int compare(MatHang o1, MatHang o2) {
                if(o1.giaBan() > o2.giaBan())
                    return -1;
                if(o1.giaBan() == o2.giaBan())
                    return 0;
                return 1;
            }
        });
        for(MatHang x : list){
            System.out.println(x);
        }
    }
}


