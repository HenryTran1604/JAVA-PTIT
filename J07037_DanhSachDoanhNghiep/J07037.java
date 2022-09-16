/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package J07037_DanhSachDoanhNghiep;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

/**
 *
 * @author admin
 */
class DoanhNghiep{
    private String maDoanhNghiep, tenDoanhNghiep;
    private int soSinhVien;

    public DoanhNghiep(String maDoanhNghiep, String tenDoanhNghiep, int soSinhVien) {
        this.maDoanhNghiep = maDoanhNghiep;
        this.tenDoanhNghiep = tenDoanhNghiep;
        this.soSinhVien = soSinhVien;
    }

    public String getMaDoanhNghiep() {
        return maDoanhNghiep;
    }
    
    @Override
    public String toString(){
        return this.maDoanhNghiep + " " + this.tenDoanhNghiep + " " + this.soSinhVien;
    }
}
public class J07037 {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("DN.in"));
        int n = sc.nextInt();
        ArrayList <DoanhNghiep> list = new ArrayList<>();
        for(int i = 0; i < n; i++){
            String maDN = sc.next();
            sc.nextLine();
            String tenDN = sc.nextLine();
            int soSV = sc.nextInt();
            list.add(new DoanhNghiep(maDN, tenDN, soSV));
        }
        Collections.sort(list, new Comparator<DoanhNghiep>(){
            @Override
            public int compare(DoanhNghiep a, DoanhNghiep b){
                return a.getMaDoanhNghiep().compareTo(b.getMaDoanhNghiep());
            }
        });
        for(DoanhNghiep x : list){
            System.out.println(x);
        }
    }
}
