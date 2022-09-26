/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package J07038_DanhSachThucTap3;

/**
 *
 * @author :Tran Quang Huy
 */
public class DoanhNghiep {
    private String maDoanhNghiep, tenDoanhNghiep;
    private int soSinhVien;
    public DoanhNghiep(String maDoanhNghiep, String tenDoanhNghiep, int soSinhVien) {
        this.maDoanhNghiep = maDoanhNghiep;
        this.tenDoanhNghiep = tenDoanhNghiep;
        this.soSinhVien = soSinhVien;
    }

    public String getMaDoanhNghiep() {
        return maDoanhNghiep;
    }

    public String getTenDoanhNghiep() {
        return tenDoanhNghiep;
    }

    public int getSoSinhVien() {
        return soSinhVien;
    }
    
}
