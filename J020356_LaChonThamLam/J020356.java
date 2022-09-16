/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package J020356_LaChonThamLam;

import java.util.Scanner;

/**
 *
 * @author admin
 */
public class J020356 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), s = sc.nextInt();
        if(s > 9*n || s == 0 && n != 1){
            System.out.println("-1 -1");
        }
        else if(s == 0 && n == 1){
            System.out.println("0 0");
        }
        else{
            int[] big = new int[n], small = new int[n];
            
            int id = 0;
            while(s > 9){
                big[id++] = 9;
                s -= 9;
            }
            big[id] = s; 
            for(int i = 0; i < n; i++){
                small[i] = big[n - i -1];
            }
            if(small[0] == 0){
                small[0] = 1;
                for(int i = 1; i < n; i++){
                    if(small[i] != 0){
                        small[i] -= 1;
                        break;
                    }
                }
            }
            for(int i = 0; i < n; i++){
                System.out.print(small[i]);
            }
            System.out.print(" ");
            for(int i = 0; i < n; i++){
                System.out.print(big[i]);
            }
        }
    }
}
