/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package J06004_QuanLyBaiTapNhom2;

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
        int n = sc.nextInt(), m = sc.nextInt();
        sc.nextLine();
        ArrayList <SinhVien> listSv = new ArrayList<>();
        ArrayList <String> listBt = new ArrayList<>();
        for(int i = 0; i < n; i++){
            String maSv = sc.nextLine();
            String hoTen = sc.nextLine();
            String sdt = sc.nextLine();
            int stt = Integer.parseInt(sc.nextLine());
            SinhVien sv = new SinhVien(maSv, hoTen, sdt, stt);
            listSv.add(sv);
        }
        for(int i = 0; i < m; i++){
            listBt.add(sc.nextLine());
        }
        listSv.sort(Comparator.comparing(SinhVien::getMaSv));
        for(SinhVien sv : listSv){
            System.out.println(sv + " " + listBt.get(sv.getStt() - 1));
        }
    }
}
