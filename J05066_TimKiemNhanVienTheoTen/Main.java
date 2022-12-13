/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package J05066_TimKiemNhanVienTheoTen;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

/**
 *
 * @author :Tran Quang Huy
 */
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList <NhanVien> list = new ArrayList<>();
        int n = Integer.parseInt(sc.nextLine());
        for(int i = 0; i < n; i++){
            String maNv = sc.next();
            String hoTen = sc.nextLine().trim();
            NhanVien nv = new NhanVien(maNv, hoTen);
            if(nv.chucVu().equals("TP")){
                if(nv.soHieu() > 3){
                    nv.setMaNv("NV" + maNv.substring(2));
                }
            }
            else if(nv.chucVu().equals("PP")){
                if(nv.soHieu() > 3){
                    nv.setMaNv("NV" + maNv.substring(2));
                }
            }
            else if(nv.chucVu().equals("GD")){
                if(nv.soHieu() > 1){
                    nv.setMaNv("NV" + maNv.substring(2));
                }
            }
            list.add(nv);
        }
        list.sort(new Comparator<NhanVien>(){
            @Override
            public int compare(NhanVien o1, NhanVien o2) {
                if(o1.heSoLuong() == o2.heSoLuong()){
                    return o1.soHieu() - o2.soHieu();
                }
                return o2.heSoLuong() - o1.heSoLuong();
            }
        
        });
        int q = sc.nextInt();
        sc.nextLine();
        while(q-- > 0){
            String s = sc.nextLine();
            for(NhanVien x : list){
                if(x.getHoTen().toLowerCase().contains(s.toLowerCase())){
                    System.out.println(x);
                }
            }
            System.out.println("");
        }
    }
}
