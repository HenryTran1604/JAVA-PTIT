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
public class MatHang {
    private String maMh, tenMh, donVi;
    private int giaMua, giaBan;

    public MatHang(int i, String tenMh, String donVi, int giaMua, int giaBan) {
        this.maMh = String.format("MH%03d", i);
        this.tenMh = tenMh;
        this.donVi = donVi;
        this.giaMua = giaMua;
        this.giaBan = giaBan;
    }

    public String getMaMh() {
        return maMh;
    }

    public String getTenMh() {
        return tenMh;
    }

    public String getDonVi() {
        return donVi;
    }

    public int getGiaMua() {
        return giaMua;
    }

    public int getGiaBan() {
        return giaBan;
    }
    public String toString(){
        return this.tenMh + " " + this.donVi + " " + this.giaMua + " " + this.giaBan;
    }
}
