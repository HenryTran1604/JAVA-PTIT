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
public class KhachHang {
    private String maKh, tenKh, gioiTinh, ngaySinh, diaChi;

    public KhachHang(int i, String tenKh, String gioiTinh, String ngaySinh, String diaChi) {
        this.maKh = String.format("KH%03d", i);
        this.tenKh = tenKh;
        this.gioiTinh = gioiTinh;
        this.ngaySinh = ngaySinh;
        this.diaChi = diaChi;
    }

    public String getMaKh() {
        return maKh;
    }

    public String getTenKh() {
        return tenKh;
    }

    public String getGioiTinh() {
        return gioiTinh;
    }

    public String getNgaySinh() {
        return ngaySinh;
    }

    public String getDiaChi() {
        return diaChi;
    }
    public String toString(){
        return this.tenKh + " " + this.diaChi;
    }
}
