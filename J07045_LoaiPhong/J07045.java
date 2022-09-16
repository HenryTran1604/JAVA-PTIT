/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package J07045_LoaiPhong;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

/**
 *
 * @author admin
 */
class LoaiPhong implements Comparable<LoaiPhong>{
    private String kiHieu, tenLoai;
    private int donGia;
    private double phiDV;

    public LoaiPhong(String kiHieu, String tenLoai, int donGia, double phiDV) {
        this.kiHieu = kiHieu;
        this.tenLoai = tenLoai;
        this.donGia = donGia;
        this.phiDV = phiDV;
    }
    public LoaiPhong(String line){
        String[] arr = line.split("\\s+");
        this.kiHieu = arr[0];
        this.tenLoai = arr[1];
        this.donGia = Integer.parseInt(arr[2]);
        this.phiDV = Double.parseDouble(arr[3]);
        
    }
    public String getTenLoai(){
        return this.tenLoai;
    }
    @Override
    public int compareTo(LoaiPhong other){
        return this.tenLoai.compareTo(other.tenLoai);
    }
    
    @Override
    public String toString(){
        return this.kiHieu + " " + this.tenLoai + " " + this.donGia + " " + this.phiDV;
    }

}
public class J07045 {
    public static void main(String[] args) throws IOException {
        ArrayList<LoaiPhong> ds = new ArrayList<>();
        Scanner in = new Scanner(new File("PHONG.in"));
        int n = Integer.parseInt(in.nextLine());
        while(n-->0){
            ds.add(new LoaiPhong(in.nextLine()));
        }
        Collections.sort(ds);
        for(LoaiPhong tmp : ds){
            System.out.println(tmp);
        }
    }
}
