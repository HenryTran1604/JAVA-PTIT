/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package J03011_UocChungLonNhatCuaSoNguyenLon;

import java.util.Scanner;

/**
 *
 * @author admin
 */
public class J03011 {
    private static long gcd(long a, long b) {
        if(b == 0) return a;
        return gcd(b, a % b);
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            long a = sc.nextLong();
            String b = sc.next();
            long r = 0;
            for(int i = 0; i < b.length(); i++){
                r = (10 * r + b.charAt(i) - '0') % a;
            }
            System.out.println(gcd(a, r));
        }
    }
}
