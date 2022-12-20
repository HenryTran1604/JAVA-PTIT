/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package J07019_HoaDon1;

/**
 *
 * @author :Tran Quang Huy
 */
public class HoaDon {
    private String maHD;
    private SanPham sp;
    private int soLuong;

    public HoaDon(int i, String maHD, SanPham sp, int soLuong) {
        this.maHD = maHD + String.format("-%03d", i);
        this.sp = sp;
        this.soLuong = soLuong;
    }
    public int tongTien(){
        int donGia = (maHD.charAt(2) == '1' ? sp.getGiaLoai1() : sp.getGiaLoai2());
        return donGia * soLuong;
    }
    public int giamGia(){
        if(soLuong >= 150) return (int) (0.5*tongTien());
        if(soLuong >= 100) return (int) (0.3*tongTien());
        if(soLuong >= 50) return (int) (0.15*tongTien());
        return 0;
    }
    public int thanhTien(){
        return tongTien() - giamGia();
    }
    public String toString(){
        return this.maHD + " " + this.sp.getTenSanPham() + " " + this.giamGia() + " " + this.thanhTien();
    }
}
