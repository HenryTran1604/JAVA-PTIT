/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package J05055_XepHangVanDongVien1;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author :Tran Quang Huy
 */
public class VanDongVien {
    private String ma, hoTen, ngaySinh;
    private Date xuatPhat, veDich;
    private int xepHang;
    public VanDongVien(int id, String hoTen, String ngaySinh, String xuatPhat, String veDich) throws ParseException {
        this.ma = String.format("VDV%02d", id);
        this.hoTen = hoTen;
        this.ngaySinh = ngaySinh;
        SimpleDateFormat format = new SimpleDateFormat("HH:mm:ss");
        this.xuatPhat = format.parse(xuatPhat);
        this.veDich = format.parse(veDich);
    }
    public long thanhTichThucTe(){
        long t = (veDich.getTime() - xuatPhat.getTime()) / 1000;
        return t;
    }
    public long UuTien(){
        String[] arr = this.ngaySinh.split("/");
        int tuoi = 2021 - Integer.parseInt(arr[2]);
        if(tuoi >= 32) return 3;
        if(tuoi >= 25) return 2;
        if(tuoi >= 18) return 1;
        return 0;
    }
    public long thanhTichXepHang(){
        return this.thanhTichThucTe() - this.UuTien();
    }
    public void setXepHang(int xepHang) {
        this.xepHang = xepHang;
    }
    public String format(long x){
        return String.format("%02d:%02d:%02d", x/3600, (x%3600)/60, (x%3600) %60);
    }
    @Override
    public String toString(){
        String res = this.ma + " " + this.hoTen + " ";
        res += format(this.thanhTichThucTe()) + " ";
        res += format(this.UuTien()) + " ";
        res += format(this.thanhTichThucTe() - this.UuTien()) + " ";
        res += this.xepHang;
        return res;
    }
}
