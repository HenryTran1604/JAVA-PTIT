/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package J07025_DanhSachKhachHangTrongFile;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**
 *
 * @author :Tran Quang Huy
 */
public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("KHACHHANG.in"));
        int n = Integer.parseInt(sc.nextLine());
        ArrayList <KhachHang> list = new ArrayList<>();
        while(n-- > 0){
            KhachHang kh = new KhachHang(sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextLine());
            kh.chuanHoaNgaySinh();
            kh.chuanHoaTen();
            list.add(kh);
        }
        Collections.sort(list, new SortByAge());
        for(KhachHang x : list){
            System.out.println(x);
        }
    }
}
