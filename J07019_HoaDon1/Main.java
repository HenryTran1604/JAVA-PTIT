/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package J07019_HoaDon1;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author :Tran Quang Huy
 */
public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("DATA1.in"));
        ArrayList <SanPham> listSp = new ArrayList<>();
        int n = Integer.parseInt(sc.nextLine());
        while(n-- > 0)
            listSp.add(new SanPham(sc.nextLine(), sc.nextLine(), Integer.parseInt(sc.nextLine()), Integer.parseInt(sc.nextLine())));
        sc.close();
        sc = new Scanner(new File("DATA2.in"));
        int m = sc.nextInt();
        ArrayList <HoaDon> listHd = new ArrayList<>();
        for(int i = 1; i <= m; i++){
            String maHD = sc.next();
            int soLuong = sc.nextInt();
            for(SanPham x : listSp){
                if(maHD.startsWith(x.getMaLoai())){
                    listHd.add(new HoaDon(i, maHD, x, soLuong));
                    break;
                }
            }
        }
        for(HoaDon x : listHd){
            System.out.println(x);
        }
    }  
}
