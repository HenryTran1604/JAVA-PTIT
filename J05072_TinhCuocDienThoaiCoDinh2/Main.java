/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package J05072_TinhCuocDienThoaiCoDinh2;

import java.text.ParseException;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

/**
 *
 * @author :Tran Quang Huy
 */
public class Main {
    public static void main(String[] args) throws ParseException {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        ArrayList <Tinh> listTinh = new ArrayList<>();
        for(int i = 0; i < n; i++){
            listTinh.add(new Tinh(sc.nextLine(),
                    sc.nextLine(), Integer.parseInt(sc.nextLine())));
        }
        int m = Integer.parseInt(sc.nextLine());
        ArrayList <CuocGoi> listCg = new ArrayList<>();
        for(int i = 0; i < m; i++){
            String sdt = sc.next();
            Tinh t = null;
            if(sdt.startsWith("0")){
                String maVung = sdt.substring(1,3);
                for(Tinh x : listTinh){
                    if(x.getMaVung().equals(maVung)){
                        t = x;
                        break;
                    }
                }
            }
            String batDau = sc.next();
            String ketThuc = sc.next();
            listCg.add(new CuocGoi(sdt, batDau, ketThuc, t));
        }
        listCg.sort(Comparator.comparing(CuocGoi::tongTien, Comparator.reverseOrder()));
        for(CuocGoi x : listCg){
            System.out.println(x);
        }
    }
}
