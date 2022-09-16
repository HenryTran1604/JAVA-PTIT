/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package J03025_XauDoiXung;

import java.util.Scanner;

/**
 *
 * @author admin
 */
public class J03025 {
    private static boolean check(String s) {
        int maxChange = 1;
        for(int i = 0; i < s.length() / 2; i++){
            if(s.charAt(i) != s.charAt(s.length() - i - 1)){
                maxChange--;
                if(maxChange < 0)
                    return false;
            }
        }
        if(maxChange == 1 && s.length() % 2 == 0)
            return false;
        return true;
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
