/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package J07060_SapXepLichThi;

import java.io.File;
import java.io.FileNotFoundException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Date;
import java.util.HashMap;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author :Tran Quang Huy
 */
public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("MONTHI.in"));
        HashMap <String, MonThi> mapMonThi = new HashMap<>();
        int n = Integer.parseInt(sc.nextLine());
        for(int i = 0; i < n; i++){
            String maMon = sc.nextLine();
            String tenMon = sc.nextLine();
            String hinhThuc = sc.nextLine();
            mapMonThi.put(maMon, new MonThi(maMon, tenMon, hinhThuc));
        }
        sc.close();
        sc = new Scanner(new File("CATHI.in"));
        int m = Integer.parseInt(sc.nextLine());
        HashMap <String, CaThi> mapCaThi = new HashMap<>();
        for(int i = 1; i <= m; i++){
            String maCa = String.format("C%03d", i);
            String ngayThi = sc.nextLine();
            String gioThi = sc.nextLine();
            String phongThi = sc.nextLine();
            mapCaThi.put(maCa, new CaThi(i, ngayThi, gioThi, phongThi));
        }
        sc.close();
        sc = new Scanner(new File("LICHTHI.in"));
        ArrayList <LichThi> listLich = new ArrayList<>();
        int p = sc.nextInt();
        for(int i = 0; i < p; i++){
            String maCa = sc.next(), maMon = sc.next(), maNhom = sc.next();
            int soSv = sc.nextInt();
            listLich.add(new LichThi(mapCaThi.get(maCa), mapMonThi.get(maMon), maNhom, soSv));
        }
        Collections.sort(listLich, new Comparator<LichThi>(){
            @Override
            public int compare(LichThi o1, LichThi o2) {
                try {
                    Date d1 = new SimpleDateFormat("dd/MM/yyyy HH:mm").parse(o1.getCaThi().getNgayThi() + " " + o1.getCaThi().getGioThi());
                    Date d2 = new SimpleDateFormat("dd/MM/yyyy HH:mm").parse(o2.getCaThi().getNgayThi() + " " + o2.getCaThi().getGioThi());
                    if(d1.equals(d2)){
                        return o1.getCaThi().getMaCa().compareTo(o2.getCaThi().getMaCa());
                    }
                    return d1.compareTo(d2);
                } catch (ParseException ex) {
                    Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
                }
                return 0;
            }
        });
        for(LichThi x : listLich){
            System.out.println(x);
        }
    }
}
