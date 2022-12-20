/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package J05073_TinhToanGiaBan;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author :Tran Quang Huy
 */
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList <DonHang> list = new ArrayList<>();
        for(int i = 0; i < n; i++){
            list.add(new DonHang(sc.next(), Integer.parseInt(sc.next()), Integer.parseInt(sc.next())));
        }
        for(DonHang x : list){
            System.out.println(x);
        }
    }
}
