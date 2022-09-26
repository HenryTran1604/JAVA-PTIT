/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package J05082_DanhSachKhachHang;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**
 *
 * @author :Tran Quang Huy <HenryTran at github.com/Henrytran1604>
 */
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        ArrayList <KhachHang> list = new ArrayList<>();
        while(n-- > 0){
            KhachHang a = new KhachHang(sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextLine());
            a.chuanHoaNgaySinh();
            a.chuanHoaTen();
            list.add(a);
        }
        Collections.sort(list, new SortByAge());
        for(KhachHang x : list){
            System.out.println(x);
        }
    }
}
