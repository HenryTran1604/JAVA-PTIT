/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package J03014_HieuSoNguyenLon2;

import java.util.Scanner;

/**
 *
 * @author admin
 */
public class J03014 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next(), b = sc.next();
        StringBuilder sb = new StringBuilder();
        while(a.length() < b.length()) a = "0" + a;
        while(a.length() > b.length()) b = "0" + b;
        int carry = 0, sign = 0;
        if(a.compareTo(b) < 0){
            sign = 1;
            String tmp = a;
            a = b;
            b = tmp;
        }
        for(int i = a.length() - 1; i >= 0; i--){
            int num1 = a.charAt(i), num2 = b.charAt(i);
            int res = num1 - num2 - carry;
            if(res < 0){
                res += 10;
                carry = 1;
            }
            else carry = 0;
            sb.append((char) (res + '0'));
        }
        int i = sb.length() - 1;
        while(i >= 0 && sb.charAt(i) == '0'){
            i--;
        }
        if(i == -1) System.out.println("0");
        else{
            if(sign == 1) System.out.print("-");
            for(int j = i; j >= 0; j--){
                System.out.print(sb.charAt(j));
            }
        }
    }
}
