/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package J05007_SapXepDanhSachDoiTuongNhanVien;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
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

    public String getNgaySinh() {
        return ngaySinh;
    }
    @Override
    public String toString(){
        return this.maNhanVien + " " + this.hoTen + " " + this.gioiTinh + " " + this.ngaySinh
                + " " + this.diaChi + " " + this.maThue + " " + this.ngayKiHD;
    }
}
public class J05007 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        ArrayList <NhanVien> list = new ArrayList<>();
        while(n-- > 0){
            String hoTen = sc.nextLine();
            String gioiTinh = sc.nextLine();
            String ngaySinh = sc.nextLine();
            String diaChi = sc.nextLine();
            String maThue = sc.nextLine();
            String ngayKiHD = sc.nextLine();
            NhanVien nv = new NhanVien(hoTen, gioiTinh, ngaySinh, diaChi, maThue, ngayKiHD);
            list.add(nv);
        }
        Collections.sort(list, new Comparator<NhanVien>(){
            @Override
            public int compare(NhanVien o1, NhanVien o2) {
                String cmp1 = o1.getNgaySinh().substring(6) + o1.getNgaySinh().substring(3, 5) + o1.getNgaySinh().substring(0, 2);
                String cmp2 = o2.getNgaySinh().substring(6) + o2.getNgaySinh().substring(3, 5) + o2.getNgaySinh().substring(0, 2);
                return cmp1.compareTo(cmp2);

            }
        });
        for(NhanVien x : list){
            System.out.println(x);
        }
    }
}
