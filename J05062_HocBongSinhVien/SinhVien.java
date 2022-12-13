/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package J05062_HocBongSinhVien;

/**
 *
 * @author :Tran Quang Huy
 */
public class SinhVien {
    private String hoTen;
    private double gpa, drl;
    private String loaiHb;
    public SinhVien(String hoTen, double gpa, double drl) {
        this.hoTen = hoTen;
        this.gpa = gpa;
        this.drl = drl;
    }
    public void setLoaiHb(double tbc){
        if(this.gpa >= tbc){
            if(gpa >=3.6 && drl >= 90)
                this.loaiHb = "XUATSAC";
            else if(gpa >= 3.2 && drl >= 80)
                this.loaiHb = "GIOI";
            else if(gpa >= 2.5 && drl >= 70)
                this.loaiHb = "KHA";
            else
                this.loaiHb = "KHONG";
        }
        else
            this.loaiHb = "KHONG";
    }

    public double getGpa() {
        return gpa;
    }

    public double getDrl() {
        return drl;
    }
    
    @Override
    public String toString() {
        return this.hoTen + ": " + this.loaiHb;
    }
    
}
