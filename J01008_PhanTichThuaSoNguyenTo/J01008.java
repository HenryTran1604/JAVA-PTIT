/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package J01008_PhanTichThuaSoNguyenTo;

import java.util.Scanner;

/**
 *
 * @author admin
 */
public class J01008 {
    private static void phanTich(int n) {
        int cnt = 0;
        while(n % 2 == 0){
            n /= 2;
            cnt++;
        }
        if(cnt > 0) System.out.print(2 + "(" + cnt + ") ");
        for(int i = 3; i <= Math.sqrt(n); i+=2){
            cnt = 0;
            while(n % i == 0){
                cnt++;
                n /= i;
            }
            if(cnt != 0)
                System.out.print(i + "(" + cnt + ") ");
        }
        if(n > 2) System.out.print(n + "(1)");
        System.out.println("");
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for(int i = 1; i <= t; i++){
            int n = sc.nextInt();
            System.out.print("Test " + i + ": ");
            phanTich(n);
        }
    }
}
