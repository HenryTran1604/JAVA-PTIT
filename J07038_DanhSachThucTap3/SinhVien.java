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
public class SinhVien implements Comparable<SinhVien>{
    private String maSinhVien, hoTen, lop, email;

    public SinhVien(String maSinhVien, String hoTen, String lop, String email) {
        this.maSinhVien = maSinhVien;
        this.hoTen = hoTen;
        this.lop = lop;
        this.email = email;
    }

    public String getMaSinhVien() {
        return maSinhVien;
    }
    public void chuanHoaTen(){
        StringBuilder sb = new StringBuilder();
        String[] arr = this.hoTen.trim().split("\\s+");
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
    @Override
    public int compareTo(SinhVien o){
        return this.maSinhVien.compareTo(o.maSinhVien);
    }
    @Override
    public String toString(){
        return this.maSinhVien + " " + this.hoTen + " " + this.lop;
    }
}
