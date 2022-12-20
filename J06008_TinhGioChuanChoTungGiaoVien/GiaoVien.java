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
public class GiaoVien {
    private String maGV, tenGV;

    public GiaoVien(String maGV, String tenGV) {
        this.maGV = maGV;
        this.tenGV = tenGV;
    }

    public String getMaGV() {
        return maGV;
    }

    public String getTenGV() {
        return tenGV;
    }
    public String toString(){
        return this.tenGV;
    }
}
