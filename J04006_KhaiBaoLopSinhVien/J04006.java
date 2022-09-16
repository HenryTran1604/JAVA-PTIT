/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package J04006_KhaiBaoLopSinhVien;

import java.util.Scanner;

/**
 *
 * @author admin
 */
class SinhVien{
    private String maSV, hoTen, lop, ngaySinh;
    private float gpa;

    public SinhVien() {
        this.maSV = this.hoTen = this.lop = this.ngaySinh = "";
        this.gpa = 0;
    }

    public SinhVien(String hoTen, String lop, String ngaySinh, float gpa) {
        this.maSV = "B20DCCN001";
        this.hoTen = hoTen;
        this.lop = lop;
        this.ngaySinh = ngaySinh;
        this.gpa = gpa;
    }
    
    public void chuanHoa(){
        StringBuilder sb = new StringBuilder(this.ngaySinh);
        if(sb.charAt(2) != '/') sb.insert(0, '0');
        if(sb.charAt(5) != '/') sb.insert(3, '0');
        this.ngaySinh = sb.toString();
    }
    
    @Override
    public String toString(){
        return this.maSV + " " + this.hoTen + " " + this.lop + " " + this.ngaySinh + " " + String.format("%.2f", this.gpa);
    }
}
public class J04006 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        SinhVien sv = new SinhVien(sc.nextLine(), sc.next(), sc.next(), sc.nextFloat());
        sv.chuanHoa();
        System.out.println(sv);
    }
}
