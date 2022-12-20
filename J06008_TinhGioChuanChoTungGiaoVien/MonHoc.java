/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package J06008_TinhGioChuanChoTungGiaoVien;

/**
 *
 * @author :Tran Quang Huy
 */
public class MonHoc {
    private String maMon, tenMon;

    public MonHoc(String maMon, String tenMon) {
        this.maMon = maMon;
        this.tenMon = tenMon;
    }

    public String getMaMon() {
        return maMon;
    }

    public String getTenMon() {
        return tenMon;
    }
    public String toString(){
        return this.tenMon;
    }
}
