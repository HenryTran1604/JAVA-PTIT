/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package J07028_TinhGioChuan;

/**
 *
 * @author :Tran Quang Huy
 */
public class GioChuan {
    private GiangVien gv;
    private MonHoc mon;
    private float gioChuan;

    public GioChuan(GiangVien gv, MonHoc mon, float gioChuan) {
        this.gv = gv;
        this.mon = mon;
        this.gioChuan = gioChuan;
    }

    public GiangVien getGv() {
        return gv;
    }

    public MonHoc getMon() {
        return mon;
    }

    public float getGioChuan() {
        return gioChuan;
    }
    @Override
    public String toString(){
        return this.gv.getTenGv();
    }
}
