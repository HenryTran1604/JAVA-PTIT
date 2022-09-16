/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.util.Scanner;

/**
 *
 * @author admin
 */
public class J01021{
    private static int MOD = (int) 1e9 + 7;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()){
            long a = sc.nextLong(); 
            long b = sc.nextLong();
            if(a == 0 && b == 0) break;
            long ans = 1;
            while(b > 0){
                if(b % 2 == 1){
                    ans = (ans * a) % MOD;
                }
                a = (a * a) % MOD;
                b /= 2;
            }
            System.out.println(ans);
        }
    }
}
