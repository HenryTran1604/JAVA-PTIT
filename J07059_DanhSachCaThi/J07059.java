/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package J07059_DanhSachCaThi;

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
class CaThi{
    private String maCa, ngayThi, gioThi, phongThi;
    private static int id = 1;
    public CaThi(String ngayThi, String gioThi, String phongThi) {
        this.maCa = "C" + String.format("%03d", id++);
        this.ngayThi = ngayThi;
        this.gioThi = gioThi;
        this.phongThi = phongThi;
    }

    public String getNgayThi() {
        return ngayThi;
    }

    public String getGioThi() {
        return gioThi;
    }
    
    @Override
    public String toString(){
        return this.maCa + " " + this.ngayThi + " " + this.gioThi + " " + this.phongThi;
    }
}
class sortByTime implements Comparator<CaThi>{
    @Override
    public int compare(CaThi o1, CaThi o2){
        String[] arr1 = o1.getNgayThi().split("/");
        String[] arr2 = o2.getNgayThi().split("/");
        String cmp1 = arr1[2] + arr1[1] + arr1[0];
        String cmp2 = arr2[2] + arr2[1] + arr2[0];
        if(cmp1.equals(cmp2)){
            return o1.getGioThi().compareTo(o2.getGioThi());
        }
        return cmp1.compareTo(cmp2);

    }
}
public class J07059 {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("CATHI.in"));
        int n = sc.nextInt();
        ArrayList <CaThi> list = new ArrayList<>();
        for(int i = 0; i < n; i++){
            list.add(new CaThi(sc.next(), sc.next(), sc.next()));
        }
        Collections.sort(list, new sortByTime());
        for(CaThi x : list){
            System.out.println(x);
        }
    }
}
