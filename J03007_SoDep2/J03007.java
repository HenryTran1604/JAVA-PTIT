/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package J03007_SoDep2;

import java.util.Scanner;

/**
 *
 * @author admin
 */
public class J03007 {
    private static boolean check(String s) {
        if(s.endsWith("8") && s.startsWith("8")){
            int sum = 0;
            for(int i = 0; i < s.length(); i++){
                if(s.charAt(i) != s.charAt(s.length() - i - 1))
                    return false;
                sum += s.charAt(i) - '0';
            }
            return sum % 10 == 0;
        }
        return false;
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            String s = sc.next();
            if(check(s))
                System.out.println("YES");
            else
                System.out.println("NO");
        }
    }
}
