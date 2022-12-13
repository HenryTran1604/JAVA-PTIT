/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package J05055_XepHangVanDongVien1;

import java.text.ParseException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

/**
 *
 * @author :Tran Quang Huy
 */
public class Main {
    public static void main(String[] args) throws ParseException {
        Scanner sc = new Scanner(System.in);
        ArrayList <VanDongVien> list = new ArrayList<>(), list2;
        int n = Integer.parseInt(sc.nextLine());
        for(int i = 0; i < n; i++){
            list.add(new VanDongVien(i + 1, sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextLine()));
        }
        list2 = (ArrayList<VanDongVien>)list.clone();
        Collections.sort(list, new Comparator<VanDongVien>(){
            @Override
            public int compare(VanDongVien o1, VanDongVien o2) {
                return (int)(o1.thanhTichXepHang() - o2.thanhTichXepHang());
            }
        });
        int currThanhTich = 0, rank = 0, sameRank = 1;
        for(VanDongVien x : list){
            if(currThanhTich == (int) x.thanhTichXepHang()){
                sameRank++;
            }
            else{
                rank += sameRank;
                sameRank = 1;
            }
            currThanhTich = (int) x.thanhTichXepHang();
            x.setXepHang(rank);
        }
        for(VanDongVien x : list2){
            System.out.println(x);
        }
    }
}
