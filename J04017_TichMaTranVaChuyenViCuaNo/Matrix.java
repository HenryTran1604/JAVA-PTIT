/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package J04017_TichMaTranVaChuyenViCuaNo;

import java.util.Scanner;
/**
 *
 * @author :Tran Quang Huy
 */
public class Matrix {
    private int[][] a;
    public Matrix(int n, int m){
        this.a = new int[n][m];
    }

    public void setA(int[][] a) {
        this.a = a;
    }
    
    public int getRow(){
        return this.a.length;
    }
    public int getCol(){
        return this.a[0].length;
    }
    public void nextMatrix(Scanner sc){
        for(int i = 0; i < this.getRow(); i++){
            for(int j = 0; j < this.getCol(); j++){
                this.a[i][j] = sc.nextInt();
            }
        }
    }
    public Matrix trans(){
        Matrix t = new Matrix(getCol(), getRow());
        int[][] at = new int[getCol()][getRow()];
        for(int i = 0; i < getRow(); i++){
            for(int j = 0; j < getCol(); j++){
                at[j][i] = this.a[i][j];
            }
        }
        t.setA(at);
        return t;
    }
    public Matrix mul(Matrix other){
        int[][] c = new int[this.getRow()][other.getCol()];
        for(int i = 0; i < this.getRow(); i++){
            for(int j = 0; j < other.getCol(); j++){
                for(int k = 0; k < this.getCol(); k++){
                    c[i][j] += this.a[i][k] * other.a[k][j];
                }
            }
        }
        Matrix res = new Matrix(this.getRow(), other.getCol());
        res.setA(c);
        return res;
    }
    @Override
    public String toString(){
        String res = "";
        for(int i = 0; i < getRow(); i++){
            for(int j = 0; j < getCol(); j++){
                res += a[i][j] + " ";
            }
            res += '\n';
        }
        return res;
    }
}

