/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package J05009_TimThuKhoaCuaKiThi;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author admin
 */
class ThiSinh{
    private String maThiSinh, hoTen, ngaySinh;
    private float d1, d2, d3;
    private static int id = 1;
    public ThiSinh(String hoTen, String ngaySinh, float d1, float d2, float d3) {
        this.maThiSinh = "" + id++;
        this.ngaySinh = ngaySinh;
        this.hoTen = hoTen;
        this.d1 = d1;
        this.d2 = d2;
        this.d3 = d3;
    }
    public float tongDiem(){
        return this.d1 + this.d2 + this.d3;
    }
    
    @Override
    public String toString(){
        return this.maThiSinh + " " + this.hoTen + " " + this.ngaySinh + " " + String.format("%.1f", this.tongDiem());
    }
}
public class J05009 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList <ThiSinh> list = new ArrayList<>();
        float diemCaoNhat = 0;
        while(n-- > 0){
            sc.nextLine();
            ThiSinh ts = new ThiSinh(sc.nextLine(), sc.nextLine(), sc.nextFloat(), sc.nextFloat(), sc.nextFloat());
            diemCaoNhat = Math.max(diemCaoNhat, ts.tongDiem());
            list.add(ts);
        }
        for(ThiSinh x : list){
            if(diemCaoNhat == x.tongDiem()){
                System.out.println(x);
            }
        }
    }
}
