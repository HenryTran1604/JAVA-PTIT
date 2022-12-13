/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package J06004_QuanLyBaiTapNhom2;

/**
 *
 * @author :Tran Quang Huy
 */
public class SinhVien {
    private String maSv, hoTen, sdt;
    private int stt;

    public SinhVien(String maSv, String hoTen, String sdt, int stt) {
        this.maSv = maSv;
        this.hoTen = hoTen;
        this.sdt = sdt;
        this.stt = stt;
    }

    public String getMaSv() {
        return maSv;
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
    public String toString(){
        return this.maSv + " " + this.hoTen + " " + this.sdt + " " + this.stt;
    }
}
