/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package J06006_QuanLyBanHang2;

/**
 *
 * @author :Tran Quang Huy
 */
public class HoaDon {
    private String maHd;
    private KhachHang kh;
    private MatHang mh;
    private int SoLuong;

    public HoaDon(int i, KhachHang kh, MatHang mh, int SoLuong) {
        this.maHd = String.format("HD%03d", i);
        this.kh = kh;
        this.mh = mh;
        this.SoLuong = SoLuong;
    }
    public long thanhTien(){
        return this.mh.getGiaBan() * this.SoLuong;
    }
    public long loiNhuan(){
        return this.thanhTien() - this.mh.getGiaMua() * this.SoLuong;
    }
    public String toString(){
        return this.maHd + " " + this.kh.toString() + " " + this.mh + " " + this.SoLuong + " " + this.thanhTien() + " " + this.loiNhuan();
    }
}
