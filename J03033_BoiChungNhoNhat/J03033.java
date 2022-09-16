/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package J03033_BoiChungNhoNhat;

import java.math.BigInteger;
import java.util.Scanner;

/**
 *
 * @author admin
 */
public class J03033 {
    public static BigInteger gcd(BigInteger a, BigInteger b){
        if(b.equals(BigInteger.ZERO))
            return a;
        return gcd(b, a.mod(b));
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            BigInteger a = sc.nextBigInteger();
            BigInteger b = sc.nextBigInteger();
            BigInteger gcd = gcd(a, b);
            System.out.println(a.divide(gcd).multiply(b));
        }
    }
}
