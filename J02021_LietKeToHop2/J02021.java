/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package J02021_LietKeToHop2;

import java.util.Scanner;

/**
 *
 * @author admin
 */
public class J02021 {
    private static int n, k, cnt = 0;
    private static int[] c = new int[20];
    private static void Try(int i){
        for(int j = c[i - 1] + 1; j <= n - k + i; j++){
            c[i] = j;
            if(i == k){
                for(int p = 1; p <= k; p++){
                    System.out.print(c[p]);
                }
                cnt++;
                System.out.print(" ");
            }
            else Try(i + 1);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        k = sc.nextInt();
        Try(1);
        System.out.println("\nTong cong co " + cnt + " to hop");
    }
}