/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package J01014_UocSoNguyenToLonNhat;

import java.util.Scanner;

/**
 *
 * @author admin
 */
public class J01014 {
    private static long maxPrimeDivisor(long n) {
        long ans = 2;
        while(n % 2 == 0){
            n >>= 1;
        }
        for(int i = 3; i <= Math.sqrt(n); i+=2){
            while(n % i == 0){
                n /= i;
                ans = i;
            }
        }
        if(n > 2) ans = n;
        return ans;
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            long n = sc.nextLong();
            System.out.println(maxPrimeDivisor(n));
        }
    }
}
