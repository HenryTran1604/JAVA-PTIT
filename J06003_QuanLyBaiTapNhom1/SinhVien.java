/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package J06003_QuanLyBaiTapNhom1;

/**
 *
 * @author :Tran Quang Huy
 */
public class SinhVien {
    private String maSinhVien, hoTen, sdt;
    private int stt;

    public SinhVien(String maSinhVien, String hoTen, String sdt, int stt) {
        this.maSinhVien = maSinhVien;
        this.hoTen = hoTen;
        this.sdt = sdt;
        this.stt = stt;
    }

    public String getMaSinhVien() {
        return maSinhVien;
    }

    public String getHoTen() {
        return hoTen;
    }

    public String getSdt() {
        return sdt;
    }

    public int getStt() {
        return stt;
    }

    @Override
    public String toString() {
        return this.maSinhVien + " " + this.hoTen + " " + this.sdt;
    }
    
}
