/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package J06003_QuanLyBaiTapNhom1;

import java.util.ArrayList;

/**
 *
 * @author :Tran Quang Huy
 */
public class BaiTap {
    private ArrayList <SinhVien> list;
    private String ten;

    public BaiTap(String ten) {
        list = new ArrayList<>();
        this.ten = ten;
    }

    public ArrayList<SinhVien> getList() {
        return list;
    }

    public String getTen() {
        return ten;
    }
}
