/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package J03039_ChiaHet;

import java.math.BigInteger;
import java.util.Scanner;

/**
 *
 * @author admin
 */
public class J03039 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            BigInteger a = sc.nextBigInteger(), b = sc.nextBigInteger();
            if((!b.equals(BigInteger.ZERO) && a.mod(b).equals(BigInteger.ZERO)) || (!a.equals(BigInteger.ZERO) && b.mod(a).equals(BigInteger.ZERO)))
                System.out.println("YES");
            else
                System.out.println("NO");
        }
    }
}
