/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package J07081_SapXepDanhSachSinhVien;

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
class SinhVien{
    private String maSV, hoTen, sdt, email;

    public SinhVien(String maSV, String hoTen, String sdt, String email) {
        this.maSV = maSV;
        this.hoTen = hoTen;
        this.sdt = sdt;
        this.email = email;
    }

    public String getMaSV() {
        return maSV;
    }

    public String getHoTen() {
        return hoTen;
    }
    
    @Override
    public String toString(){
        return this.maSV + " " + this.hoTen + " " + this.sdt + " " + this.email;
    }
}
class sortByNameThenCode implements Comparator<SinhVien>{
    @Override
    public int compare(SinhVien o1, SinhVien o2) {
        String[] arr1 = o1.getHoTen().split(" ");
        String[] arr2 = o2.getHoTen().split(" ");
        int n = arr1.length, m = arr2.length;
        if(arr1[n - 1].equals(arr2[m - 1])){
            int i = 0, j = 0;
            while(i < n && j < m){
                if(!arr1[i].equals(arr2[j])){
                    return arr1[i].compareTo(arr2[j]);
                }
                i++; j++;
            }
            return o1.getMaSV().compareTo(o2.getMaSV());
        }
        return arr1[n - 1].compareTo(arr2[m - 1]);
    }
    
}
public class J07081 {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("SINHVIEN.in"));
        int n = sc.nextInt();
        sc.nextLine();
        ArrayList <SinhVien> list = new ArrayList<>();
        for(int i = 0; i < n; i++){
            list.add(new SinhVien(sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextLine()));
        }
        Collections.sort(list, new sortByNameThenCode());
        for(SinhVien x : list){
            System.out.println(x);
        }
    }
}
