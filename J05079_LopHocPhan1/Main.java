/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package J05079_LopHocPhan1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 *
 * @author :Tran Quang Huy <HenryTran at github.com/Henrytran1604>
 */
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Map <String, String> map = new HashMap <>();
        ArrayList <LopHocPhan> list = new ArrayList<>();
        while(n-- > 0){
            String maMonHoc = sc.next();
            sc.nextLine();
            String tenMonHoc = sc.nextLine();
            String nhomLop = sc.nextLine();
            String tenGiangVien = sc.nextLine();
            map.put(maMonHoc, tenMonHoc);
            list.add(new LopHocPhan(maMonHoc, tenMonHoc, nhomLop, tenGiangVien));
        }
        int m = sc.nextInt();
        while(m-- > 0){
            String maLop = sc.next();
            String tenLop = map.get(maLop);
            ArrayList <LopHocPhan> res = new ArrayList<>();
            for(LopHocPhan x : list){
                if(x.getMaMonHoc().equals(maLop)){
                    res.add(x);
                }
            }
            Collections.sort(res, new Comparator<LopHocPhan>(){
                @Override
                public int compare(LopHocPhan o1, LopHocPhan o2) {
                    return Integer.parseInt(o1.getNhomLop()) - Integer.parseInt(o2.getNhomLop());
                }
            });
            System.out.println("Danh sach nhom lop mon " + tenLop + ":");
            for(LopHocPhan x : res){
                System.out.println(x);
            }
        }
    }
}
