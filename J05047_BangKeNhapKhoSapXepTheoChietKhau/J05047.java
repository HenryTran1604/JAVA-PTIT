/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package J05047_BangKeNhapKhoSapXepTheoChietKhau;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 *
 * @author admin
 */
class LoHang{
    private String maHang, tenHang;
    private int soLuong, donGia;
    private static Map <String, Integer> map = new HashMap<>();

    public LoHang(String tenHang, int soLuong, int donGia) {
        this.tenHang = tenHang;
        this.soLuong = soLuong;
        this.donGia = donGia;
        String[] arr = tenHang.split("\\s+");
        String tmp = "" + Character.toUpperCase(arr[0].charAt(0)) + Character.toUpperCase(arr[1].charAt(0));
        if(map.containsKey(tmp)){
            int t = map.get(tmp);
            ++t;
            this.maHang = tmp + String.format("%02d", t);
            map.put(tmp, t);
        }
        else{
            this.maHang = tmp + "01";
            map.put(tmp, 1);
        }
    }
    public int tienChietKhau(){
        int tmp = this.donGia * this.soLuong;
        float p = 0;
        if(this.soLuong > 10)
            p = 0.05f;
        else if(this.soLuong >= 8)
            p = 0.02f;
        else if(this.soLuong >= 5)
            p = 0.01f;
        else
            p = 0;
        return (int) (p * tmp);
    }
    public int thanhTien(){
        return this.soLuong * this.donGia - this.tienChietKhau();
    }
    @Override
    public String toString(){
        return this.maHang + " " + this.tenHang + " " + this.tienChietKhau() + " " + this.thanhTien();
    }
}
public class J05047 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList <LoHang> list = new ArrayList<>();
        while(n-- > 0){
            sc.nextLine();
            String tenHang = sc.nextLine();
            int soLuong = sc.nextInt();
            int donGia = sc.nextInt();
            list.add(new LoHang(tenHang, soLuong, donGia));
        }
        Collections.sort(list, new Comparator<LoHang>(){
            @Override
            public int compare(LoHang o1, LoHang o2) {
                return o2.tienChietKhau() - o1.tienChietKhau();
            }
        });
        for(LoHang x : list){
            System.out.println(x);
        }
    }
}
