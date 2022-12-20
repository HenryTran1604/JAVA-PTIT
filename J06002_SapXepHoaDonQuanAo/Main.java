/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package J06002_SapXepHoaDonQuanAo;

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
        int n = Integer.parseInt(sc.nextLine());
        ArrayList <SanPham> listSp = new ArrayList<>();
        for(int i = 0; i < n; i++){
            listSp.add(new SanPham(sc.nextLine(), sc.nextLine(), Integer.parseInt(sc.nextLine()), Integer.parseInt(sc.nextLine())));
        }
        int m = Integer.parseInt(sc.nextLine());
        ArrayList <HoaDon> listHd = new ArrayList<>();
        for(int i = 0; i < m; i++){
            String ma = sc.next();
            int soLuong = sc.nextInt();
            for(SanPham x : listSp){
                if(ma.startsWith(x.getMaLoai())){
                    listHd.add(new HoaDon(ma,i+1, x, soLuong));
                    break;
                }
            }
        }
        listHd.sort(Comparator.comparing(HoaDon::thanhTien, Comparator.reverseOrder()));
        for(HoaDon x : listHd){
            System.out.println(x);
        }
    }
}
