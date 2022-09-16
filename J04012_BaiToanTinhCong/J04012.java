/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package J04012_BaiToanTinhCong;

import java.util.Scanner;

/**
 *
 * @author admin
 */
class NhanVien{
    private String maNhanVien, hoTen;
    private int luongCoBan, soNgayCong;
    private String chucVu;
    private static int id = 1;

    public NhanVien(String hoTen, int luongCoBan, int soNgayCong, String chucVu) {
        this.maNhanVien = "NV" + String.format("%02d", id++);
        this.hoTen = hoTen;
        this.luongCoBan = luongCoBan;
        this.soNgayCong = soNgayCong;
        this.chucVu = chucVu;
    }
    public int tienLuong(){
        return this.luongCoBan * this.soNgayCong;
    }
    public int tienThuong(){
        if(this.soNgayCong >= 25) return (int) (0.2*this.tienLuong());
        if(this.soNgayCong >= 22) return (int)(0.1*this.tienLuong());
        return 0;
    }
    public int phuCap(){
        if(this.chucVu.equals("GD")) return 250000;
        if(this.chucVu.equals("PGD")) return 200000;
        if(this.chucVu.equals("TP")) return 180000;
        return 150000;
    }
    public int thuNhap(){
        return this.tienLuong() + this.tienThuong() + this.phuCap();
    }
    @Override
    public String toString(){
        return this.maNhanVien + " " + this.hoTen + " " + this.tienLuong() + " " + this.tienThuong() + " " + this.phuCap() + " " + this.thuNhap();
    }
    
}
public class J04012 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String hoTen  = sc.nextLine();
        int luongCoBan = sc.nextInt();
        int soNgayCong = sc.nextInt();
        String chucVu = sc.next();
        NhanVien nv = new NhanVien(hoTen, luongCoBan, soNgayCong, chucVu);
        System.out.println(nv);
    }
}
