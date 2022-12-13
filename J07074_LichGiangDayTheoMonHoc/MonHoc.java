/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package J07074_LichGiangDayTheoMonHoc;

/**
 *
 * @author :Tran Quang Huy
 */
public class MonHoc {
    private String maMon, tenMon;
    private int soTinChi;

    public MonHoc() {
    }

    public MonHoc(String maMon, String tenMon, int soTinChi) {
        this.maMon = maMon;
        this.tenMon = tenMon;
        this.soTinChi = soTinChi;
    }

    public String getMaMon() {
        return maMon;
    }

    public String getTenMon() {
        return tenMon;
    }
}
