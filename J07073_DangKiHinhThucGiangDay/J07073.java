/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package J07073_DangKiHinhThucGiangDay;

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
class MonHoc{
    private String maMonHoc, TenMonHoc;
    private int soTinChi;
    private String liThuyet, thucHanh;

    public String getMaMonHoc() {
        return maMonHoc;
    }

    public MonHoc(String maMonHoc, String TenMonHoc, int soTinChi, String liThuyet, String thucHanh) {
        this.maMonHoc = maMonHoc;
        this.TenMonHoc = TenMonHoc;
        this.soTinChi = soTinChi;
        this.liThuyet = liThuyet;
        this.thucHanh = thucHanh;
    }
    
    @Override
    public String toString(){
        return this.maMonHoc + " "+ this.TenMonHoc + " " + this.soTinChi + " " + this.liThuyet + " " + this.thucHanh;
    }
}
public class J07073 {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("MONHOC.in"));
        int n = sc.nextInt();
        ArrayList <MonHoc> list = new ArrayList<>();
        while(n-- > 0){
            String maMonHoc = sc.next();
            sc.nextLine();
            String tenMonHoc = sc.nextLine();
            int soTinChi = Integer.parseInt(sc.nextLine());
            String liThuyet = sc.nextLine();
            String thucHanh = sc.nextLine();
            if(!thucHanh.equals("Truc tiep"))
                    list.add(new MonHoc(maMonHoc, tenMonHoc, soTinChi, liThuyet, thucHanh));
        }
        Collections.sort(list, new Comparator<MonHoc>(){
            @Override
            public int compare(MonHoc o1, MonHoc o2) {
                return o1.getMaMonHoc().compareTo(o2.getMaMonHoc());
            }
        });
        for(MonHoc x : list){
            System.out.println(x);
        }
    }
}
