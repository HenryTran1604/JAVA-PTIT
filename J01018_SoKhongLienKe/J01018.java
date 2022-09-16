/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.util.Scanner;

/**
 *
 * @author admin
 */
public class J01018 {
    private static boolean check(String s) {
        int sumDigit = s.charAt(0) - '0';
        for(int i = 1; i < s.length(); i++){
            sumDigit += s.charAt(i) - '0';
            if(Math.abs(s.charAt(i) - s.charAt(i - 1)) != 2)
                return false;
        }
        return sumDigit % 10 == 0;
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();
        while(t-- > 0){
            String s = sc.nextLine();
            if(check(s)) System.out.println("YES");
            else System.out.println("NO");
        }
    }
}
