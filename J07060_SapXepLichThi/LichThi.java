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
public class LichThi {
    private CaThi caThi;
    private MonThi monThi;
    private String maNhom;
    private int soSv;

    public LichThi(CaThi caThi, MonThi monThi, String maNhom, int soSv) {
        this.caThi = caThi;
        this.monThi = monThi;
        this.maNhom = maNhom;
        this.soSv = soSv;
    }

    public CaThi getCaThi() {
        return caThi;
    }

    public MonThi getMonThi() {
        return monThi;
    }

    public String getMaNhom() {
        return maNhom;
    }
    public String toString(){
        return this.caThi.getNgayThi() + " " + this.caThi.getGioThi() + " " + this.caThi.getPhongThi()+" "
                + this.monThi.getTenMon() + " " + this.maNhom + " " + this.soSv;
    }
}
