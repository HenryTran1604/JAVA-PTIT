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
public class J01024 {
    private static boolean isTernary(int n) {
        while(n > 0){
            if(n % 10 > 2)
                return false;
            n /= 10;
        }
        return true;
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            int n = sc.nextInt();
            if(isTernary(n))
                System.out.println("YES");
            else
                System.out.println("NO");
        }
    }
}
