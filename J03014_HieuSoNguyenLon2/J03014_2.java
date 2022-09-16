/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package J03014_HieuSoNguyenLon2;

import java.math.BigInteger;
import java.util.Scanner;

/**
 *
 * @author admin
 */
public class J03014_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = 1;
        while(t-- > 0){
            BigInteger a = sc.nextBigInteger();
            BigInteger b = sc.nextBigInteger();
            BigInteger ans = a.subtract(b);
            System.out.println(ans);
        }
        
    }
}
