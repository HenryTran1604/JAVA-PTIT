/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package J05054_XepHangHocSinh;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

/**
 *
 * @author admin
 */
class HocSinh{
    private String maHS, hoTen;
    private double diemTB;
    private int xepHang;
    private static int id = 1;
    
    public HocSinh(String hoTen, double diemTB) {
        this.maHS = "HS" + String.format("%02d", id++);
        this.hoTen = hoTen;
        this.diemTB = diemTB;
    }

    public String getMaHS() {
        return maHS;
    }

    public double getDiemTB() {
        return diemTB;
    }
    
    public String xepLoai(){
        if(this.diemTB < 5)
            return "Yeu";
        if(this.diemTB < 7)
            return "Trung Binh";
        if(this.diemTB < 9)
            return "Kha";
        return "Gioi";
    }
    public void setXepHang(int xh){
        this.xepHang = xh;
    }
    
    @Override
    public String toString(){
        return this.maHS + " " + this.hoTen + " " + String.format("%.1f", this.diemTB)
                + " " + this.xepLoai() + " " + this.xepHang;
    }
}
public class J05054 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList <HocSinh> list1 = new ArrayList<>();
        while(n-- > 0){
            sc.nextLine();
            String hoTen = sc.nextLine();
            double diemTB = sc.nextDouble();
            list1.add(new HocSinh(hoTen, diemTB));
        }
        Collections.sort(list1, new Comparator<HocSinh>(){
            @Override
            public int compare(HocSinh o1, HocSinh o2) {
                if(o1.getDiemTB() < o2.getDiemTB())
                    return 1;
                if(o1.getDiemTB() == o2.getDiemTB())
                    return 0;
                return -1;
            }
        });
        int rank = 0, cnt = 1;
        double curMark = -1;
        for(HocSinh x : list1){
            if(x.getDiemTB() == curMark){
                cnt++;
            }
            else{
                rank += cnt;
                cnt = 1;
            }
            curMark = x.getDiemTB();
            x.setXepHang(rank);
        }
        Collections.sort(list1, new Comparator<HocSinh>(){
            @Override
            public int compare(HocSinh o1, HocSinh o2) {
                return o1.getMaHS().compareTo(o2.getMaHS());
            }
        });
        for(HocSinh x : list1){
            System.out.println(x);
        }
    }
}
