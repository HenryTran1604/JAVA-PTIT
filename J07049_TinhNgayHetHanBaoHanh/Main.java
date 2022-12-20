/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package J07049_TinhNgayHetHanBaoHanh;

import java.io.File;
import java.io.FileNotFoundException;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

/**
 *
 * @author :Tran Quang Huy
 */
public class Main {
    public static void main(String[] args) throws FileNotFoundException, ParseException {
        Scanner sc = new Scanner(new File("MUAHANG.in"));
        ArrayList <SanPham> listSp = new ArrayList<>();
        int n = Integer.parseInt(sc.nextLine());
        for(int i = 0; i < n; i++){
            listSp.add(new SanPham(sc.nextLine(),
                                    sc.nextLine(),
                                    Integer.parseInt(sc.nextLine()),
                                    Integer.parseInt(sc.nextLine())));
        }
        int m = Integer.parseInt(sc.nextLine());
        ArrayList <KhachHang> listKh = new ArrayList<>();
        for(int i = 1; i <= m; i++){
            String tenKh = sc.nextLine();
            String diaChi = sc.nextLine();
            String maSp = sc.nextLine();
            int soLuong = Integer.parseInt(sc.nextLine());
            String ngayMua = sc.nextLine();
            for(SanPham x : listSp){
                if(x.getMaSanPham().equals(maSp)){
                    listKh.add(new KhachHang(i, tenKh, diaChi, x, soLuong, ngayMua));
                }
            }
        }
        Collections.sort(listKh, new Comparator<KhachHang>(){
            @Override
            public int compare(KhachHang o1, KhachHang o2) {
                return o1.hanBaoHanh().compareTo(o2.hanBaoHanh());
            }
        });
        for(KhachHang x : listKh){
            System.out.println(x);
        }
    }
}
