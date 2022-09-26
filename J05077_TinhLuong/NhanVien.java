/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package J05077_TinhLuong;

/**
 *
 * @author :Tran Quang Huy <HenryTran at github.com/Henrytran1604>
 */
public class NhanVien {
    private String ma, ten;
    private int luongCoBan, soNgayCong;
    private String phongBan;

    public NhanVien(String ma, String ten, int luongCoBan, int soNgayCong) {
        this.ma = ma;
        this.ten = ten;
        this.luongCoBan = luongCoBan;
        this.soNgayCong = soNgayCong;
    }
    public void SetPhongBan(String phongBan){
        this.phongBan = phongBan;
    }
    public int luongThang(){
        char loai = this.ma.charAt(0);
        int kn = Integer.parseInt(this.ma.substring(1, 3));
        int tong = this.luongCoBan * this.soNgayCong;
        if(loai == 'A'){
            if(kn <= 3)
                tong *= 10;
            else if(kn <= 8)
                tong *= 12;
            else if(kn <= 15)
                tong *= 14;
            else
                tong *= 20;
        }
        else if(loai == 'B'){
            if(kn <= 3)
                tong *= 10;
            else if(kn <= 8)
                tong *= 11;
            else if(kn <= 15)
                tong *= 13;
            else
                tong *= 16;
        }
        else if(loai == 'C'){
            if(kn <= 3)
                tong *= 9;
            else if(kn <= 8)
                tong *= 10;
            else if(kn <= 15)
                tong *= 12;
            else
                tong *= 14;
        }
        else{
            if(kn <= 3)
                tong *= 8;
            else if(kn <= 8)
                tong *= 9;
            else if(kn <= 15)
                tong *= 11;
            else
                tong *= 13;
        }
        return tong*1000;
    }
    @Override
    public String toString(){
        return this.ma + " " + this.ten + " " + this.phongBan + " " + this.luongThang();
    }
}
