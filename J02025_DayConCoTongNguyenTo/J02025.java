/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package J02025_DayConCoTongNguyenTo;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

/**
 *
 * @author admin
 */
public class J02025 {
    private static int n;
    private static Integer[] a = new Integer[16], b = new Integer[16];
    private static boolean isPrime(int n) {
        for(int i = 2; i <= Math.sqrt(n); i++){
            if(n % i == 0)
                return false;
        }
        return n >= 2;
    }
    
    private static void check() {
        int sum = 0;
        for(int i = 1; i <= n; i++){
            sum += a[i]*b[i];
        }
        if(isPrime(sum)){
            for(int i = 1; i <= n; i++){
                if(b[i] == 1){
                    System.out.print(a[i] + " ");
                }
            }
            System.out.println("");
        }
    }
    
    private static void Try(int i) {
        for(int j = 0; j < 2; j++){
            b[i] = j;
            if(i == n)
                check();
            else
                Try(i + 1);
        }
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            n = sc.nextInt();
            for(int i = 1; i <= n; i++)
                a[i] = sc.nextInt();
            Arrays.sort(a, 1, n + 1, Comparator.reverseOrder());
            Try(1);
        }
    }
}
