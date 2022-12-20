/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package J07049_TinhNgayHetHanBaoHanh;

/**
 *
 * @author :Tran Quang Huy
 */
public class SanPham {
    private String maSanPham, tenSanPham;
    private int giaBan, hanBaoHanh;

    public SanPham(String maSanPham, String tenSanPham, int giaBan, int hanBaoHanh) {
        this.maSanPham = maSanPham;
        this.tenSanPham = tenSanPham;
        this.giaBan = giaBan;
        this.hanBaoHanh = hanBaoHanh;
    }

    public String getMaSanPham() {
        return maSanPham;
    }

    public String getTenSanPham() {
        return tenSanPham;
    }

    public int getGiaBan() {
        return giaBan;
    }

    public int getHanBaoHanh() {
        return hanBaoHanh;
    }
    
}
