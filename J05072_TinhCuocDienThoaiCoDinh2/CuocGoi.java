/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package J05072_TinhCuocDienThoaiCoDinh2;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author :Tran Quang Huy
 */
public class CuocGoi {
    private String sdt;
    private Date batDau, ketThuc;
    private Tinh tinh;
    
    public CuocGoi() {
    }

    public CuocGoi(String sdt, String batDau, String ketThuc, Tinh tinh) throws ParseException {
        this.sdt = sdt;
        SimpleDateFormat f = new SimpleDateFormat("HH:mm");
        this.batDau = f.parse(batDau);
        this.ketThuc = f.parse(ketThuc);
        this.tinh = tinh;
    }
    public int soPhut(){
        SimpleDateFormat f = new SimpleDateFormat("HH:mm");
        int m = (int)(this.ketThuc.getTime() - this.batDau.getTime())/(1000 * 60);
        if(this.sdt.charAt(0) != '0'){
            return (int) Math.ceil(m / 3.0);
        }
        return m;
    }
    public String noiGoi(){
        if(this.sdt.charAt(0) != '0'){
            return "Noi mang";
        }
        else{
            return this.tinh.getTen();
        }
    }
    public int tongTien(){
        if(this.sdt.charAt(0) != '0'){
            return this.soPhut() * 800;
        }
        return this.soPhut() * this.tinh.getGiaCuoc();
    }
    @Override
    public String toString(){
        return this.sdt + " " + this.noiGoi() + " " + this.soPhut() + " " + this.tongTien();
    }
}
