/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package J03033_BoiChungNhoNhat;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author admin
 */
public class J03033_2 {
    private static String mul(String a, String b) {
        int len1 = a.length(), len2 = b.length();
        int[] v = new int[len1 + len2];
        int i_n1 = 0, i_n2 = 0;
        for(int i = len1 - 1; i >= 0; i--){
            int n1 = a.charAt(i) - '0', carry = 0;
            i_n2 = 0;
            for(int j = len2 - 1; j >= 0; j--){
                int n2 = b.charAt(j) - '0';
                int tmp = n1 * n2 + v[i_n1 + i_n2] + carry;
                v[i_n1 + i_n2] = tmp % 10;
                carry = tmp / 10;
                
                i_n2++;
            }
            if(carry != 0) v[i_n1 + i_n2] += carry;
            i_n1++;
        }
        int i = len1 + len2 - 1;
        while(i >= 0 && v[i] == 0)
            i--;
        if(i < 0)
            return "0";
        StringBuilder sb = new StringBuilder();
        for(int j = i; j >= 0; j--){
            sb.append((char) (v[j] + '0'));
        }
        return sb.toString();
    }
    public static String sub(String a, String b){
        while(a.length() < b.length()) a = "0" + a;
        while(a.length() > b.length()) b = "0" + b;
        StringBuilder sb = new StringBuilder();
        int carry = 0;
        for(int i = a.length() - 1; i >= 0; i--){
            int n1 = a.charAt(i) - '0', n2 = b.charAt(i) - '0';
            int res = n1 - n2 - carry;
            if(res < 0){
                res += 10;
                carry = 1;
            }
            else carry = 0;
            sb.append((char) (res + '0'));
        }
        StringBuilder res = new StringBuilder();
        int i = sb.length() - 1;
        while(i >= 0 && sb.charAt(i) == '0')
            i--;
        if(i < 0) 
            return "0";
        for(int j = i; j >= 0; j--){
            res.append(sb.charAt(j));
        }
        return res.toString();
    }
    public static String div(String a, String b){
        StringBuilder res = new StringBuilder();
        StringBuilder tmp = new StringBuilder();
        tmp.append(a.charAt(0));
        int len = a.length();
        a = a + "@";
        int i = 0;
        while(i < len - 1 && tmp.length() < b.length() || tmp.length() == b.length() && tmp.toString().compareTo(b) < 0)
            tmp.append(a.charAt(++i));
        while(i < len){
            int div = 0;
            while(tmp.length() > b.length() || tmp.length() == b.length() && tmp.toString().compareTo(b) >= 0){
                ++div;
                tmp = new StringBuilder(sub(tmp.toString(), b));
            }
            if("0".equals(tmp.toString())) tmp = new StringBuilder();
            tmp.append(a.charAt(++i));
            res.append((char) (div + '0'));            
        }
        if(res.length() == 0)
            return "0";
        return res.toString();
    }
    public static String mod(String a, String b){
        return sub(a, mul(div(a, b), b));
    }
    private static String gcd(String a, String b) {
        if(b.equals("0"))
            return a;
        return gcd(b, mod(a, b));
    }
    
    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            String a = sc.next(), b = sc.next();
            System.out.println(mul(div(a, gcd(a, b)), b));
        }
    }
}
