/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package J05019_LuongMuaTrungBinh;

/**
 *
 * @author :Tran Quang Huy
 */
public class LuongMua {

    private String maTram, tenTram;
    private double luongMua, thoiGian;

    public LuongMua(int id, String tenTram, double luongMua, double thoiGian) {
        this.maTram = String.format("T%02d", id);
        this.tenTram = tenTram;
        this.luongMua = luongMua;
        this.thoiGian = thoiGian;
    }

    public String getMaTram() {
        return maTram;
    }

    public String getTenTram() {
        return tenTram;
    }

    public void addLuongMua(double luongMua) {
        this.luongMua += luongMua;
    }

    public void addThoiGianMua(double thoiGian) {
        this.thoiGian += thoiGian;
    }

    @Override
    public String toString() {
//        return this.maTram + " " + this.tenTram + " " + this.luongMua + " " + this.thoiGian;
        return this.maTram + " " + this.tenTram + " " + String.format("%.2f", this.luongMua/this.thoiGian);
    }
}
