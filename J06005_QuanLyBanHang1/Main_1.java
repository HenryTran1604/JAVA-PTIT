/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package J06005_QuanLyBanHang1;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author :Tran Quang Huy
 */
public class Main_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList <KhachHang> listKh = new ArrayList<>();
        int n = Integer.parseInt(sc.nextLine());
        for(int i = 1; i <= n; i++){
            listKh.add(new KhachHang(i, sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextLine()));
        }
        int m = Integer.parseInt(sc.nextLine());
        ArrayList <MatHang> listMh = new ArrayList<>();
        for(int i = 1; i <= m; i++){
            listMh.add(new MatHang(i, sc.nextLine(), sc.nextLine(), Integer.parseInt(sc.nextLine()), Integer.parseInt(sc.nextLine())));
        }
        int p = sc.nextInt();
        ArrayList <HoaDon> listHd = new ArrayList<>();
        for(int i = 1; i <= p; i++){
            String maKh = sc.next(), maMh = sc.next();
            int soLuong = sc.nextInt();
            KhachHang kh = null;
            MatHang mh = null;
            for(KhachHang x : listKh){
                if(x.getMaKh().equals(maKh)){
                    kh = x;
                    break;
                }
            }
            for(MatHang x : listMh){
                if(x.getMaMh().equals(maMh)){
                    mh = x;
                    break;
                }
            }
            listHd.add(new HoaDon(i, kh, mh, soLuong));
        }
        for(HoaDon x : listHd){
            System.out.println(x);
        }
    }
}
