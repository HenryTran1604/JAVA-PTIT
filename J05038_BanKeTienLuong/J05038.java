/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package J05038_BanKeTienLuong;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author admin
 */
class NhanVien{
    private String maNV, tenNV;
    private int luongNgay, soNgayCong;
    private String chucVu;
    public static int id = 1, tongTienLuong = 0;

    public NhanVien(String tenNV, int luongNgay, int soNgayCong, String chucVu) {
        this.maNV = "NV" + String.format("%02d", id++);
        this.tenNV = tenNV;
        this.luongNgay = luongNgay;
        this.soNgayCong = soNgayCong;
        this.chucVu = chucVu;
        tongTienLuong += this.thuNhap();
    }
    public int luongThang(){
        return this.luongNgay * this.soNgayCong;
    }
    public int thuong(){
        if(this.soNgayCong >= 25)
            return (int) (this.luongThang() * 0.2);
        if(this.soNgayCong >= 22)
            return (int) (this.luongThang() * 0.1);
        return 0;
    }
    public int phuCap(){
        if(this.chucVu.equals("GD"))
            return 250000;
        if(this.chucVu.equals("PGD"))
            return 200000;
        if(this.chucVu.equals("TP"))
            return 180000;
        return 150000;
    }
    public int thuNhap(){
        return this.luongThang() + this.thuong() + this.phuCap();
    }
    @Override
    public String toString(){
        return this.maNV + " " + this.tenNV + " " + this.luongThang() + " " + this.thuong() + " " + this.phuCap() + " " + this.thuNhap();
    }
}
public class J05038 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList <NhanVien> list = new ArrayList<>();
        while(n-- > 0){
            sc.nextLine();
            String tenNV = sc.nextLine();
            int luongNgay = sc.nextInt();
            int soNgayCong = sc.nextInt();
            String chucVu = sc.next();
            list.add(new NhanVien(tenNV, luongNgay, soNgayCong, chucVu));
        
        }
        for(NhanVien x : list){
            System.out.println(x);
        }
        System.out.println("Tong chi phi tien luong: " + NhanVien.tongTienLuong);
    }
}
