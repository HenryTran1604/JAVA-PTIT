/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package J05013_TuyenDung;

/**
 *
 * @author :Tran Quang Huy
 */
public class ThiSinh {
    private String maTS,hoTen;
    private double lyThuyet, thucHanh;
    private static int id = 1;

    public ThiSinh(String hoTen, double lyThuyet, double thucHanh) {
        this.maTS = "TS" + String.format("%02d", id++);
        this.hoTen = hoTen;
        this.lyThuyet = lyThuyet;
        this.thucHanh = thucHanh;
    }
    public double diemTB(){
        return (this.lyThuyet + this.thucHanh) / 2;
    }
    public String trangThai(){
        if(this.diemTB() < 5)
            return "TRUOT";
        if(this.diemTB() < 8)
            return "CAN NHAC";
        if(this.diemTB() <= 9.5)
            return "DAT";
        return "XUAT SAC";
    }
    @Override
    public String toString(){
        return this.maTS + " " + this.hoTen + " " + String.format("%.2f", this.diemTB()) + " " + this.trangThai();
    }
}
