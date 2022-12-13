/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package J05059_XacDinhDanhSachTrungTuyen;

/**
 *
 * @author :Tran Quang Huy
 */
public class ThiSinh {
    private String maThiSinh, hoTen;
    private double diemToan, diemLy, diemHoa;
    private String trangThai;
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
        String kv = this.maThiSinh.substring(0, 3);
        if(kv.equals("KV1")){
            return 0.5;
        }
        if(kv.equals("KV2")){
            return 1.0;
        }
        return 2.5;
    }
    public void setTrangThai(double d){
        if(this.tongDiem() >= d){
            this.trangThai =  "TRUNG TUYEN";
        }
        else{
            this.trangThai = "TRUOT";
        }
    }
    public double tongDiem(){
        return 2 * this.diemToan + this.diemLy + this.diemHoa + this.diemUuTien();
    }
    public String formatNumber(double d){
        if((int) d == d){
            return "" +  (int) d;
        }
        return String.format("%.1f", d);
    }
    @Override
    public String toString(){
        String res = this.maThiSinh + " " + this.hoTen + " " + formatNumber(this.diemUuTien())
                 + " " + formatNumber(this.tongDiem()) + " " + this.trangThai;
        return res;
    }
}
