/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package J07027_QuanLyBaiTapNhom;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Scanner;

/**
 *
 * @author :Tran Quang Huy
 */
public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("SINHVIEN.in"));
        ArrayList <SinhVien> listSv = new ArrayList<>();
        int n = Integer.parseInt(sc.nextLine());
        for(int i = 0; i < n; i++){
            listSv.add(new SinhVien(sc.nextLine(), sc.nextLine(), sc.nextLine()));
        }
        sc.close();
        sc = new Scanner(new File("BAITAP.in"));
        HashMap <String, String> mapBt = new HashMap<>();
        int m = Integer.parseInt(sc.nextLine());
        for(int i = 1; i <= m; i++){
            mapBt.put(""+i, sc.nextLine());
        }
        sc.close();
        sc = new Scanner(new File("NHOM.in"));
        ArrayList <Nhom> listNhom = new ArrayList<>();
        while(sc.hasNext()){
            listNhom.add(new Nhom(sc.next(), sc.next()));
        }
        listNhom.sort(Comparator.comparing(Nhom::getMaSv));
        for(Nhom nhom : listNhom){
            SinhVien x = null;
            for(SinhVien sv : listSv){
                if(sv.getMaSv().equals(nhom.getMaSv())){
                    x = sv;
                    break;
                }
            }
            System.out.println(x + " " + nhom.getNhom() + " " + mapBt.get(nhom.getNhom()));
        }
    }
}
