/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package J07075_LichGiangDayTheoGiangVien;


/**
 *
 * @author :Tran Quang Huy
 */
public class NhomHocPhan {
    private String maNhom, maMon;
    private int ngay, kip;
    private String giangVien, phongHoc;

    public NhomHocPhan() {
    }

    public NhomHocPhan(int i, String maMon, int ngay, int kip, String giangVien, String phongHoc) {
        this.maNhom = String.format("HP%03d", i);
        this.maMon = maMon;
        this.ngay = ngay;
        this.kip = kip;
        this.giangVien = giangVien;
        this.phongHoc = phongHoc;
    }

    public String getMaMon() {
        return maMon;
    }

    public int getNgay() {
        return ngay;
    }

    public int getKip() {
        return kip;
    }

    public String getGiangVien() {
        return giangVien;
    }

    public String getMaNhom() {
        return maNhom;
    }

    public String getPhongHoc() {
        return phongHoc;
    }
    
    
}
