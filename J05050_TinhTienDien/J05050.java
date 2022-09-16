/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package J05050_TinhTienDien;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author admin
 */
class KhachHang{
    private String maKH, LoaiSD;
    private int chiSoCu, chiSoMoi;
    private static int id = 1;
    public KhachHang(String LoaiSD, int chiSoCu, int chiSoMoi) {
        this.maKH = "KH" + String.format("%02d", id++);
        this.LoaiSD = LoaiSD;
        this.chiSoCu = chiSoCu;
        this.chiSoMoi = chiSoMoi;
    }
    public int heSo(){
        if(this.LoaiSD.equals("KD"))
            return 3;
        if(this.LoaiSD.equals("NN"))
            return 5;
        if(this.LoaiSD.equals("TT"))
            return 4;
        return 2;
    }
    public int thanhTien(){
        return (this.chiSoMoi - this.chiSoCu) * this.heSo() * 550;
    }
    public int phuTroi(){
        int tmp = this.chiSoMoi - this.chiSoCu;
        if(tmp < 50)
            return 0;
        if(tmp <= 100)
            return Math.round(0.35f * this.thanhTien());
        return this.thanhTien();
    }
    public int tongTienPhaiTra(){
        return this.thanhTien() + this.phuTroi();
    }
    @Override
    public String toString(){
        return this.maKH + " " + this.heSo() + " " + this.thanhTien() + " " + this.phuTroi() + " " + this.tongTienPhaiTra();
    }
}
public class J05050 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList <KhachHang> list = new ArrayList<>();
        while(n-- > 0){
            String loaiSD = sc.next();
            int chiSoCu = sc.nextInt();
            int chiSoMoi = sc.nextInt();
            list.add(new KhachHang(loaiSD, chiSoCu, chiSoMoi));
        }
        for(KhachHang x : list){
            System.out.println(x);
        }
    }
}
