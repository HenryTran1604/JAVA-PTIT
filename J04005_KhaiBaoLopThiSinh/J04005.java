/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package J04005_KhaiBaoLopThiSinh;

import java.util.Scanner;

/**
 *
 * @author admin
 */
class ThiSinh{
    private String hoTen, ngaySinh;
    private double d1, d2, d3;

    public ThiSinh(String hoTen, String ngaySinh, double d1, double d2, double d3) {
        this.hoTen = hoTen;
        this.ngaySinh = ngaySinh;
        this.d1 = d1;
        this.d2 = d2;
        this.d3 = d3;
    }
    public double diemTB(){
        return this.d1 + this.d2 + this.d3;
    }
    
    @Override
    public String toString(){
        return this.hoTen + " " + this.ngaySinh + " " + String.format("%.1f", this.diemTB());
    }
}
public class J04005 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String hoTen = sc.nextLine();
        String ngaySinh = sc.next();
        double d1 = sc.nextDouble();
        double d2 = sc.nextDouble();
        double d3 = sc.nextDouble();
        ThiSinh ts = new ThiSinh(hoTen, ngaySinh, d1, d2, d3);
        System.out.println(ts);
    }
}
