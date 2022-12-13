/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package J05065_LietKeNhanVienTheoNhom;

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
        int gd = 1, tp = 3, pp = 3;
        for(int i = 0; i < n; i++){
            String maNv = sc.next();
            String hoTen = sc.nextLine().trim();
            NhanVien nv = new NhanVien(maNv, hoTen);
            if(nv.chucVu().equals("TP")){
                tp -= 1;
                if(tp < 0){
                    nv.setMaNv("NV" + maNv.substring(2));
                }
            }
            else if(nv.chucVu().equals("PP")){
                pp -= 1;
                if(pp < 0){
                    nv.setMaNv("NV" + maNv.substring(2));
                }
            }
            else if(nv.chucVu().equals("GD")){
                gd -= 1;
                if(gd < 0){
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
        while(q-- > 0){
            String cv = sc.next();
            for(NhanVien x : list){
                if(x.chucVu().equals(cv)){
                    System.out.println(x);
                }
            }
            System.out.println("");
        }
    }
}
