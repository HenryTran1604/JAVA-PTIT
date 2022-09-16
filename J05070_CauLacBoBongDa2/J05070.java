/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package J05070_CauLacBoBongDa2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

/**
 *
 * @author admin
 */
class CLB{
    protected String ma, ten;
    protected int giaVe;

    public CLB() {
    }
    
    public CLB(String ma, String ten, int giaVe) {
        this.ma = ma;
        this.ten = ten;
        this.giaVe = giaVe;
    }
    
    @Override
    public String toString(){
        return this.ma + " " + this.ten;
    }
}
class TranDau extends CLB{
    private String maTran;
    private int soNguoiXem;

    public TranDau(String maTran, int soNguoiXem, String ma, String ten, int giaVe) {
        super(ma, ten, giaVe);
        this.maTran = maTran;
        this.soNguoiXem = soNguoiXem;
    }
    public int doanhThu(){
        return this.soNguoiXem * this.giaVe;
    }
    public String toString(){
        return this.maTran + " " + this.ten + " " + this.doanhThu();
    }
    
}
public class J05070 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        ArrayList <CLB> list1 = new ArrayList<>();
        int n = sc.nextInt();
        while(n-- > 0){
            String ma = sc.next();
            sc.nextLine();
            String ten = sc.nextLine();
            int giaVe = sc.nextInt();
            list1.add(new CLB(ma, ten, giaVe));
        }
        int m = sc.nextInt();
        ArrayList <TranDau> list2 = new ArrayList<>();
        while(m-- > 0){
            String maTran = sc.next();
            int soNguoiXem = sc.nextInt();
            String s = maTran.substring(1, 3);
            CLB a = new CLB();
            for(CLB x : list1){
                if(x.ma.equals(s)){
                    a = x;
                    break;
                }
            }
            list2.add(new TranDau(maTran, soNguoiXem, a.ma, a.ten, a.giaVe));
        }
        Collections.sort(list2, new Comparator<TranDau>(){
            @Override
            public int compare(TranDau o1, TranDau o2) {
                if(o1.doanhThu() == o2.doanhThu()){
                    return o1.ma.compareTo(o2.ma);
                }
                return o2.doanhThu() - o1.doanhThu();
            }
        });
        for(TranDau x : list2){
            System.out.println(x);
        }
    }
}
