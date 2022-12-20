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
public class CaThi {
    private String maCa, ngayThi, gioThi, phongThi;

    public CaThi(int i, String ngayThi, String gioThi, String phongThi) {
        this.maCa = String.format("C%03d", i);
        this.ngayThi = ngayThi;
        this.gioThi = gioThi;
        this.phongThi = phongThi;
    }

    public String getMaCa() {
        return maCa;
    }

    public String getNgayThi() {
        return ngayThi;
    }

    public String getGioThi() {
        return gioThi;
    }

    public String getPhongThi() {
        return phongThi;
    }
    
}
