/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package J05025_SapXepDanhSachGiangVien;

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

    public String getMaGV() {
        return maGV;
    }

    public String getHoTen() {
        return hoTen;
    }
    
    @Override
    public String toString(){
        return this.maGV + " " + this.hoTen + " " + this.boMon;
    }
}
public class J05025 {
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
        Collections.sort(list, new Comparator<GiangVien>(){
            @Override
            public int compare(GiangVien o1, GiangVien o2) {
                String[] arr1 = o1.getHoTen().split("\\s+");
                String[] arr2 = o2.getHoTen().split("\\s+");
                int n = arr1.length, m = arr2.length;
                if(arr1[n - 1].equals(arr2[m - 1])){
                    return o1.getMaGV().compareTo(o2.getMaGV());
                }
                return arr1[n - 1].compareTo(arr2[m - 1]);
            }
        });
        for(GiangVien x : list){
            System.out.println(x);
        }
    }
}
