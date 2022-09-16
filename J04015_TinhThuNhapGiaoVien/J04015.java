/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package J04015_TinhThuNhapGiaoVien;

import java.util.Scanner;

/**
 *
 * @author admin
 */
class GiaoVien{
    private String maGV, hoTen;
    private int luongCoBan;

    public GiaoVien(String maGV, String hoTen, int luongCoBan) {
        this.maGV = maGV;
        this.hoTen = hoTen;
        this.luongCoBan = luongCoBan;
    }
    
    public int bacLuong(){
        return Integer.parseInt(this.maGV.substring(2));
    }
    public int phuCap(){
        String pc = this.maGV.substring(0, 2);
        if(pc.equals("HT"))
            return 2000000;
        if(pc.equals("HP"))
            return 900000;
        return 500000;
    }
    public int thuNhap(){
        return this.phuCap() + this.luongCoBan * this.bacLuong();
    }
    
    @Override
    public String toString(){
        return this.maGV + " " + this.hoTen + " " + this.bacLuong() + " " + this.phuCap() + " " + this.thuNhap();
    }
}
public class J04015 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String maGV = sc.nextLine();
        String hoTen = sc.nextLine();
        int luongCoBan = sc.nextInt();
        GiaoVien gv = new GiaoVien(maGV, hoTen, luongCoBan);
        System.out.println(gv);
    }
}
