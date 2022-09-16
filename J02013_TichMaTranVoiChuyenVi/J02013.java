/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package J02013_TichMaTranVoiChuyenVi;

import java.util.Scanner;

/**
 *
 * @author admin
 */
public class J02013 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for(int p = 1; p <= t; p++){
            System.out.println("Test" + p + ":");
            int n = sc.nextInt(), m = sc.nextInt();
            int[][] a = new int[n][m];
            int[][] at = new int[m][n];
            for(int i = 0; i < n; i++){
                for(int j = 0; j < m; j++){
                    a[i][j] = sc.nextInt();
                    at[j][i] = a[i][j];
                }
            }
            int[][] ans = new int[n][n];
            for(int i = 0; i < n; i++){
                for(int j = 0; j < n; j++){
                    ans[i][j] = 0;
                    for(int k = 0; k < m; k++){
                        ans[i][j] += a[i][k] * at[k][j];
                    }
                }
            }
            for(int i = 0; i < n; i++){
                for(int j = 0; j < n; j++){
                    System.out.print(ans[i][j] + " ");
                }
                System.out.println("");
            }
        }
    }
}
