/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package J02016_BoBaSoPytago;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author admin
 */
public class J02016 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            int n = sc.nextInt();
            long[] a = new long[n];
            for(int i = 0; i < n; i++){
                a[i] = sc.nextLong();
                a[i] *= a[i];
            }
            Arrays.sort(a);
            boolean check = false;
            outer : for(int i = 2; i < n; i++){
                int l = 0, r = i - 1;
                while(l < r){
                    if(a[l] + a[r] == a[i]){
                        check = true;
                        break outer;
                    }
                    else if(a[l] + a[r] > a[i])
                        r--;
                    else l++;
                }
            }
            if(check)
                System.out.println("YES");
            else
                System.out.println("NO");
        }
        
    }
}
