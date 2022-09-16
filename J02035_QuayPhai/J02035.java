/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package J02035_QuayPhai;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author admin
 */
public class J02035 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            int n = sc.nextInt();
            long[] a = new long[n];
            int cnt = 0;
            for(int i = 0; i < n; i++){
                a[i] = sc.nextLong();
            }
            long[] b = a.clone();
            Arrays.sort(b);
            int i = 0, j = 0;
            while(i < n){
                if(a[i] == b[j]){
                    cnt++;
                    i++; j++;
                }
                else i++;
            }
            System.out.println(n - cnt);
        }
    }
}
/*
    1 1 2 3 5 5
    5 5 1 1 2 3

*/