/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package J01013_TongUocSo1;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author :Tran Quang Huy
 */
public class Main2 {
    private static int[] f = new int[2000001];
    private static void sang(){
        for(int i = 1; i <= 2000000; i++){
            f[i] = i;
        }
        for(int i = 2; i <= Math.sqrt(2000000); i++){
            if(f[i] == i){
                for(int j = i * i; j <= 2000000; j += i){
                    f[j] = i;
                }
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sang();
        int t = sc.nextInt();
        long res = 0;
        while(t-- > 0){
            int n = sc.nextInt();
            int tmp = f[n];
            System.out.println(tmp);
            while(n != 1){
                while(n % tmp == 0){
                    n /= tmp;
                    System.out.println(n);
                    res += tmp;
                }
                tmp = f[n];
            }
        }
        System.out.println(res);
    }
}
