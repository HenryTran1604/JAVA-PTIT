/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package J05064_BangThuNhapGiaoVien;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author admin
 */
class GiaoVien{
    private String maNgach, hoTen;
    private int luongCoBan;

    public String getMaNgach() {
        return maNgach;
    }
    
    public GiaoVien(String maNgach, String hoTen, int luongCoBan) {
        this.maNgach = maNgach;
        this.hoTen = hoTen;
        this.luongCoBan = luongCoBan;
    }
    public int bacLuong(){
        return Integer.parseInt(this.maNgach.substring(2));
    }
    public int phuCap(){
        String chucVu = this.maNgach.substring(0, 2);
        if(chucVu.equals("HT")){
            return 2000000;
        }
        if(chucVu.equals("HP")){
            return 900000;
        }
        return 500000;
    }

    public int thuNhap(){
        return this.luongCoBan*this.bacLuong() + this.phuCap();
    }
    @Override
    public String toString(){
        return this.maNgach + " " + this.hoTen + " " + this.bacLuong() + " " + this.phuCap() + " " + this.thuNhap();
    }
}
public class J05064 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int HT = 1, HP = 2;
        ArrayList <GiaoVien> list = new ArrayList<>();
        while(n-- > 0){
            String ma = sc.next();
            sc.nextLine();
            String hoTen = sc.nextLine();
            int luongCoBan = sc.nextInt();
            GiaoVien gv = new GiaoVien(ma, hoTen, luongCoBan);
            String tmp = ma.substring(0, 2);
            if(tmp.equals("HT")){
                HT--;
                if(HT >= 0){
                    list.add(gv);
                }
            }
            else if(tmp.equals("HP")){
                HP--;
                if(HP >= 0){
                    list.add(gv);
                }
            }
            else{
                list.add(gv);
            }
        }
        for(GiaoVien x : list){
            System.out.println(x);
        }
    }
}
