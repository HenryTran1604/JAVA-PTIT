/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package J07034_DanhSachMonHoc;

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
    private String maMon, tenMon;
    private int soTinChi;

    public MonHoc(String maMon, String tenMon, int soTinChi) {
        this.maMon = maMon;
        this.tenMon = tenMon;
        this.soTinChi = soTinChi;
    }

    public String getTenMon() {
        return tenMon;
    }
    
    @Override
    public String toString(){
        return this.maMon + " " + this.tenMon + " " + this.soTinChi;
    }
}
public class J07034 {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("MONHOC.in"));
        int n = sc.nextInt();
        ArrayList <MonHoc> list = new ArrayList<>();
        for(int i = 0; i < n; i++){
            String maMon = sc.next();
            sc.nextLine();
            String tenMon = sc.nextLine();
            int soTinChi = sc.nextInt();
            list.add(new MonHoc(maMon, tenMon, soTinChi));
        }
        Collections.sort(list, new Comparator<MonHoc>(){
            @Override
            public int compare(MonHoc a, MonHoc b){
                return a.getTenMon().compareTo(b.getTenMon());
            }
        });
        for(MonHoc x : list){
            System.out.println(x);
        }
    }
}
