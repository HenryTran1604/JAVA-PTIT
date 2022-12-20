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
public class LopHocPhan {
    private GiaoVien gv;
    private MonHoc monHoc;
    private float soGio;

    public LopHocPhan(GiaoVien gv, MonHoc monHoc, float soGio) {
        this.gv = gv;
        this.monHoc = monHoc;
        this.soGio = soGio;
    }

    public GiaoVien getGv() {
        return gv;
    }

    public MonHoc getMonHoc() {
        return monHoc;
    }

    public float getSoGio() {
        return soGio;
    }
    
}
