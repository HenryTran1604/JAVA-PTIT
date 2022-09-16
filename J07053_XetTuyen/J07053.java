/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package J07053_XetTuyen;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author admin
 */
class ThiSinh{
    private String maThiTuyen, hoTen, ngaySinh;
    private double diemLyThuyet, diemThucHanh;
    private static int id = 1;
    
    public ThiSinh(String hoTen, String ngaySinh, double diemLyThuyet, double diemThucHanh) {
        this.maThiTuyen = "PH" + String.format("%02d", id++);
        this.hoTen = hoTen;
        this.ngaySinh = ngaySinh;
        this.diemLyThuyet = diemLyThuyet;
        this.diemThucHanh = diemThucHanh;
    }
    public void chuanHoa(){
        StringBuilder sb = new StringBuilder();
        String[] arr = this.hoTen.trim().split("\\s+");
        for(String x : arr){
            sb.append(Character.toUpperCase(x.charAt(0)));
            for(int j = 1; j < x.length(); j++){
                sb.append(Character.toLowerCase(x.charAt(j)));
            }
            sb.append(" ");
        }
        sb.deleteCharAt(sb.length() - 1);
        this.hoTen = sb.toString();
    }
    public int getTuoi() {
        String[] arr = this.ngaySinh.split("/");
        return 2021 - Integer.parseInt(arr[2]);
    }

    public double diemThuong(){
        if(this.diemLyThuyet >= 8 && this.diemThucHanh >= 8)
            return 1;
        if(this.diemLyThuyet >= 7.5 && this.diemThucHanh >= 7.5)
            return 0.5;
        return 0;
    }
    public long diemTrungBinh(){
        double tb = (this.diemLyThuyet + this.diemThucHanh) / 2;
        if(tb + this.diemThuong() > 10)
            return 10;
        return  Math.round(tb + this.diemThuong());
    }
    public String xepLoai(){
        long d = this.diemTrungBinh();
        if(d >= 9)
            return "Xuat sac";
        if(d >= 8)
            return "Gioi";
        if(d >= 7)
            return "Kha";
        if(d >= 5)
            return "Trung binh";
        return "Truot";
    }
    
    @Override
    public String toString(){
        return this.maThiTuyen + " " + this.hoTen + " " + this.getTuoi() + " " + this.diemTrungBinh() + " " + this.xepLoai();
    }
}
public class J07053 {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("XETTUYEN.in"));
        int n = sc.nextInt();
        ArrayList <ThiSinh> list = new ArrayList<>();
        for(int i = 0; i < n; i++){
            sc.nextLine();
            String hoTen = sc.nextLine();
            String ngaySinh = sc.nextLine();
            double diemLyThuyet = sc.nextDouble();
            double diemThucHanh = sc.nextDouble();
            ThiSinh ts = new ThiSinh(hoTen, ngaySinh, diemLyThuyet, diemThucHanh);
            ts.chuanHoa();
            list.add(ts);
        }
        for(ThiSinh x : list){
            System.out.println(x);
        }
    }
}
