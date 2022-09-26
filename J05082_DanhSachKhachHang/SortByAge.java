/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package J05082_DanhSachKhachHang;

import java.util.Comparator;

/**
 *
 * @author :Tran Quang Huy <HenryTran at github.com/Henrytran1604>
 */
public class SortByAge implements Comparator<KhachHang>{
    @Override
    public int compare(KhachHang a, KhachHang b){
        String[] arr1 = a.getNgaySinh().split("/");
        String[] arr2 = b.getNgaySinh().split("/");
        String cm1 = arr1[2] + arr1[1] + arr1[0];
        String cm2 = arr2[2] + arr2[1] + arr2[0];
        return cm1.compareTo(cm2);
    }
}
