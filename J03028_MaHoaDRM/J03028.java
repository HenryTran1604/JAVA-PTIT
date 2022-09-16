/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package J03028_MaHoaDRM;

import java.util.Scanner;

/**
 *
 * @author admin
 */
public class J03028 {
    public static String DRMCoding(String s){
        StringBuilder p1 = new StringBuilder();
        StringBuilder p2 = new StringBuilder();
        int r1 = 0, r2 = 0;
        for(int i = 0; i < s.length()/2; i++){
            r1 += s.charAt(i) - 'A';
        }
        r1 %= 26;
        for(int i = s.length() / 2; i < s.length(); i++){
            r2 += s.charAt(i) - 'A';
        }
        r2 %= 26;
        for(int i = 0; i < s.length()/2; i++){
            if(s.charAt(i) + r1 > 'Z'){
                p1.append((char)('A' + r1 - ('Z' - s.charAt(i)) - 1));
            }
            else{
                p1.append((char)(s.charAt(i) + r1));
            }
        }
        for(int i = s.length() / 2; i < s.length(); i++){
            if(s.charAt(i) + r2 > 'Z'){
                p2.append((char) ('A' + r2 - ('Z' - s.charAt(i)) - 1));
            }
            else{
                p2.append((char) (s.charAt(i) + r2));
            }
        }
        StringBuilder res = new StringBuilder();
        for(int i = 0; i < p1.length(); i++){
            int r = p2.charAt(i) - 'A';
            if(p1.charAt(i) + r > 'Z'){
                res.append((char) ('A' + r - ('Z' - p1.charAt(i)) - 1));
            }
            else{
                res.append((char) (p1.charAt(i) + r));
            }
        }
        return res.toString();
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            String s = sc.next();
            System.out.println(DRMCoding(s));
        }
    }
}
