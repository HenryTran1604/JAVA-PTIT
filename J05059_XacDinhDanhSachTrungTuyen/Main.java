/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package J05059_XacDinhDanhSachTrungTuyen;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**
 *
 * @author :Tran Quang Huy
 */
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList <ThiSinh> list = new ArrayList<>();
        while(n-- > 0){
            String maThiSinh = sc.next();
            sc.nextLine();
            String hoTen = sc.nextLine();
            double diemToan = sc.nextDouble();
            double diemLy = sc.nextDouble();
            double diemHoa = sc.nextDouble();
            list.add(new ThiSinh(maThiSinh, hoTen, diemToan, diemLy, diemHoa));
        }
        int sl = sc.nextInt();
        Collections.sort(list, new SortByTongDiem());
        double diemTrungTuyen = list.get(sl-1).tongDiem();
        System.out.println(String.format("%.1f", diemTrungTuyen));
        for(ThiSinh x : list){
            x.setTrangThai(diemTrungTuyen);
            System.out.println(x);
        }
    }
}
