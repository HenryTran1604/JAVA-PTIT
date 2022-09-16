/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package J02008_BoiSoNSoDauTien;

import java.util.Scanner;

/**
 *
 * @author admin
 */
public class J02008 {
    private static long gcd(long a, long b) {
        if(b == 0) return a;
        return gcd(b, a % b);
    }
    private static long[] ans = new long[101];
    private static void generate(){
        ans[1] = 1;
        for(int i = 2; i <= 100; i++){
            ans[i] = ans[i-1] / gcd(ans[i-1], 1l*i) * 1l * i;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        generate();
        int t = sc.nextInt();
        while(t-- > 0){
            int n = sc.nextInt();
            
            System.out.println(ans[n]);
        }
    }
}
