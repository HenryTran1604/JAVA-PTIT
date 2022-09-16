/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package J02009_XepHang;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

/**
 *
 * @author admin
 */
public class J02009 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = 1;
        while(t-- > 0){
            int n = sc.nextInt();
            Integer[][] a = new Integer[n][2];
            for(int i = 0; i < n; i++){
                a[i][0] = sc.nextInt();
                a[i][1] = sc.nextInt();
            }
            Arrays.sort(a, new Comparator<Integer[]>(){
                @Override
                public int compare(Integer[] o1, Integer[] o2) {
                    return o1[0] - o2[0];
                }
            });
            int total = a[0][0] + a[0][1];
            for(int i = 1; i < n; i++){
                if(a[i][0] > total){
                    total = a[i][0] + a[i][1];
                }
                else{
                    total += a[i][1];
                }
            }
            System.out.println(total);
        }
    }
}
