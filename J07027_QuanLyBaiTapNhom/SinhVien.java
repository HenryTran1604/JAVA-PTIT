/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package J07027_QuanLyBaiTapNhom;

/**
 *
 * @author :Tran Quang Huy
 */
public class SinhVien {
    private String maSv, hoTen, sdt;

    public SinhVien(String maSv, String hoTen, String sdt) {
        this.maSv = maSv;
        this.hoTen = hoTen;
        this.sdt = sdt;
    }

    public String getMaSv() {
        return maSv;
    }
    public String toString(){
        return this.maSv + " " + this.hoTen + " " + this.sdt;
    }
}
