/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package J07058_DanhSachMonThi;

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
    private String maMon, tenMon, hinhThuc;

    public MonHoc(String maMon, String tenMon, String hinhThuc) {
        this.maMon = maMon;
        this.tenMon = tenMon;
        this.hinhThuc = hinhThuc;
    }

    public String getMaMon() {
        return maMon;
    }
    
    @Override
    public String toString(){
        return this.maMon + " " + this.tenMon + " " + this.hinhThuc;
    }
}
public class J07058 {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("MONHOC.in"));
        int n = sc.nextInt();
        sc.nextLine();
        ArrayList <MonHoc> list = new ArrayList<>();
        while(n-- > 0){
            String maMon = sc.nextLine();
            String tenMon = sc.nextLine();
            String hinhThuc = sc.nextLine();
            list.add(new MonHoc(maMon, tenMon, hinhThuc));
        }
        Collections.sort(list, new Comparator<MonHoc>(){
            @Override
            public int compare(MonHoc a, MonHoc b){
                return a.getMaMon().compareTo(b.getMaMon());
            }
        });
        for(MonHoc x : list){
            System.out.println(x);
        }
    }
}
