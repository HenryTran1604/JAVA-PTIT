/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package J05066_TimKiemNhanVienTheoTen;

/**
 *
 * @author :Tran Quang Huy
 */
public class NhanVien {
    private String maNv, hoTen;

    public NhanVien() {
    }

    public NhanVien(String maNv, String hoTen) {
        this.maNv = maNv;
        this.hoTen = hoTen;
    }

    public void setMaNv(String maNv) {
        this.maNv = maNv;
    }

    public String getMaNv() {
        return maNv;
    }

    public String getHoTen() {
        return hoTen;
    }
    
    public String chucVu(){
        return this.maNv.substring(0, 2);
    }
    public int heSoLuong(){
        return Integer.parseInt(this.maNv.substring(2, 4));
    }
    public int soHieu(){
        return Integer.parseInt(this.maNv.substring(4));
    }
    public String toString(){
        return this.hoTen + " " + this.chucVu() + " " + String.format("%03d", this.soHieu()) + " " 
                + String.format("%02d", this.heSoLuong());
    }
}
