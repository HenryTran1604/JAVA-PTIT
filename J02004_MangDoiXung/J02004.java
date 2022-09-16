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
public class J02004 {
    private static boolean doiXung(int[] a) {
        for(int i = 0; i < a.length/2; i++){
            if(a[i] != a[a.length - 1 - i]) return false;
        }
        return true;
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            int n = sc.nextInt();
            int[] a = new int[n];
            for(int i = 0; i < n; i++){
                a[i] = sc.nextInt();
            }
            if(doiXung(a)) System.out.println("YES");
            else System.out.println("NO");
        }
    }
}
