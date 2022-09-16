/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package J04013_BaiToanTuyenSinh;

import java.util.Scanner;

/**
 *
 * @author admin
 */
class ThiSinh{
    private String maThiSinh, hoTen;
    private float diemToan, diemLy, diemHoa;

    public ThiSinh(String maThiSinh, String hoTen, float diemToan, float diemLy, float diemHoa) {
        this.maThiSinh = maThiSinh;
        this.hoTen = hoTen;
        this.diemToan = diemToan;
        this.diemLy = diemLy;
        this.diemHoa = diemHoa;
    }
    public float diemUuTien(){
        String khuVuc = this.maThiSinh.substring(0, 3);
        if("KV1".equals(khuVuc)) return 0.5f;
        if("KV2".equals(khuVuc)) return 1f;
        return 2.5f;
    }
    public float tongDiem(){
        return 2*this.diemToan + this.diemLy + this.diemHoa;
    }
    public String trangThai(){
        float diemXetTuyen = this.tongDiem() + this.diemUuTien();
        if(diemXetTuyen >= 24)
            return "TRUNG TUYEN";
        return "TRUOT";
    }
    @Override
    public String toString(){
        String diemUuTien = "" + ((this.diemUuTien() == (int) this.diemUuTien()) ? (int) this.diemUuTien() : String.format("%.1f", this.diemUuTien()));
        String tongDiem = "" + ((this.tongDiem() == (int) this.tongDiem()) ? (int) this.tongDiem() : String.format("%.1f", this.tongDiem()));        
        return this.maThiSinh + " " + this.hoTen + " " + diemUuTien + " " + tongDiem + " " + this.trangThai();
    }
}
public class J04013 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ThiSinh ts = new ThiSinh(sc.nextLine(), sc.nextLine(), sc.nextFloat(), sc.nextFloat(), sc.nextFloat());
        System.out.println(ts);
    }
}
