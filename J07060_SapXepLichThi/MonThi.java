/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package J07060_SapXepLichThi;

/**
 *
 * @author :Tran Quang Huy
 */
public class MonThi {
    private String maMon, tenMon, hinhThuc;

    public MonThi(String maMon, String tenMon, String hinhThuc) {
        this.maMon = maMon;
        this.tenMon = tenMon;
        this.hinhThuc = hinhThuc;
    }

    public String getMaMon() {
        return maMon;
    }

    public String getTenMon() {
        return tenMon;
    }

    public String getHinhThuc() {
        return hinhThuc;
    }
    
}
