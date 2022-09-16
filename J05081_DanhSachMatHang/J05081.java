/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package J05081_DanhSachMatHang;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

/**
 *
 * @author admin
 */
class MatHang{
    private String maMH, tenMH, donVi;
    private int giaMua, giaBan;
    private static int id = 1;
    public MatHang(String tenMH, String donVi, int giaMua, int giaBan) {
        this.maMH = "MH" + String.format("%03d", id++);
        this.tenMH = tenMH;
        this.donVi = donVi;
        this.giaMua = giaMua;
        this.giaBan = giaBan;
    }
    public int loiNhuan(){
        return this.giaBan - this.giaMua;
    }
    
    @Override
    public String toString(){
        return this.maMH + " " + this.tenMH + " " + this.donVi + " "+ this.giaMua + " " + this.giaBan + " " + this.loiNhuan();
    }
}
public class J05081 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        MatHang[] mh = new MatHang[n];
        for(int i = 0; i < n; i++){
            sc.nextLine();
            String tenMH = sc.nextLine();
            String donVi = sc.nextLine();
            int giaMua = sc.nextInt();
            int giaBan = sc.nextInt();
            mh[i] = new MatHang(tenMH, donVi, giaMua, giaBan);
        }
        Arrays.sort(mh, new Comparator<MatHang>(){
            @Override
            public int compare(MatHang a, MatHang b){
                return b.loiNhuan() - a.loiNhuan();
            }
        });
        
        for(MatHang x : mh){
            System.out.println(x);
        }
    }
}
