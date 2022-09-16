/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package J01011_BoiSoChungUocSoChung;

import java.util.Scanner;

/**
 *
 * @author admin
 */
public class J01011 {
    private static long gcd(long a, long b) {
        if(b == 0) return a;
        return gcd(b, a % b);
    }
    
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        int test = sc.nextInt();
        while(test-- > 0){
            long a = sc.nextLong(), b = sc.nextLong();
            long gcd  = gcd(a, b);
            System.out.println(a / gcd * b + " " + gcd);
        }
    }
}
