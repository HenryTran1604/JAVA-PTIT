/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package J02023_LuaChonThamLam;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author admin
 */
public class J02023 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), s = sc.nextInt();
        if(s > 9*n || s == 0 && n != 1)
            System.out.println("-1 -1");
        else if(s == 0 && n == 1)
            System.out.println("0 0");
        else{
            int[] big = new int[n];
            int i = 0;
            while(s > 9){
                big[i] = 9;
                i++;
                s -= 9;
            }
            big[i] = s;
            if(big[n - 1] == 0){
                System.out.print("1");
                int carry = 1;
                for(int j = n - 2; j >= 0; j--){
                    int tmp = big[j];
                    if(carry > 0){
                        if(big[j] > 0){
                            carry--;
                            tmp--;
                        }
                    }
                    System.out.print(tmp);
                }
            }
            else {
                for(int j = n - 1; j >= 0; j--){
                    System.out.print(big[j]);
                }
            }
            System.out.print(" ");
            for(int j = 0; j < n; j++){
                System.out.print(big[j]);
            }
        }
    }
}
