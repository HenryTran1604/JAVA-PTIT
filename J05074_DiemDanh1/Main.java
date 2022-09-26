/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package J05074_DiemDanh1;

import java.util.ArrayList;
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
        ArrayList <SinhVien> list = new ArrayList<>();
        for(int i = 0; i < n; i++){
            list.add(new SinhVien(sc.nextLine(), sc.nextLine(), sc.nextLine()));
        }
        for(int i = 0; i < n; i++){
            String maSV = sc.next();
            String diemDanh = sc.next();
            for(SinhVien x : list){
                if(x.getMaSV().equals(maSV)){
                    x.setDiemChuyenCan(diemDanh);
                }
            }
        }
        for(SinhVien x : list){
            System.out.println(x);
        }
    }
}
