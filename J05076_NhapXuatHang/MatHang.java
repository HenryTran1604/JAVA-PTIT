/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package J05076_NhapXuatHang;

/**
 *
 * @author :Tran Quang Huy <HenryTran at github.com/Henrytran1604>
 */
public class MatHang {
    private String ma, ten, xepLoai;
    private int tongGiaTriNhap, tongGiaTriXuat;
    public MatHang(String ma, String ten, String xepLoai) {
        this.ma = ma;
        this.ten = ten;
        this.xepLoai = xepLoai;
    }

    public String getMa() {
        return ma;
    }
    public void setTongGiaTriNhap(int soLuongNhap, int donGia){
        this.tongGiaTriNhap = soLuongNhap * donGia;
    }
    public void setTongGiaTriXuat(int soLuongXuat, int donGia){
        int tmp = soLuongXuat * donGia;
        if(this.xepLoai.equals("A"))
            tmp =  (int)(tmp * 1.08);
        else if(this.xepLoai.equals("B"))
            tmp = (int)(tmp * 1.05);
        else 
            tmp = (int) (tmp * 1.02);
        this.tongGiaTriXuat = tmp;
    }
    @Override
    public String toString(){
        return this.ma + " " + this.ten + " " + this.tongGiaTriNhap + " " + this.tongGiaTriXuat;
    }
}
