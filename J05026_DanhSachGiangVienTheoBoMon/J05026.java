/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package J05025_DanhSachGiangVienTheoBoMon;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

/**
 *
 * @author admin
 */
class GiangVien{
    private String maGV, hoTen, boMon;
    private static int id = 1;
    public GiangVien(String hoTen, String boMon) {
        this.maGV = "GV" + String.format("%02d", id++);
        this.hoTen = hoTen;
        this.boMon = "";
        String[] arr = boMon.split("\\s+");
        for(String x : arr){
            this.boMon += Character.toUpperCase(x.charAt(0));
        }
    }

    public String getBoMon() {
        return boMon;
    }
    
    
    @Override
    public String toString(){
        return this.maGV + " " + this.hoTen + " " + this.boMon;
    }
}
public class J05026 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        ArrayList <GiangVien> list = new ArrayList<>();
        while(n-- > 0){
            String hoTen = sc.nextLine();
            String boMon = sc.nextLine();
            list.add(new GiangVien(hoTen, boMon));
        }
        int q = sc.nextInt();
        sc.nextLine();
        while(q-- > 0){
            String boMonCanTim = sc.nextLine();
            boMonCanTim = boMonCanTim.toUpperCase();
            String[] arr = boMonCanTim.split("\\s+");
            String tmp = "";
            for(String x : arr){
                tmp += x.charAt(0);
            }
            System.out.println("DANH SACH GIANG VIEN BO MON " + tmp + ":");
            for(GiangVien x : list){
                if(tmp.equals(x.getBoMon())){
                    System.out.println(x);
                }
            }
        }
    }
}

