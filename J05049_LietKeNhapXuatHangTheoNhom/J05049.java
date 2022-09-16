/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package J05049_LietKeNhapXuatHangTheoNhom;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

/**
 *
 * @author admin
 */
class MatHang{
    private String maHang;
    private int soLuongNhap;

    public MatHang(String maHang, int soLuongNhap) {
        this.maHang = maHang;
        this.soLuongNhap = soLuongNhap;
    }

    public String getMaHang() {
        return maHang;
    }
    
    public int soLuongXuat(){
        if(this.maHang.charAt(0) == 'A')
            return Math.round(0.6f * this.soLuongNhap);
        return Math.round(0.7f * this.soLuongNhap);
    }
    public int donGia(){
        if(this.maHang.charAt(this.maHang.length() - 1) == 'Y')
            return 110000;
        return 135000;
    }
    public int tien(){
        return this.soLuongXuat() * this.donGia();
    }
    public int thue(){
        if(this.maHang.charAt(0) == 'A'){
            if(this.maHang.charAt(this.maHang.length() - 1) == 'Y')
                return (int) (0.08 * this.tien());
            return (int) (0.11 * this.tien());
        }
        else{
            if(this.maHang.charAt(this.maHang.length() - 1) == 'Y')
                return (int) (0.17 * this.tien());
            return (int) (0.22 * this.tien());
        }
    }
    
    @Override
    public String toString(){
        return this.maHang + " " + this.soLuongNhap + " " + this.soLuongXuat()
                + " " + this.donGia() + " " + this.tien() + " " + this.thue();
    }
}
public class J05049 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList <MatHang> list = new ArrayList <>();
        while(n-- > 0){
            String maHang = sc.next();
            int soLuongNhap = sc.nextInt();
            list.add(new MatHang(maHang, soLuongNhap));
        }
        String maCanTim = sc.next();
        Collections.sort(list, new Comparator<MatHang>(){
            @Override
            public int compare(MatHang o1, MatHang o2) {
                return o2.thue() - o1.thue();
            }
        });
        for(MatHang x : list){
            if(x.getMaHang().charAt(0) == maCanTim.charAt(0))
                System.out.println(x);
        }
    }
}

