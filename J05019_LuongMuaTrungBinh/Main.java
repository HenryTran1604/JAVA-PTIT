/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package J05019_LuongMuaTrungBinh;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author :Tran Quang Huy
 */
public class Main {
    public static void main(String[] args) throws ParseException {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        ArrayList <LuongMua> list = new ArrayList<>();
        for(int i = 1; i <= n; i++){
            String tenTram = sc.nextLine();
            SimpleDateFormat format = new SimpleDateFormat("HH:mm");
            Date s = format.parse(sc.nextLine());
            Date t = format.parse(sc.nextLine());
            double luongMua = Double.parseDouble(sc.nextLine());
            long tgian = t.getTime() - s.getTime();
            double h = (1.0 * tgian)/(1000 * 60 * 60);
            boolean isExist = false;
            for(LuongMua y : list){
                if(y.getTenTram().equals(tenTram)){
                    y.addLuongMua(luongMua);
                    y.addThoiGianMua(h);
                    isExist = true;
                    break;
                }
            }
            if(!isExist){
                list.add(new LuongMua(i, tenTram, luongMua, h));
            }
        }
        for(LuongMua x : list){
            System.out.println(x);
        }
    }
}
