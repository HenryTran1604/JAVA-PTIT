/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package J05010_SapXepDanhSachMatHang;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

/**
 *
 * @author admin
 */
class MatHang{
    private String maMatHang, tenMatHang, nhomHang;
    private float giaMua, giaBan;
    private static int id = 1;

    public MatHang(String tenMatHang, String nhomHang, float giaMua, float giaBan) {
        this.maMatHang = "" + id++;
        this.tenMatHang = tenMatHang;
        this.nhomHang = nhomHang;
        this.giaMua = giaMua;
        this.giaBan = giaBan;
    }
    public float loiNhuan(){
        return this.giaBan - this.giaMua;
    }
    
    @Override
    public String toString(){
        return this.maMatHang + " " + this.tenMatHang + " " + this.nhomHang + " " + String.format("%.2f", this.loiNhuan());
    }
}
public class J05010 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList <MatHang> list = new ArrayList<>();
        for(int i = 0; i < n; i++){
            sc.nextLine();
            list.add(new MatHang(sc.nextLine(), sc.nextLine(), sc.nextFloat(), sc.nextFloat()));
        }
        Collections.sort(list, new Comparator<MatHang>(){
            @Override
            public int compare(MatHang o1, MatHang o2) {
                if(o1.loiNhuan() < o2.loiNhuan())
                    return 1;
                return -1;
            }
        });
        for(MatHang x : list){
            System.out.println(x);
        }
    }
}
