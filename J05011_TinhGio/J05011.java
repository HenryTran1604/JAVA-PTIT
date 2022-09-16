/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package J05011_TinhGio;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author admin
 */
class GameThu{
    private String maNguoiChoi, tenNguoiChoi;
    private Date gioVao, gioRa;
    
    public GameThu(String maNguoiChoi, String tenNguoiChoi, String gioVao, String gioRa) throws ParseException{
        this.maNguoiChoi = maNguoiChoi;
        this.tenNguoiChoi = tenNguoiChoi;
        SimpleDateFormat format = new SimpleDateFormat("hh:mm");
        this.gioVao = format.parse(gioVao);
        this.gioRa = format.parse(gioRa);
    }
    public int thoiGianChoi(){
        return (int)((this.gioRa.getTime() - this.gioVao.getTime())/(1000*60));
    }
    
    @Override
    public String toString(){
        return this.maNguoiChoi + " " + this.tenNguoiChoi + " " + this.thoiGianChoi()/60 + " gio " + this.thoiGianChoi()%60 + " phut";
    }
}
public class J05011 {
    public static void main(String[] args) throws ParseException {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList <GameThu> list = new ArrayList<>();
        while(n-- > 0){
            String maNguoiChoi = sc.next();
            sc.nextLine();
            String tenNguoiChoi = sc.nextLine();
            String gioVao = sc.next();
            String gioRa = sc.next();
            list.add(new GameThu(maNguoiChoi, tenNguoiChoi, gioVao, gioRa));
        }
        Collections.sort(list, new Comparator<GameThu>(){
            @Override
            public int compare(GameThu o1, GameThu o2) {
                return o2.thoiGianChoi() - o1.thoiGianChoi();
            }
        
        });
        for(GameThu x : list){
            System.out.println(x);
        }
    }
}
