/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package J05028_DanhSachDoanhNghiepNhanSVThucTap;

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

    public int getSoSinhVien() {
        return soSinhVien;
    }
    
    @Override
    public String toString(){
        return this.maDoanhNghiep + " " + this.tenDoanhNghiep + " " + this.soSinhVien;
    }
}
public class J05028 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList <DoanhNghiep> list = new ArrayList<>();
        while(n-- > 0){
            String maDoanhNghiep = sc.next();
            sc.nextLine();
            String tenDoanhNghiep = sc.nextLine();
            int soSinhVien = sc.nextInt();
            list.add(new DoanhNghiep(maDoanhNghiep, tenDoanhNghiep, soSinhVien));
        }
        Collections.sort(list, new Comparator<DoanhNghiep>(){
            @Override
            public int compare(DoanhNghiep o1, DoanhNghiep o2) {
                if(o1.getSoSinhVien() == o2.getSoSinhVien())
                    return o1.getMaDoanhNghiep().compareTo(o2.getMaDoanhNghiep());
                return o2.getSoSinhVien() - o1.getSoSinhVien();
            }
        
        });
        for(DoanhNghiep x : list){
            System.out.println(x);
        }
    }
}
