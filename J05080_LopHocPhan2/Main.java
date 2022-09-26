/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package J05080_LopHocPhan2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

/**
 *
 * @author :Tran Quang Huy <HenryTran at github.com/Henrytran1604>
 */
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList <LopHocPhan> list = new ArrayList<>();
        while(n-- > 0){
            String maMonHoc = sc.next();
            sc.nextLine();
            String tenMonHoc = sc.nextLine();
            String nhomLop = sc.nextLine();
            String tenGiangVien = sc.nextLine();
            list.add(new LopHocPhan(maMonHoc, tenMonHoc, nhomLop, tenGiangVien));
        }
        int m = sc.nextInt();
        sc.nextLine();
        while(m-- > 0){
            String tenGiangVien = sc.nextLine();
            ArrayList <LopHocPhan> res = new ArrayList<>();
            for(LopHocPhan x : list){
                if(x.getTenGiangVien().equals(tenGiangVien)){
                    res.add(x);
                }
            }
            Collections.sort(res, new Comparator<LopHocPhan>(){
                @Override
                public int compare(LopHocPhan o1, LopHocPhan o2) {
                    if(o1.getMaMonHoc().equals(o2.getMaMonHoc()))
                        return Integer.parseInt(o1.getNhomLop()) - Integer.parseInt(o2.getNhomLop());
                    return o1.getMaMonHoc().compareTo(o2.getMaMonHoc());
                }
            });
            System.out.println("Danh sach cho giang vien " + tenGiangVien + ":");
            for(LopHocPhan x : res){
                System.out.println(x);
            }
        }
    }
}

