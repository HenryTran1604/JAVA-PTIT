/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package J01017_SoLienKe;

import java.util.Scanner;

/**
 *
 * @author admin
 */
public class J01017 {
    private static boolean check(String s) {
        for(int i = 1; i < s.length(); i++){
            if(Math.abs(s.charAt(i) - s.charAt(i - 1)) != 1)
                return false;
        }
        return true;
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
