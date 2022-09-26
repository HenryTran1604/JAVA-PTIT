/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package J07025_DanhSachKhachHangTrongFile;

/**
 *
 * @author :Tran Quang Huy
 */
public class KhachHang {
    private String maKH, tenKH, gioiTinh, ngaySinh, diaChi;
    private static int id = 1;

    public KhachHang(String tenKH, String gioiTinh, String ngaySinh, String diaChi) {
        this.maKH = "KH" + String.format("%03d", id++);
        this.tenKH = tenKH;
        this.gioiTinh = gioiTinh;
        this.ngaySinh = ngaySinh;
        this.diaChi = diaChi;
    }

    public String getNgaySinh() {
        return ngaySinh;
    }
    public void chuanHoaTen(){
        StringBuilder sb = new StringBuilder();
        String[] arr = this.tenKH.trim().split("\\s+");
        for(String x : arr){
            sb.append(Character.toUpperCase(x.charAt(0)));
            for(int j = 1; j < x.length(); j++){
                sb.append(Character.toLowerCase(x.charAt(j)));
            }
            sb.append(" ");
        }
        sb = sb.deleteCharAt(sb.length() - 1);
        this.tenKH = sb.toString();
    }
    public void chuanHoaNgaySinh(){
        StringBuilder sb = new StringBuilder(this.ngaySinh);
        if(sb.charAt(2) != '/') sb.insert(0, "0");
        if(sb.charAt(5) != '/') sb.insert(3, "0");
        this.ngaySinh = sb.toString();
    }
    @Override
    public String toString(){
        return this.maKH + " " + this.tenKH + " " + this.gioiTinh + " " + this.diaChi
                + " " + this.ngaySinh;
    }
}
