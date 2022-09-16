/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package J05018_BangDiemHocSinh;

import java.math.BigDecimal;
import java.math.MathContext;
import java.math.RoundingMode;
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
    private BigDecimal[] d;
    private static int id = 1;
    public HocSinh(String hoTen, BigDecimal[] d) {
        this.maHS = "HS" + String.format("%02d", id++);
        this.hoTen = hoTen;
        this.d = d;
    }
    public BigDecimal diemTB(){
        BigDecimal tong = new BigDecimal(0);
        for(int i = 0; i < 10; i++){
            tong = tong.add(this.d[i]);
        }
        tong = tong.add(this.d[0]);
        tong = tong.add(this.d[1]);
        BigDecimal div = new BigDecimal("12");
        tong = tong.divide(div, 1, RoundingMode.HALF_UP);
        return tong;
    }

    public String getMaHS() {
        return maHS;
    }
    public String xepLoai(){
        if(this.diemTB().compareTo(BigDecimal.valueOf(9)) >= 0)
            return "XUAT SAC";
        if(this.diemTB().compareTo(BigDecimal.valueOf(8)) >= 0)
            return "GIOI";
        if(this.diemTB().compareTo(BigDecimal.valueOf(7)) >= 0)
            return "KHA";
        if(this.diemTB().compareTo(BigDecimal.valueOf(5)) >= 0)
            return "TB";
        return "YEU";
    }
    @Override
    public String toString(){
        return this.maHS + " " + this.hoTen + " " + this.diemTB() + " " + this.xepLoai();
    }
}
public class J05018 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList <HocSinh> list = new ArrayList<>();
        while(n-- > 0){
            sc.nextLine();
            String hoTen = sc.nextLine();
            BigDecimal[] d = new BigDecimal[10];
            for(int i = 0; i < 10; i++){
                d[i] = sc.nextBigDecimal();
            }
            list.add(new HocSinh(hoTen, d));
        }
        Collections.sort(list, new Comparator<HocSinh>(){
            @Override
            public int compare(HocSinh o1, HocSinh o2) {
                if(o1.diemTB().compareTo(o2.diemTB()) == 0)
                    return o1.getMaHS().compareTo(o2.getMaHS());
                if(o1.diemTB().compareTo(o2.diemTB()) < 0)
                    return 1;
                return -1;
            }
        });
        for(HocSinh x : list){
            System.out.println(x);
        }
    }
}
