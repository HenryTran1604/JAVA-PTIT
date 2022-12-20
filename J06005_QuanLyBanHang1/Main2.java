/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package J06005_QuanLyBanHang1;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

/**
 *
 * @author :Tran Quang Huy
 */
public class Main2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        HashMap <String, KhachHang> mapKh = new HashMap<>();
        int n = Integer.parseInt(sc.nextLine());
        for(int i = 1; i <= n; i++){
            KhachHang x = new KhachHang(i, sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextLine());
            mapKh.put(x.getMaKh(), x);
        }
        int m = Integer.parseInt(sc.nextLine());
        HashMap <String, MatHang> mapMh = new HashMap<>();
        for(int i = 1; i <= m; i++){
            MatHang x = new MatHang(i, sc.nextLine(), sc.nextLine(), Integer.parseInt(sc.nextLine()), Integer.parseInt(sc.nextLine()));
            mapMh.put(x.getMaMh(), x);
        }
        int p = sc.nextInt();
        ArrayList <HoaDon> listHd = new ArrayList<>();
        for(int i = 1; i <= p; i++){
            String maKh = sc.next(), maMh = sc.next();
            int soLuong = sc.nextInt();
            
            listHd.add(new HoaDon(i, mapKh.get(maKh), mapMh.get(maMh), soLuong));
        }
        for(HoaDon x : listHd){
            System.out.println(x);
        }
    }
}
