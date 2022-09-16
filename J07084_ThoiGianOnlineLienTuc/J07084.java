/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package J07084_ThoiGianOnlineLienTuc;

import java.io.File;
import java.io.FileNotFoundException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Date;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

/**
 *
 * @author admin
 */
class SinhVien{
    private String hoTen;
    private Date batDau, ketThuc;
    
    public SinhVien(String hoTen, String batDau, String ketThuc) throws ParseException{
        this.hoTen = hoTen;
        SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy hh:mm:ss");
        this.batDau = format.parse(batDau);
        this.ketThuc = format.parse(ketThuc);
    }

    public String getHoTen() {
        return hoTen;
    }
    
    public long thoiGianOnl(){
        long tmp = this.ketThuc.getTime() - this.batDau.getTime();
        return TimeUnit.MINUTES.convert(tmp, TimeUnit.MILLISECONDS);
    }
    
    @Override
    public String toString(){
        return this.hoTen + " " + this.thoiGianOnl();
    }
}
public class J07084 {
    public static void main(String[] args) throws FileNotFoundException, ParseException {
        Scanner sc = new Scanner(new File("ONLINE.in"));
        int n = Integer.parseInt(sc.nextLine());
        ArrayList <SinhVien> list = new ArrayList<>();
        while(n-- > 0){
            list.add(new SinhVien(sc.nextLine(), sc.nextLine(), sc.nextLine()));
        }
        Collections.sort(list, new Comparator<SinhVien>(){
            @Override
            public int compare(SinhVien o1, SinhVien o2) {
                if(o1.thoiGianOnl() > o2.thoiGianOnl())
                    return -1;
                if(o1.thoiGianOnl() == o2.thoiGianOnl()){
                    return o1.getHoTen().compareTo(o2.getHoTen());
                }
                return 1;
            }
        });
        for(SinhVien x : list){
            System.out.println(x);
        }
    }
}
