/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package J02106_MaTranNhiPhan;

import java.util.Scanner;

/**
 *
 * @author admin
 */
public class J02106 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int cnt = 0;
        for(int i = 0; i < n; i++){
            int a = 0;
            for(int j = 0; j < 3; j++){
                a += sc.nextInt();
            }
            if(a > 1) cnt++;
        }
        System.out.println(cnt);
    }
}
