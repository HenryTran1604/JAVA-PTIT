/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package J07018_ChuanHoaDanhSachSinhVien;

/**
 *
 * @author :Tran Quang Huy
 */
public class SinhVien {
    private String maSV, hoTen, lop, ngaySinh;
    private double gpa;
    private static int id = 1;
    public SinhVien( String hoTen, String lop, String ngaySinh, double gpa) {
        this.maSV = "B20DCCN" + String.format("%03d", id++);
        this.hoTen = hoTen;
        this.lop = lop;
        this.ngaySinh = ngaySinh;
        this.gpa = gpa;
    }
    public void chuanHoaTen(){
        String[] arr = this.hoTen.trim().split("\\s+");
        StringBuilder sb = new StringBuilder();
        for(String x : arr){
            sb.append(Character.toUpperCase(x.charAt(0)));
            for(int j = 1; j < x.length(); j++){
                sb.append(Character.toLowerCase(x.charAt(j)));
            }
            sb.append(" ");
        }
        sb = sb.deleteCharAt(sb.length() - 1);
        this.hoTen = sb.toString();
    }
    public void chuanHoaNgaySinh(){
        StringBuilder sb = new StringBuilder(this.ngaySinh);
        if(sb.charAt(2) != '/') sb.insert(0, "0");
        if(sb.charAt(5) != '/') sb.insert(3, "0");
        this.ngaySinh = sb.toString();
    }
    
    @Override
    public String toString(){
        return this.maSV + " " + this.hoTen + " " + this.lop + " " +  this.ngaySinh + " " + String.format("%.2f", this.gpa);
    }
}
