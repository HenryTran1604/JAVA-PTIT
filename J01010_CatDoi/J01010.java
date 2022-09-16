/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package J01010_CatDoi;

import java.util.Scanner;

/**
 *
 * @author admin
 */
public class J01010 {
    private static String Convert(String s) {
        String ans = "";
        for(int i = 0; i < s.length(); i++){
            char c = s.charAt(i);
            if(c == '0' || c == '8' || c == '9') ans += '0';
            else if(c == '1') ans += '1';
            else return "INVALID";
        }
        int i = 0;
        while(i < s.length()&& ans.charAt(i) == '0'){
            i++;
        }
        if(i == s.length()) return "INVALID";
        return ans.substring(i);
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            String s = sc.next();
            System.out.println(Convert(s));
        }
    }
}
