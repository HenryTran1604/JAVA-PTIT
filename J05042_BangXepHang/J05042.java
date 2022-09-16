/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package J05042_BangXepHang;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

/**
 *
 * @author admin
 */
class SinhVien{
    private String hoTen;
    private int lamDung, submit;

    public SinhVien(String hoTen, int lamDung, int submit) {
        this.hoTen = hoTen;
        this.lamDung = lamDung;
        this.submit = submit;
    }

    public String getHoTen() {
        return hoTen;
    }

    public int getLamDung() {
        return lamDung;
    }

    public int getSubmit() {
        return submit;
    }
    
    @Override
    public String toString(){
        return this.hoTen + " " + this.lamDung + " " + this.submit;
    }
}
public class J05042 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList <SinhVien> list = new ArrayList<>();
        while(n-- > 0){
            sc.nextLine();
            String hoTen = sc.nextLine();
            int lamDung = sc.nextInt();
            int submit = sc.nextInt();
            list.add(new SinhVien(hoTen, lamDung, submit));
        }
        Collections.sort(list, new Comparator<SinhVien>(){
            @Override
            public int compare(SinhVien o1, SinhVien o2) {
                if(o1.getLamDung() == o2.getLamDung()){
                    if(o1.getSubmit() == o2.getSubmit()){
                        return o1.getHoTen().compareTo(o2.getHoTen());
                    }
                    return o1.getSubmit() - o2.getSubmit();
                }
                return o2.getLamDung() - o1.getLamDung();
            }
        
        });
        for(SinhVien x : list){
            System.out.println(x);
        }
    }
}
