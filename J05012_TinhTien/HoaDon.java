/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package J05012_TinhTien;

/**
 *
 * @author :Tran Quang Huy
 */
public class HoaDon {
    private String maMatHang, tenMatHang;
    private long soLuongMua, donGia, tienChietKhau;

    public HoaDon(String maMatHang, String tenMatHang, long soLuongMua, long donGia, long tienChietKhau) {
        this.maMatHang = maMatHang;
        this.tenMatHang = tenMatHang;
        this.soLuongMua = soLuongMua;
        this.donGia = donGia;
        this.tienChietKhau = tienChietKhau;
    }
    public long tongTien(){
        return this.soLuongMua * this.donGia - this.tienChietKhau;
    }
    @Override
    public String toString(){
        return this.maMatHang + ' ' + this.tenMatHang + ' ' + this.soLuongMua
                + ' ' + this.donGia + ' ' + this.tienChietKhau + ' ' + this.tongTien();
    }
}
