/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package J07010_DanhSachSinhVienTrongFile;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 *
 * @author admin
 */
class SinhVien{
    private String maSV, hoTen, lop, ngaySinh;
    private double gpa;
    private static int id = 1;

    public SinhVien(String hoTen, String lop, String ngaySinh, double gpa) {
        this.maSV = "B20DCCN" + String.format("%03d", id++);
        this.hoTen = hoTen;
        this.lop = lop;
        this.ngaySinh = ngaySinh;
        this.gpa = gpa;
    }
    public void chuanHoa(){
        StringBuilder sb = new StringBuilder(this.ngaySinh);
        if(sb.charAt(2) != '/') sb.insert(0, "0");
        if(sb.charAt(5) != '/') sb.insert(3, "0");
        this.ngaySinh = sb.toString();
    }
    
    @Override
    public String toString(){
        return this.maSV + " " + this.hoTen + " " + this.lop + " " + this.ngaySinh + " " + String.format("%.2f", this.gpa);
    }
}
public class J07010 {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("SV.in"));
        int n = sc.nextInt();
        sc.nextLine();
        for(int i = 0; i < n; i++){
            SinhVien sv = new SinhVien(sc.nextLine(), sc.nextLine(), sc.nextLine(), Double.parseDouble(sc.nextLine()));
            sv.chuanHoa();
            System.out.println(sv);
        }
    }
}
