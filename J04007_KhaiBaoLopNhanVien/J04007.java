/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package J04007_KhaiBaoLopNhanVien;

import java.util.Scanner;

/**
 *
 * @author admin
 */
class NhanVien{
    private String maNhanVien, hoTen, gioiTinh, ngaySinh, diaChi, maSoThue, ngayKiHD;

    public NhanVien(String hoTen, String gioiTinh, String ngaySinh, String diaChi, String maSoThue, String ngayKiHD) {
        this.maNhanVien = "00001";
        this.hoTen = hoTen;
        this.gioiTinh = gioiTinh;
        this.ngaySinh = ngaySinh;
        this.diaChi = diaChi;
        this.maSoThue = maSoThue;
        this.ngayKiHD = ngayKiHD;
    }
    
    @Override
    public String toString(){
        return this.maNhanVien + " " + this.hoTen + " " + this.gioiTinh + " " + this.ngaySinh
                + " " + this.diaChi + " " + this.maSoThue + " " + this.ngayKiHD;
    }
}
public class J04007 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String hoTen = sc.nextLine();
        String gioiTinh = sc.next();
        String ngaySinh = sc.next();
        sc.nextLine();
        String diaChi = sc.nextLine();
        String maSoThue = sc.next();
        String ngayKiHD = sc.next();
        NhanVien nv = new NhanVien(hoTen, gioiTinh, ngaySinh, diaChi, maSoThue, ngayKiHD);
        System.out.println(nv);
    }
}
