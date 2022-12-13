/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package J05071_TinhCuocDienThoaiCoDinh1;

/**
 *
 * @author :Tran Quang Huy
 */
public class Tinh {
    private String maVung, ten;
    private int giaCuoc;

    public Tinh() {
    }

    public Tinh(String maVung, String ten, int giaCuoc) {
        this.maVung = maVung;
        this.ten = ten;
        this.giaCuoc = giaCuoc;
    }

    public String getMaVung() {
        return maVung;
    }

    public void setMaVung(String maVung) {
        this.maVung = maVung;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public int getGiaCuoc() {
        return giaCuoc;
    }

    public void setGiaCuoc(int giaCuoc) {
        this.giaCuoc = giaCuoc;
    }
    
}
