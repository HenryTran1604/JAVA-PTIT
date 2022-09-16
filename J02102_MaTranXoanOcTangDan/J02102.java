/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package J02102_MaTranXoanOcTangDan;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author admin
 */
public class J02102 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n*n];
        for(int i = 0; i < n*n; i++){
            a[i] = sc.nextInt();
        }
        Arrays.sort(a);
        int[][] f = new int[n][n];
        int id = 0;
        int h1 = 0, h2 = n - 1, c1 = 0, c2 = n - 1;
        while(id < n*n){
            for(int i = c1; i <= c2; i++) f[h1][i] = a[id++];
            h1++;
            for(int i = h1; i <= h2; i++) f[i][c2] = a[id++];
            c2--;
            for(int i = c2; i >= c1; i--) f[h2][i] = a[id++];
            h2--;
            for(int i = h2; i >= h1; i--) f[i][c1] = a[id++];
            c1++;
        }
        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){
                System.out.print(f[i][j] + " ");
            }
            System.out.println("");
        }
    }
}
