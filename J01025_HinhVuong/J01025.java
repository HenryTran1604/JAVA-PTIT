/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package J01025_HinhVuong;

import java.util.Scanner;

/**
 *
 * @author admin
 */
public class J01025 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] p1 = new int[4];
        int[] p2 = new int[4];
        for(int i = 0; i < 4; i++){
            p1[i] = sc.nextInt();
        }
        for(int i = 0; i < 4; i++){
            p2[i] = sc.nextInt();
        }
        int x1 = Math.min(p1[0], p2[0]);
        int x2 = Math.min(p1[1], p2[1]);
        int y1 = Math.max(p1[2], p2[2]);
        int y2 = Math.max(p1[3], p2[3]);
        int x = Math.max(y1-x1, y2-x2);
        System.out.println(x*x);
    }
}
