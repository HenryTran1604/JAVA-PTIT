
package danhsachsinhvien1;

import java.io.Serializable;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class SinhVien implements Serializable{
    private String ma, ten, lop;
    private Date ngaysinh;
    private float gpa;

    public SinhVien(int id, String ten, String lop, String ngaySinh, float gpa) throws ParseException {
        this.ma = String.format("B20DCCN%03d", id);
        this.ten = ten;
        this.lop = lop;
        SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
        this.ngaysinh = formatter.parse(ngaySinh);
        this.gpa = gpa;
    }
    @Override
    public String toString(){
        SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
        return this.ma + " " + this.ten + " " + this.lop + " " + 
                formatter.format(this.ngaysinh) + " " + String.format("%.2f", this.gpa);
    }
}
