/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ThucHanh;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

/**
 *
 * @author :Tran Quang Huy
 */
class MonHoc {

    private String maMonHoc, tenMonHoc;
    private int soTinChi;
    private String lyThuyet, thucHanh;

    public MonHoc(String maMonHoc, String tenMonHoc, int soTinChi, String lyThuyet, String thucHanh) {
        this.maMonHoc = maMonHoc;
        this.tenMonHoc = tenMonHoc;
        this.soTinChi = soTinChi;
        this.lyThuyet = lyThuyet;
        this.thucHanh = thucHanh;
    }

    public String getMaMonHoc() {
        return maMonHoc;
    }

    @Override
    public String toString() {
        return this.maMonHoc + " " + this.tenMonHoc + " " + this.soTinChi + " " + this.lyThuyet + " " + this.thucHanh;
    }
}

public class DangKiHinhThucGiangDay {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("MONHOC.in"));
        int n = Integer.parseInt(sc.nextLine());
        ArrayList<MonHoc> list = new ArrayList<>();
        for(int i = 0; i < n; i++){
            String maMonHoc = sc.nextLine();
            String tenMonHoc = sc.nextLine();
            int soTinChi = Integer.parseInt(sc.nextLine());
            String lyThuyet = sc.nextLine();
            String thucHanh = sc.nextLine();
            if(!thucHanh.equals("Truc tiep")){
                list.add(new MonHoc(maMonHoc, tenMonHoc, soTinChi, lyThuyet, thucHanh));
            }
        }
        list.sort(Comparator.comparing(MonHoc::getMaMonHoc));
        for(MonHoc x : list){
            System.out.println(x);
        }
    }
}
