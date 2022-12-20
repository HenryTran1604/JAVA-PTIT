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
public class SanPham {
    private String maLoai, tenSanPham;
    private int giaLoai1, giaLoai2;

    public SanPham(String maLoai, String tenSanPham, int giaLoai1, int giaLoai2) {
        this.maLoai = maLoai;
        this.tenSanPham = tenSanPham;
        this.giaLoai1 = giaLoai1;
        this.giaLoai2 = giaLoai2;
    }

    public String getMaLoai() {
        return maLoai;
    }

    public String getTenSanPham() {
        return tenSanPham;
    }

    public int getGiaLoai1() {
        return giaLoai1;
    }

    public int getGiaLoai2() {
        return giaLoai2;
    }
    
}
