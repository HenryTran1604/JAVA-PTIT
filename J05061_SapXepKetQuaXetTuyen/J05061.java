/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package J05061_SapXepKetQuaXetTuyen;


import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

/**
 *
 * @author admin
 */
class ThiSinh{
    private String maTS, hoTen, ngaySinh;
    private double diemLyThuyet, diemThucHanh;
    private static int id = 1;

    public ThiSinh(String hoTen, String ngaySinh, double diemLyThuyet, double diemThucHanh) {
        this.maTS = "PH" + String.format("%02d", id++);
        this.hoTen = hoTen;
        this.ngaySinh = ngaySinh;
        this.diemLyThuyet = diemLyThuyet;
        this.diemThucHanh = diemThucHanh;
    }

    public String getMaTS() {
        return maTS;
    }
    public int tuoi(){
        return 2021 - Integer.parseInt(this.ngaySinh.substring(6));
    }
    public double diemThuong(){
        if(this.diemLyThuyet >= 8 && this.diemThucHanh >= 8)
            return 1;
        if(this.diemLyThuyet >= 7.5 && this.diemThucHanh >= 7.5)
            return 0.5;
        return 0;
    }
    public int diemTB(){
        int dtb = (int) Math.round((this.diemLyThuyet + this.diemThucHanh)/2 + this.diemThuong());
        if(dtb > 10)
            return 10;
        return dtb;
    }
    public String xepLoai(){
        if(this.diemTB() < 5)
            return "Truot";
        if(this.diemTB() <= 6)
            return "Trung binh";
        if(this.diemTB() == 7)
            return "Kha";
        if(this.diemTB() == 8)
            return "Gioi";
        return "Xuat sac";
    }
    
    @Override
    public String toString(){
        return this.maTS + " " + this.hoTen + " " + this.tuoi() + " " + this.diemTB() + " " + this.xepLoai();
    }
}
public class J05061 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList <ThiSinh> list = new ArrayList<>();
        while(n-- > 0){
            sc.nextLine();
            String hoTen = sc.nextLine();
            String ngaySinh = sc.nextLine();
            double diemLyThuyet = sc.nextDouble();
            double diemThucHanh = sc.nextDouble();
            list.add(new ThiSinh(hoTen, ngaySinh, diemLyThuyet, diemThucHanh));
        }
        Collections.sort(list, new Comparator<ThiSinh>(){
            @Override
            public int compare(ThiSinh o1, ThiSinh o2) {
                if(o1.diemTB() == o2.diemTB()){
                    return o1.getMaTS().compareTo(o2.getMaTS());
                }
                return o2.diemTB() - o1.diemTB();
            }
        });
        for(ThiSinh x : list){
            System.out.println(x);
        }
    }
}

