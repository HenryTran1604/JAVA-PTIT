/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package J05073_TinhToanGiaBan;

/**
 *
 * @author :Tran Quang Huy
 */
public class DonHang {
    private String maDonHang;
    private int donGia, soLuong;

    public DonHang() {
    }

    public DonHang(String maDonHang, int donGia, int soLuong) {
        this.maDonHang = maDonHang;
        this.donGia = donGia;
        this.soLuong = soLuong;
    }

    public String getMaDonHang() {
        return maDonHang;
    }

    public int getDonGia() {
        return donGia;
    }

    public int getSoLuong() {
        return soLuong;
    }
    
    public int tienHang(){
        return donGia * soLuong;
    }
    
    public double tongChiPhi(){
        double tong = tienHang();
        char d = maDonHang.charAt(0), c = maDonHang.charAt(maDonHang.length() - 1);
        if(c == 'C'){
            if(d == 'T') tong *= (1 + 0.29*0.95+0.04);
            else if(d == 'C') tong *= (1 + 0.1*0.95+0.03);
            else if(d == 'D') tong *= (1 + 0.08*0.95+0.025);
            else tong *= (1 + 0.02*0.95+0.005);
        }
        else{
            if(d == 'T') tong *= 1.33;
            else if(d == 'C') tong *= 1.13;
            else if(d == 'D') tong *= 1.105;
            else tong *= 1.025;
        }
       return tong;
    }
    public double giaMatHang(){
        return this.tongChiPhi()*1.2 / this.soLuong;
    }
    public String toString(){
        return this.maDonHang + " " + String.format("%.2f", this.giaMatHang());
    }
}
