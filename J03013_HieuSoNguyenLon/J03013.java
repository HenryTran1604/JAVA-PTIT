/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package J03013_HieuSoNguyenLon;

import java.math.BigInteger;
import java.util.Scanner;

/**
 *
 * @author admin
 */
public class J03013 {
    private static String sub(String a, String b) {
        StringBuilder sb = new StringBuilder();
        while(a.length() < b.length()) a = "0" + a;
        while(a.length() > b.length()) b = "0" + b;
        if(a.compareTo(b) < 0) {
            String tmp = a;
            a = b;
            b = tmp;
        }
        int carry = 0;
        for(int i = a.length() - 1; i >= 0; i--){
            int num1 = a.charAt(i) - '0', num2 = b.charAt(i) - '0';
            int res = num1 - num2 - carry;
            if(res < 0) {
                res += 10;
                carry = 1;
            }
            else carry = 0;
            
            sb.append((char) (res + '0'));
        }
        sb = sb.reverse();
        return sb.toString();
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            String a = sc.next(), b = sc.next();
            System.out.println(sub(a, b));
        }
    }
}
