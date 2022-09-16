/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package J08015_CapSoCoTongBangK;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 *
 * @author admin
 */
public class J08015 {
    private static int firstPos(int[] a, int l, int r, int x) {
        int res = -1;
        while(l <= r){
            int m = (l + r)/2;
            if(a[m] == x){
                res = m;
                r = m - 1;
            }
            else if(a[m] > x) r = m - 1;
            else l = m + 1;
        }
        return res;
    }
    private static int lastPos(int[] a, int l, int r, int x) {
        int res = -1;
        while(l <= r){
            int m = (l + r)/2;
            if(a[m] == x){
                res = m;
                l = m + 1;
            }
            else if(a[m] > x) r = m - 1;
            else l = m + 1;
        }
        return res;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            int n = sc.nextInt(), k = sc.nextInt();
            int[] a = new int[n];
            for(int i = 0; i < n; i++){
                a[i] = sc.nextInt();
                
            }
            Arrays.sort(a);
            long cnt = 0;
            for(int i = 0; i < n - 1; i++){
                int pos1 = firstPos(a, i + 1, n - 1, k - a[i]);
                int pos2 = lastPos(a, i + 1, n - 1, k - a[i]);
                if(pos1 != -1){
                    cnt += 1l * (pos2 - pos1 + 1);
                }
            }
            System.out.println(cnt);
        }
    }
}
