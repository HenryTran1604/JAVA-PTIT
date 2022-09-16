/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package J05058_SapXepKetQuaTuyenSinh;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

/**
 *
 * @author admin
 */
class ThiSinh{
    private String maThiSinh, hoTen;
    private double diemToan, diemLy, diemHoa;

    public ThiSinh(String maThiSinh, String hoTen, double diemToan, double diemLy, double diemHoa) {
        this.maThiSinh = maThiSinh;
        this.hoTen = hoTen;
        this.diemToan = diemToan;
        this.diemLy = diemLy;
        this.diemHoa = diemHoa;
    }

    public String getMaThiSinh() {
        return maThiSinh;
    }
    public double diemUuTien(){
        if("KV1".equals(this.maThiSinh.substring(0, 3)))
            return 0.5;
        if("KV2".equals(this.maThiSinh.substring(0, 3)))
             return 1.0;
        return 2.5;
    }
    public double diemXetTuyen(){
        return (2*this.diemToan + this.diemLy + this.diemHoa) + this.diemUuTien();
    }
    public String trangThai(){
        if(this.diemXetTuyen() >= 24)
            return "TRUNG TUYEN";
        else
            return "TRUOT";
    }
    public void chuanHoa(){
        StringBuilder sb = new StringBuilder();
        String s = this.hoTen;
        s = s.trim();
        String[] arr = s.split("\\s+");
        for(int i = 0; i < arr.length; i++){
            sb.append(Character.toUpperCase(arr[i].charAt(0)));
            for(int j = 1; j < arr[i].length(); j++){
                sb.append(Character.toLowerCase(arr[i].charAt(j)));
            }
            sb.append(" ");
        }
        sb.deleteCharAt(sb.length() - 1);
        this.hoTen = sb.toString();
    }
    @Override
    public String toString(){
        String diemUuTien = this.diemUuTien()+ "";
        if (this.diemUuTien() == (int) this.diemUuTien())
            diemUuTien = String.format("%.0f", this.diemUuTien());
        String diemXetTuyen = "";
        if(this.diemXetTuyen() == (int) this.diemXetTuyen())
            diemXetTuyen = String.format("%.0f", this.diemXetTuyen());
        else
            diemXetTuyen = String.format("%.1f", this.diemXetTuyen());
        return this.maThiSinh + " " + this.hoTen + " " + diemUuTien + " " + diemXetTuyen + " " + this.trangThai();
    }
}
public class J05058 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        double diemChuan = 0;
        ArrayList <ThiSinh> list = new ArrayList<>();
        for(int i = 0; i < n; i++){
            String maThiSinh = sc.next();
            sc.nextLine();
            String hoTen = sc.nextLine();
            double diemToan = sc.nextDouble();
            double diemLy = sc.nextDouble();
            double diemHoa = sc.nextDouble();
            ThiSinh ts = new ThiSinh(maThiSinh, hoTen, diemToan, diemLy, diemHoa);
            ts.chuanHoa();
            list.add(ts);
        }
        Collections.sort(list, new Comparator<ThiSinh>(){
            @Override
            public int compare(ThiSinh o1, ThiSinh o2) {
                if(o1.diemXetTuyen() == o2.diemXetTuyen())
                    return o1.getMaThiSinh().compareTo(o2.getMaThiSinh());
                if(o1.diemXetTuyen() < o2.diemXetTuyen())
                    return 1;
                return -1;
            }
            
        });
        for(ThiSinh x : list){
            System.out.println(x);
        }
    }
}

