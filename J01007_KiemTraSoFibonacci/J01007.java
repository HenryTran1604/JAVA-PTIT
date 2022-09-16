/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author admin
 */
public class J01007 {
    public static long[] f = new long[93];
    public static void generate(){
        f[0] = 0; f[1] = 1;
        for(int i = 2; i < 93; i++){
            f[i] = f[i-1] + f[i-2];
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        generate();
        int test = sc.nextInt();
        while(test-- > 0){
            long x = sc.nextLong();
            boolean ok = false;
            for(int i = 0; i <= 92; i++){
                if(x == f[i]){
                    System.out.println("YES");
                    ok = true;
                    break;
                }
            }
            if(!ok) System.out.println("NO");
        }
    }
}
