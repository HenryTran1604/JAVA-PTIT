/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package J05055_XepHangVanDongVien1;

import java.sql.Time;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Date;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author admin
 */
class VanDongVien{
    private String ma, hoTen, ngaySinh;
    private Date xuatPhat, denDich;
    private int xepHang;
    private static int id = 1;
    public VanDongVien(String hoTen, String ngaySinh, String xuatPhat, String denDich) throws ParseException{
        this.ma = "VDV" + String.format("%02d", id++);
        this.hoTen = hoTen;
        this.ngaySinh = ngaySinh;
        SimpleDateFormat format = new SimpleDateFormat("HH:mm:ss");
        this.xuatPhat = format.parse(xuatPhat);
        this.denDich = format.parse(denDich);
    }
    public Date thanhTichThucTe(){
        long secs = TimeUnit.MILLISECONDS.toSeconds(this.denDich.getTime() - this.xuatPhat.getTime());
        return Time.valueOf(String.format("%02d:%02d:%02d", secs/3600, (secs%3600)/60, secs%60));
    }
    public Date UuTien() throws ParseException{
        long ext = 0;
        int tuoi = 2021 - Integer.parseInt(this.ngaySinh.substring(6));
        if(tuoi < 18)
            ext = 0;
        else if(tuoi < 25)
            ext = 1;
        else if(tuoi < 32)
            ext = 2;
        else
            ext = 3;
        String tmp = "00:00:0" + ext;
        SimpleDateFormat format = new SimpleDateFormat("HH:mm:ss");
        return format.parse(tmp);
    }
    public Date ThanhTichXepHang() throws ParseException{
        long secs = this.UuTien().getTime();
        System.out.println(secs);
        return Time.valueOf(String.format("%02d:%02d:%02d", secs/3600, (secs%3600)/60, secs%60));
    }
    public void setXepHang(int xh){
        this.xepHang = xh;
    }
    @Override
    public String toString(){
        try {
            return this.ma + " " + this.hoTen + " " + this.thanhTichThucTe() + " " +
                    this.UuTien() + " " + this.ThanhTichXepHang() + " " + this.xepHang;
        } catch (ParseException ex) {
            Logger.getLogger(VanDongVien.class.getName()).log(Level.SEVERE, null, ex);
        }
        return "";
    }
}
public class J05055 {
    public static void main(String[] args) throws ParseException {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        ArrayList <VanDongVien> list = new ArrayList<>();
        while(n-- > 0){
            String hoTen = sc.nextLine();
            String ngaySinh = sc.nextLine();
            String xuatPhat = sc.nextLine();
            String denDich = sc.nextLine();
            list.add(new VanDongVien(hoTen, ngaySinh, xuatPhat, denDich));
        }
        Collections.sort(list, new Comparator<VanDongVien>(){
            @Override
            public int compare(VanDongVien o1, VanDongVien o2) {
                try {
                    return o2.ThanhTichXepHang().compareTo(o1.ThanhTichXepHang());
                } catch (ParseException ex) {
                    Logger.getLogger(J05055.class.getName()).log(Level.SEVERE, null, ex);
                }
                return 0;
            }
        });
        for(VanDongVien x : list){
            System.out.println(x);
        }
    }
}
