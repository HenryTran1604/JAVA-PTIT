/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package J05027_TimKiemGiangVien;

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

    public String getHoTen() {
        return hoTen;
    }
    
    @Override
    public String toString(){
        return this.maGV + " " + this.hoTen + " " + this.boMon;
    }
}
public class J05027 {
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
            String tuKhoa = sc.nextLine();
            String key = tuKhoa.toLowerCase();
            System.out.println("DANH SACH GIANG VIEN THEO TU KHOA " + tuKhoa + ":");
            for(GiangVien x : list){
                if(x.getHoTen().toLowerCase().contains(key)){
                    System.out.println(x);
                }
            }
        }
    }
}
