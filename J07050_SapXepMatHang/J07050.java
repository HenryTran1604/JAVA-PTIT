/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package J07050_SapXepMatHang;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

/**
 *
 * @author admin
 */
class MatHang{
    private String maHang, tenHang, nhomHang;
    private double giaMua, giaBan;
    private static int id = 1;

    public MatHang( String tenHang, String nhomHang, double giaMua, double giaBan) {
        this.maHang = "MH" + String.format("%02d", id++);
        this.tenHang = tenHang;
        this.nhomHang = nhomHang;
        this.giaMua = giaMua;
        this.giaBan = giaBan;
    }
    public double loiNhuan(){
        return this.giaBan - this.giaMua;
    }
    
    @Override
    public String toString(){
        return this.maHang + " " + this.tenHang + " " + this.nhomHang + " " + String.format("%.2f", this.loiNhuan());
    }
}
public class J07050 {
    public static void main(String[] args) throws FileNotFoundException{
        Scanner sc = new Scanner(new File("MATHANG.in"));
        int n = sc.nextInt();
        ArrayList <MatHang> list = new ArrayList<>();
        while(n-- > 0){
            sc.nextLine();
            String tenHang = sc.nextLine();
            String nhomHang = sc.nextLine();
            double giaMua = sc.nextDouble();
            double giaBan = sc.nextDouble();
            list.add(new MatHang(tenHang, nhomHang, giaMua, giaBan));
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
