/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package J07076_SapXepMaTran;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 *
 * @author admin
 */
public class J07076_2 {
    
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("MATRIX.in"));
        int t = sc.nextInt();
        while(t-- > 0){
            int n = sc.nextInt(), m = sc.nextInt(), col = sc.nextInt();
            col -= 1;
            int[][] a = new int[n][m];
            for(int i = 0; i < n; i++){
                for(int j = 0; j < m; j++){
                    a[i][j] = sc.nextInt();
                }
            }
            for(int i = 0; i < n - 1; i++){
                for(int j = i + 1; j < n; j++){
                    if(a[i][col] > a[j][col]){
                        int tmp = a[i][col];
                        a[i][col] = a[j][col];
                        a[j][col] = tmp;
                    }
                }
            }

            for(int i = 0; i < n; i++){
                for(int j = 0; j < m; j++){
                    System.out.print(a[i][j] + " ");
                }
                System.out.println("");
            }
        }
    }
}
