/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package J05079_LopHocPhan1;

/**
 *
 * @author :Tran Quang Huy <HenryTran at github.com/Henrytran1604>
 */
public class LopHocPhan {
    private String maMonHoc, tenMonHoc, nhomLop, tenGiangVien;

    public LopHocPhan(String maMonHoc, String tenMonHoc, String nhomLop, String tenGiangVien) {
        this.maMonHoc = maMonHoc;
        this.tenMonHoc = tenMonHoc;
        this.nhomLop = nhomLop;
        this.tenGiangVien = tenGiangVien;
    }

    public String getNhomLop() {
        return nhomLop;
    }

    public String getMaMonHoc() {
        return maMonHoc;
    }
    
    public String toString(){
        return this.nhomLop + " " + this.tenGiangVien;
    }
}
