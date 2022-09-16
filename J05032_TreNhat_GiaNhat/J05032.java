/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package J05032_TreNhat_GiaNhat;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

/**
 *
 * @author admin
 */
class pair{
    private String fi, se;

    public pair(String fi, String se) {
        this.fi = fi;
        this.se = se;
    }

    public String getFi() {
        return fi;
    }

    public String getSe() {
        return se;
    }
    public String cmp(){
        String[] arr = this.se.split("/");
        return arr[2] + arr[1] + arr[0];
    }
}
public class J05032 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList <pair> list = new ArrayList<>();
        for(int i = 0; i < n; i++){
            String fi = sc.next(), se = sc.next();
            list.add(new pair(fi, se));
        }
        Collections.sort(list, new Comparator<pair>(){
            @Override
            public int compare(pair o1, pair o2) {
                return o2.cmp().compareTo(o1.cmp());
            }
        });
        System.out.println(list.get(0).getFi());
        System.out.println(list.get(n - 1).getFi());
    }
}
