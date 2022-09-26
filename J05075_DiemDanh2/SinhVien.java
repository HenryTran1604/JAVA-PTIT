/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package J05075_DiemDanh2;

/**
 *
 * @author :Tran Quang Huy <HenryTran at github.com/Henrytran1604>
 */
public class SinhVien {
    private String maSV, hoTen, lop;
    private int diemChuyenCan;

    public SinhVien(String maSV, String hoTen, String lop) {
        this.maSV = maSV;
        this.hoTen = hoTen;
        this.lop = lop;
    }

    public String getMaSV() {
        return maSV;
    }

    public String getLop() {
        return lop;
    }
    
    
    public void setDiemChuyenCan(String s){
        int d = 10;
        for(int i = 0; i < 10; i++){
            if(s.charAt(i) == 'v')
                d -= 2;
            else if(s.charAt(i) == 'm')
                d -= 1;
        }
        this.diemChuyenCan = d > 0 ? d : 0;
    }
    public String ghiChu(){
        if(this.diemChuyenCan == 0){
            return "KDDK";
        }
        return "";
    }
    @Override
    public String toString(){
        return this.maSV + " " + this.hoTen + " " + this.lop + " " + this.diemChuyenCan + " " + this.ghiChu();
    }
}
