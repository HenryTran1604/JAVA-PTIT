/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package J05059_XacDinhDanhSachTrungTuyen;

import java.util.Comparator;

/**
 *
 * @author :Tran Quang Huy
 */
public class SortByTongDiem implements Comparator<ThiSinh>{
    @Override
    public int compare(ThiSinh o1, ThiSinh o2){
        if(o1.tongDiem() > o2.tongDiem()){
            return -1;
        }
        if(o1.tongDiem() == o2.tongDiem()){
            return o1.getMaThiSinh().compareTo(o2.getMaThiSinh());
        }
        return 1;
    }
}
