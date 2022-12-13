/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package J07013_DanhSachSinhVienTrongFileNhiPhan;

import java.io.Serializable;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author :Tran Quang Huy
 */
public class SinhVien implements Serializable{
    private String ma, ten, lop;
    private Date ngaySinh;
    private float gpa;

    public SinhVien(String ma, String ten, String lop, String ngaySinh, float gpa) throws ParseException {
        this.ma = ma;
        this.ten = ten;
        this.lop = lop;
        SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
        this.ngaySinh = formatter.parse(ngaySinh);
        this.gpa = gpa;
    }
    @Override
    public String toString(){
        SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
        return this.ma + " " + this.ten + " " + this.lop + " " + 
                formatter.format(this.ngaySinh) + " " + String.format("%.2f", this.gpa);
    }
}
