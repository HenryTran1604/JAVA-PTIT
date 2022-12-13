/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package J05016_HoaDonKhachSan;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

/**
 *
 * @author :Tran Quang Huy
 */
public class KhachHang {
    private String maKH, tenKH, soPhong;
    private Date nhanPhong, traPhong;
    private int phatSinh;
    public KhachHang(int id, String tenKH, String soPhong, String nhanPhong, String traPhong, int phatSinh) throws ParseException{
        this.maKH = "KH" + String.format("%02d", id);
        this.tenKH = tenKH;
        this.soPhong = soPhong;
        SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy");
        this.nhanPhong = format.parse(nhanPhong);
        this.traPhong = format.parse(traPhong);
        this.phatSinh = phatSinh;
    }
    public int soNgayO(){
        long diff = this.traPhong.getTime() - this.nhanPhong.getTime();
        return (int) TimeUnit.MILLISECONDS.toDays(diff) + 1;
    }
    public int thanhTien(){
        int donGia = 25;
        char tang = this.soPhong.charAt(0);
        if(tang == '2') donGia = 34;
        else if(tang == '3') donGia = 50;
        else if (tang == '4') donGia = 80;
        return this.soNgayO() * donGia + this.phatSinh;
    }
    @Override
    public String toString(){
        return this.maKH + ' ' + this.tenKH + ' ' + this.soPhong + ' ' + this.soNgayO()
                + ' ' + this.thanhTien();
    }
}
