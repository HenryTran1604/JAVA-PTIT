/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package J02026_DayConCoKPhanTuTangDan;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author admin
 */
public class J02026 {
    private static int n, k;
    private static int[] a = new int[16], c = new int[16];
    private static void print() {
        for(int i = 1; i <= k; i++){
            System.out.print(a[c[i]] + " ");
        }
        System.out.println("");
    }
    
    private static void Try(int i) {
        for(int j = c[i - 1] + 1; j <= n - k + i; j++){
            c[i] = j;
            if(i == k)
                print();
            else
                Try(i + 1);
        }
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            n = sc.nextInt(); k = sc.nextInt();
            for(int i = 1; i <= n; i++)
                a[i] = sc.nextInt();
            Arrays.sort(a, 1, n + 1);
            Try(1);
        }
    }
}
