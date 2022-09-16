/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package J02007_DemSoLanXuatHien;

import java.util.Scanner;

/**
 *
 * @author admin
 */
public class J02007 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for(int p = 1; p <= t; p++){
            System.out.println("Test " + p + ":");
            int n = sc.nextInt();
            int[] a = new int[n];
            int[] f = new int[100001];
            for(int i = 0; i < n; i++){
                a[i] = sc.nextInt();
                f[a[i]]++;
            }
            for(int i = 0; i < n; i++){
                if(f[a[i]] != 0){
                    System.out.println(a[i] + " xuat hien " + f[a[i]] + " lan");
                    f[a[i]] = 0;
                }
        }
        }
    }
}
