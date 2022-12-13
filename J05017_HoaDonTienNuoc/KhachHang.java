/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package J05017_HoaDonTienNuoc;

/**
 *
 * @author :Tran Quang Huy
 */
public class KhachHang {
    private String maKH, tenKh;
    private int chiSoCu, chiSoMoi;

    public KhachHang(int id, String tenKh, int chiSoCu, int chiSoMoi) {
        this.maKH = "KH" + String.format("%02d", id);
        this.tenKh = tenKh;
        this.chiSoCu = chiSoCu;
        this.chiSoMoi = chiSoMoi;
    }
    public int thanhTien(){
        int tieuThu = this.chiSoMoi - this.chiSoCu;
        if(tieuThu <= 50){
            return (int)Math.round(1.02 * tieuThu * 100);
        }
        if(tieuThu <= 100){
            return (int)Math.round(1.03*(5000 + (tieuThu - 50) * 150));
        }
        return (int)Math.round(1.05 * (12500 + (tieuThu - 100) * 200));
    }
    @Override
    public String toString(){
        return this.maKH + " " + this.tenKh + " " + this.thanhTien();
    }
}
