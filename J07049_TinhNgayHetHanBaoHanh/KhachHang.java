/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package J07049_TinhNgayHetHanBaoHanh;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.ZoneId;
import java.util.Date;

/**
 *
 * @author :Tran Quang Huy
 */
public class KhachHang {
    private String maKhachHang, tenKhachHang, diaChi;
    private SanPham sp;
    private int soLuong;
    private Date ngayMua;

    public KhachHang(int i, String tenKhachHang, String diaChi, SanPham sp, int soLuong, String ngayMua) throws ParseException {
        this.maKhachHang = String.format("KH%02d", i);
        this.tenKhachHang = tenKhachHang;
        this.diaChi = diaChi;
        this.sp = sp;
        this.soLuong = soLuong;
        this.ngayMua = new SimpleDateFormat("dd/MM/yyyy").parse(ngayMua);
    }

    public String getMaKhachHang() {
        return maKhachHang;
    }

    public String getTenKhachHang() {
        return tenKhachHang;
    }

    public String getDiaChi() {
        return diaChi;
    }

    public SanPham getSp() {
        return sp;
    }

    public int getSoLuong() {
        return soLuong;
    }

    public Date getNgayMua() {
        return ngayMua;
    }
    public int tongTien(){
        return this.soLuong * this.sp.getGiaBan();
    }
    public Date hanBaoHanh(){
        LocalDate d = LocalDate.from(this.ngayMua.toInstant().atZone(ZoneId.systemDefault())).plusMonths(this.sp.getHanBaoHanh());
        return Date.from(d.atStartOfDay(ZoneId.systemDefault()).toInstant());
    }
    public String toString(){
        return this.maKhachHang + " " + this.tenKhachHang + " " + this.diaChi + " " + this.sp.getMaSanPham() + " "
                + this.tongTien() + " " + (new SimpleDateFormat("dd/MM/yyyy")).format(hanBaoHanh());
    }
}
