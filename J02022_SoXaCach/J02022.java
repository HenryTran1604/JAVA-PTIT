/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package J02022_SoXaCach;

import java.util.Scanner;

/**
 *
 * @author admin
 */
public class J02022 {
    private static int n;
    private static int[] a = new int[20], mark = new int[20];
    private static void check() {
        for(int i = 2; i <= n; i++){
            if(Math.abs(a[i] - a[i - 1]) == 1)
                return;
        }
        for(int i = 1; i <= n; i++){
            System.out.print(a[i]);
        }
        System.out.println("");
    }
    
    private static void Try(int i){
        for(int j = 1; j <= n; j++){
            if(mark[j] == 0){
                mark[j] = 1;
                a[i] = j;
                if(i == n){
                    check();
                }
                else Try(i + 1);
                mark[j] = 0;
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            n = sc.nextInt();
            Try(1);
        }
    }
}
