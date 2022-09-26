/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package J05076_NhapXuatHang;

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
        ArrayList <MatHang> list = new ArrayList<>();
        for(int i = 0; i < n; i++){
            String ma = sc.nextLine();
            String ten = sc.nextLine();
            String xepLoai = sc.nextLine();
            list.add(new MatHang(ma, ten, xepLoai));
        }
        int m = sc.nextInt();
        while(m-- > 0){
            String ma = sc.next();
            int soLuongNhap = sc.nextInt();
            int donGiaNhap = sc.nextInt();
            int soLuongXuat = sc.nextInt();
            for(MatHang x : list){
                if(x.getMa().equals(ma)){
                    x.setTongGiaTriNhap(soLuongNhap, donGiaNhap);
                    x.setTongGiaTriXuat(soLuongXuat, donGiaNhap);
                    System.out.println(x);
                    break;
                }
            }
        }
    }
}

