/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package J05046_BangKeNhapKho;

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
    private static Map <String, Integer> map;
    
    public static void initMap(){
        LoHang.map = new HashMap<>();
    }
//    public static void hienMap(){
//        for(Map.Entry<String, Integer> x : map.entrySet()){
//            System.out.println(x.getKey() + " " + x.getValue());
//        }
//    }
    public LoHang(String tenHang, int soLuong, int donGia) {
        String[] arr = tenHang.trim().split("\\s+");
        String tmp = "" + Character.toUpperCase(arr[0].charAt(0)) + Character.toUpperCase(arr[1].charAt(0));
        if(map.containsKey(tmp)){
            int d = map.get(tmp);
            this.maHang = tmp + String.format("%02d", ++d);
            map.put(tmp, d);
        }
        else{
            this.maHang = tmp + String.format("%02d", 1);
            map.put(tmp, 1);
        }
        this.tenHang = tenHang;
        this.soLuong = soLuong;
        this.donGia = donGia;
    }
    public float phanTramChietKhau(){
        if(this.soLuong > 10) return 0.05f;
        if(this.soLuong > 7) return 0.02f;
        if(this.soLuong > 4) return 0.01f;
        return 0;
    }
    public int tienChietKhau(){
        return (int) (this.donGia * this.soLuong * this.phanTramChietKhau());
    }
    public int thanhTien(){
        return this.donGia * this.soLuong - this.tienChietKhau();
    }
    
    @Override
    public String toString(){
        return this.maHang + " " + this.tenHang + " " + this.tienChietKhau() + " " + this.thanhTien();
    }
}
public class J05046 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        LoHang.initMap();
        for(int i = 0; i < n; i++){
            sc.nextLine();
            String tenHang = sc.nextLine();
            int soLuong = sc.nextInt();
            int donGia = sc.nextInt();
            LoHang lh = new LoHang(tenHang, soLuong, donGia);
            System.out.println(lh);
        }
    }
}

