/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package J07046_DanhSachLuuTru;

import java.io.File;
import java.io.FileNotFoundException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author admin
 */
class KhachHang{
    private String maKH, hoTen, maPhong;
    private Date ngayDen, ngayDi;
    private static int id = 1;

    public KhachHang(String hoTen, String maPhong, String ngayDen, String ngayDi) throws ParseException {
        this.hoTen = hoTen;
        this.maKH = "KH" + String.format("%02d", id++);
        this.maPhong = maPhong;
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
        this.ngayDen = dateFormat.parse(ngayDen);
        this.ngayDi = dateFormat.parse(ngayDi);
    }
    
    public int ngayLuuTru(){
        return (int) ((ngayDi.getTime() - ngayDen.getTime())/(1000*60*60*24));
    }
    @Override
    public String toString(){
        return this.maKH + " " + this.hoTen + " " + this.maPhong + " " + this.ngayLuuTru();
    }
}
public class J07046 {
    public static void main(String[] args) throws FileNotFoundException, ParseException {
        Scanner sc = new Scanner(new File("KHACH.in"));
        int n = sc.nextInt();
        sc.nextLine();
        ArrayList <KhachHang> list = new ArrayList<>();
        for(int i = 0; i < n; i++){
            list.add(new KhachHang(sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextLine()));
        }
        Collections.sort(list, new Comparator<KhachHang>(){
            @Override
            public int compare(KhachHang o1, KhachHang o2) {
                return o2.ngayLuuTru() - o1.ngayLuuTru();
            }
        });
        for(KhachHang x : list){
            System.out.println(x);
        }
    }
}
