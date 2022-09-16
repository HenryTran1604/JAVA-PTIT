/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package J07051_TinhTienPhong;

import java.io.File;
import java.io.FileNotFoundException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author admin
 */
class KhachHang{
    private String maKH, tenKH, soPhong;
    private Date ngayNhan, ngayTra;
    private int dichVu;
    private static int id = 1;
    private static int donGia[] = {0, 25, 34, 50, 80};

    public KhachHang(String tenKH, String soPhong, String ngayNhan, String ngayTra, int dichVu) throws ParseException {
        this.maKH = "KH" + String.format("%02d", id++);
        this.tenKH = tenKH;
        this.soPhong = soPhong;
        SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy");
        this.ngayNhan = format.parse(ngayNhan);
        this.ngayTra = format.parse(ngayTra);
        this.dichVu = dichVu;
    }
    public static String chuanHoaNgay(String s){
        StringBuilder sb = new StringBuilder(s);
        if(sb.charAt(2) != '/') sb.insert(0, "0");
        if(sb.charAt(5) != '/') sb.insert(3, "0");
        return sb.toString();
    }
    public void chuanHoaTen(){
        StringBuilder sb = new StringBuilder();
        String[] arr = this.tenKH.trim().split("\\s+");
        
        for(int i = 0; i < arr.length; i++){
            sb.append(Character.toUpperCase(arr[i].charAt(0)));
            for(int j = 1; j < arr[i].length(); j++){
                sb.append(Character.toLowerCase(arr[i].charAt(j)));
            }
            sb.append(" ");
        }
        sb.deleteCharAt(sb.length() - 1);
        this.tenKH = sb.toString();
    }
    public int soNgayO(){
        return (int) ((this.ngayTra.getTime() - this.ngayNhan.getTime())/(1000*60*60*24) + 1);
    }
    public int thanhTien(){
        return this.soNgayO() * KhachHang.donGia[this.soPhong.charAt(0) - '0'] + this.dichVu;
    }
    
    @Override
    public String toString(){
        return this.maKH + " " + this.tenKH + " " + this.soPhong + " " + this.soNgayO() + " " + this.thanhTien()
;    }
}   
    
public class J07051 {
    public static void main(String[] args) throws FileNotFoundException, ParseException {
        Scanner sc = new Scanner(new File("KHACHHANG.in"));
        int n = sc.nextInt();
        ArrayList <KhachHang> list = new ArrayList<>();
        while(n-- > 0){
            sc.nextLine();
            String tenKH = sc.nextLine();
            String soPhong = sc.nextLine();
            String ngayNhan = sc.nextLine();
            ngayNhan = KhachHang.chuanHoaNgay(ngayNhan);
            String ngayTra = sc.nextLine();
            ngayTra = KhachHang.chuanHoaNgay(ngayTra);
            int dichVu = sc.nextInt();
            KhachHang kh = new KhachHang(tenKH, soPhong, ngayNhan, ngayTra, dichVu);
            kh.chuanHoaTen();
            list.add(kh);
        }
        Collections.sort(list, new Comparator<KhachHang>(){
            @Override
            public int compare(KhachHang o1, KhachHang o2) {
                return o2.thanhTien() - o1.thanhTien();
            }
        });
        
        for(KhachHang x : list){
            System.out.println(x);
        }
    }
}
