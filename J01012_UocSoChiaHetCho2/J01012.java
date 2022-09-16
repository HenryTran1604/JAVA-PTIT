/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package J01012_UocSoChiaHetCho2;

import java.util.Scanner;

/**
 *
 * @author admin
 */
public class J01012 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int test = sc.nextInt();
        while(test-- > 0){
            int n = sc.nextInt(), cnt = 0;
            for(int i = 1; i <= Math.sqrt(n); i++){
                if(n % i == 0){
                   if(i % 2 == 0) cnt++;
                   if(n/i % 2 == 0) cnt++;
                   if(i % 2 == 0 && i == n/i) cnt--;
                }
            }
            System.out.println(cnt);
        }
    }
}
