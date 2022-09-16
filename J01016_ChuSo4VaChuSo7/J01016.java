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
public class J01016 {
    private static boolean check(long n) {
        int cnt = 0;
        while(n > 0){
            long r = n % 10;
            if(r == 4 || r == 7) cnt++;
            n /= 10;
        }
        return cnt == 4 || cnt == 7;
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        if(check(n)) System.out.println("YES");
        else System.out.println("NO");
    }
}
