/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package J07025_DanhSachKhachHangTrongFile;

import java.util.Comparator;

/**
 *
 * @author :Tran Quang Huy
 */
public class SortByAge implements Comparator<KhachHang>{
    public int compare(KhachHang o1, KhachHang o2){
        String[] a1 = o1.getNgaySinh().split("/");
        String[] a2 = o2.getNgaySinh().split("/");
        String cmp1 = a1[2] + a1[1] + a1[0];
        String cmp2 = a2[2] + a2[1] + a2[0];
        return cmp1.compareTo(cmp2);
    }
}
