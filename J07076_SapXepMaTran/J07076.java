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
class Matrix{
    private int n, m;
    private int[][] a;

    public Matrix(int n, int m, int[][] a) {
        this.n = n;
        this.m = m;
        this.a = a;
    }
    public void sortIndexCol(int col){
        for(int i = 0; i < this.n - 1; i++){
            for(int j = i + 1; j < this.n; j++){
                if(this.a[i][col] > this.a[j][col]){
                    int tmp = this.a[i][col];
                    this.a[i][col] = this.a[j][col];
                    this.a[j][col] = tmp;
                }
            }
        }
    }
    @Override
    public String toString(){
        String ans = "";
        for(int i = 0; i < this.n; i++){
            for(int j = 0; j < this.m; j++){
                ans += this.a[i][j] + " ";
            }
            ans += '\n';
        }
        return ans;
    }
}
public class J07076 {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("MATRIX.in"));
        int t = sc.nextInt();
        while(t-- > 0){
            int n = sc.nextInt(), m = sc.nextInt(), col = sc.nextInt();
            int[][] a = new int[n][m];
            for(int i = 0; i < n; i++){
                for(int j = 0; j < m; j++){
                    a[i][j] = sc.nextInt();
                }
            }
            Matrix mat = new Matrix(n, m, a);
            mat.sortIndexCol(col-1);
            System.out.print(mat);
        }
    }
}
