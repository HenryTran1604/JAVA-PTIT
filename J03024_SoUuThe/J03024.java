/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package J03024_SoUuThe;

import java.util.Scanner;

/**
 *
 * @author admin
 */
public class J03024 {
    private static String check(String s) {
        int n = s.length();
        int even = 0, odd = 0;
        if(s.charAt(0) == '0')
            return "INVALID";
        for(int i = 0; i < n; i++){
            if(!Character.isDigit(s.charAt(i)))
                return "INVALID";
            if((s.charAt(i) - '0') % 2 == 0) even++;
            else odd++;
        }
        if((n % 2 == 0 && even > odd) || (n % 2 == 1 && odd > even))
            return "YES";
        return "NO";
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            String s = sc.next();
            System.out.println(check(s));
        }
    }
}
