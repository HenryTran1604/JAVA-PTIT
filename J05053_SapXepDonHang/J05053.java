/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package J05053_SapXepDonHang;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

/**
 *
 * @author admin
 */
class DonHang{
    private String tenHang, maDonHang;
    private int donGia, soLuong;

    public DonHang(String tenHang, String maDonHang, int donGia, int soLuong) {
        this.tenHang = tenHang;
        this.maDonHang = maDonHang;
        this.donGia = donGia;
        this.soLuong = soLuong;
    }
    public String soThuTu(){
        return this.maDonHang.substring(1, 4);
    }
    public int maLoai(){
        return this.maDonHang.charAt(this.maDonHang.length() - 1) - '0';
    }
    public int giamGia(){
        if(this.maLoai() == 1)
            return (int)(0.5 * this.donGia * this.soLuong);
        return (int)(0.3 * this.donGia * this.soLuong);
    }
    public int thanhTien(){
        return this.donGia * this.soLuong - this.giamGia();
    }
    
    @Override
    public String toString(){
        return this.tenHang + " " + this.maDonHang + " " + this.soThuTu()
                + " " + this.giamGia() + " " + this.thanhTien();
    }
}
public class J05053 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList <DonHang> list = new ArrayList<>();
        int n = sc.nextInt();
        while(n-- > 0){
            sc.nextLine();
            String tenHang = sc.nextLine();
            String maHang = sc.next();
            int donGia = sc.nextInt();
            int soLuong = sc.nextInt();
            list.add(new DonHang(tenHang, maHang, donGia, soLuong));
        }
        Collections.sort(list, new Comparator<DonHang>(){
            @Override
            public int compare(DonHang o1, DonHang o2) {
                return o1.soThuTu().compareTo(o2.soThuTu());
            }
        });
        for(DonHang x : list){
            System.out.println(x);
        }
    }
}

