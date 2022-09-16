/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package J05006_DanhSachDoiTuongNhanVien;

import java.util.Scanner;

/**
 *
 * @author admin
 */
class NhanVien{
    private String maNhanVien, hoTen, gioiTinh, ngaySinh, diaChi, maThue, ngayKiHD;
    private static int id = 1;
    public NhanVien(String hoTen, String gioiTinh, String ngaySinh, String diaChi, String maThue, String ngayKiHD) {
        this.maNhanVien = String.format("%05d", id++);
        this.hoTen = hoTen;
        this.gioiTinh = gioiTinh;
        this.ngaySinh = ngaySinh;
        this.diaChi = diaChi;
        this.maThue = maThue;
        this.ngayKiHD = ngayKiHD;
    }
    @Override
    public String toString(){
        return this.maNhanVien + " " + this.hoTen + " " + this.gioiTinh + " " + this.ngaySinh
                + " " + this.diaChi + " " + this.maThue + " " + this.ngayKiHD;
    }
}
public class J05006 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        while(n-- > 0){
            String hoTen = sc.nextLine();
            String gioiTinh = sc.nextLine();
            String ngaySinh = sc.nextLine();
            String diaChi = sc.nextLine();
            String maThue = sc.nextLine();
            String ngayKiHD = sc.nextLine();
            NhanVien nv = new NhanVien(hoTen, gioiTinh, ngaySinh, diaChi, maThue, ngayKiHD);
            System.out.println(nv);
        }
    }
}
