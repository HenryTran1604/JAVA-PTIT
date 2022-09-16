/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package J05036_TinhGiaBan1;

import java.util.ArrayList;
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
        return Math.round(this.thanhTien() * 1.02f);
    }
    
    @Override
    public String toString(){
        return this.maHang + " " + this.tenHang + " " + this.donViTinh +  " " + this.phiVanChuyen() + " " + this.thanhTien() + " " + this.giaBan();
    }
}
public class J05036 {
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
        for(MatHang x : list){
            System.out.println(x);
        }
    }
}
