/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package J02019_TongUocSo2;

import java.util.Scanner;

/**
 *
 * @author :Tran Quang Huy
 */
public class J02019 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] f = new int[1000005];
        f[0] = 0;
        f[1] = 0;
        for (int i = 2; i <= 1000000; i++) {
            f[i] = i;
        }
        for (int i = 2; i <= 1000; i++) {
            if (f[i] == i) {
                for (int j = 2 * i; j <= 1000000; j += i) {
                    f[j] += i;
                    if(j == 12) System.out.println(i);
                }
            }
        }
        int a = sc.nextInt(), b = sc.nextInt();
        int cnt = 0;
        for (int i = a; i <= b; i++) {
            System.out.println(i + " " + f[i]);
            if (f[i] - i > i) {
                cnt++;
            }
        }
        System.out.println(cnt);
    }
}
