/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package J02027_KhoangCachNhoHonK;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author admin
 */
public class J02027 {
    private static int firstLessPos(int[] a, int x) {
        int res = -1, l = 0, r = a.length - 1;
        while(l <= r){
            int m  = (l + r)/2;
            if(a[m] < x){
                res = m;
                l = m + 1;
            }
            else r = m - 1;
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
            // aj - ai < k
            // aj < k + ai => lower_bound
            long cnt = 0;
            for(int i = 0; i < n; i++){
                int pos = firstLessPos(a, k + a[i]);
                
                if(pos != -1)
                    cnt += 1l*(pos - i);
            }
            System.out.println(cnt);
        }
    }
}
