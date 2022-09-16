/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package J01009_TongGiaiThua;

import java.util.Scanner;

/**
 *
 * @author admin
 */
public class J01009 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long ans = 1, tmp = 1;
        for(int i = 2; i <= n; i++){
            tmp *= i;
            ans += tmp;
        }
        System.out.println(ans);
    }
}
