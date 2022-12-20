/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package J06001_TinhToanHoaDonBanQuanAo;

/**
 *
 * @author :Tran Quang Huy
 */
public class SanPham {
    private String maLoai, tenSp;
    private int giaLoai1, giaLoai2;

    public SanPham() {
    }

    public SanPham(String maLoai, String tenSp, int giaLoai1, int giaLoai2) {
        this.maLoai = maLoai;
        this.tenSp = tenSp;
        this.giaLoai1 = giaLoai1;
        this.giaLoai2 = giaLoai2;
    }

    public String getMaLoai() {
        return maLoai;
    }

    public String getTenSp() {
        return tenSp;
    }

    public int getGiaLoai1() {
        return giaLoai1;
    }

    public int getGiaLoai2() {
        return giaLoai2;
    }
    
}
