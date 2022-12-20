/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package J06002_SapXepHoaDonQuanAo;


/**
 *
 * @author :Tran Quang Huy
 */
public class HoaDon {
    private String maHoaDon;
    private SanPham sp;
    private int soLuong;

    public HoaDon() {
    }

    public HoaDon(String ma, int i, SanPham sp, int soLuong) {
        this.maHoaDon = ma + String.format("-%03d", i);
        this.sp = sp;
        this.soLuong = soLuong;
    }
    public int tongTien(){
        int loai = this.maHoaDon.charAt(2) - '0';
        if(loai == 1){
            return this.soLuong * this.sp.getGiaLoai1();
        }
        return this.soLuong * this.sp.getGiaLoai2();
    }
    public int giamGia(){
        if(this.soLuong >= 150)
            return (int) (this.tongTien() * 0.5);
        if(this.soLuong >= 100)
            return (int) (this.tongTien() * 0.3);
        if(this.soLuong >= 50)
            return (int) (this.tongTien() * 0.15);
        return 0;
    }
    public int thanhTien(){
        return this.tongTien() - this.giamGia();
    }
    public String toString(){
        return this.maHoaDon + " " + this.sp.getTenSp() + " " + this.giamGia() + " " + this.thanhTien();
    }
}
