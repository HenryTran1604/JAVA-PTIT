/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package J07020_HoaDon2;

/**
 *
 * @author :Tran Quang Huy
 */
public class HoaDon {
    private String maHD;
    private KhachHang kh;
    private MatHang mh;
    private int soLuong;

    public HoaDon(int i, KhachHang kh, MatHang mh, int soLuong) {
        this.maHD = String.format("HD%03d", i);
        this.kh = kh;
        this.mh = mh;
        this.soLuong = soLuong;
    }
    public int thanhTien(){
        return this.soLuong * this.mh.getGiaBan();
    }
    public String toString(){
        return this.maHD + " " + this.kh + " " + this.mh + " " + this.soLuong +" " + this.thanhTien();
    }
}
