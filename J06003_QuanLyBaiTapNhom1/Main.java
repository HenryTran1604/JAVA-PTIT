/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package J06003_QuanLyBaiTapNhom1;

import java.util.ArrayList;
import java.util.Collections;
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
        ArrayList <BaiTap> listBt = new ArrayList<>();
        for(int i = 0; i < n; i++){
            String maSv = sc.nextLine();
            String hoTen = sc.nextLine();
            String sdt = sc.nextLine();
            int id = Integer.parseInt(sc.nextLine());
            SinhVien sv = new SinhVien(maSv, hoTen, sdt, id);
            listSv.add(sv);
        }
        for(int i = 0; i < m; i++){
            listBt.add(new BaiTap(sc.nextLine()));
        }
        for(int i = 0; i < n; i++){
            SinhVien x = listSv.get(i);
            listBt.get(x.getStt() - 1).getList().add(x);
        }
        int q = sc.nextInt();
        while(q-- > 0){
            int id = sc.nextInt();
            System.out.println("DANH SACH NHOM " + id + ":");
            for(SinhVien x : listBt.get(id - 1).getList()){
                System.out.println(x);
            }
            System.out.println("Bai tap dang ky: " + listBt.get(id - 1).getTen());
        }
    }
}
