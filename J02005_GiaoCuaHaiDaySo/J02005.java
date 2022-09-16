/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package J02005_GiaoCuaHaiDaySo;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

/**
 *
 * @author admin
 */
public class J02005 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), m = sc.nextInt();
        int[] cnt1 = new int[1001];
        int[] cnt2 = new int[1001];
        for(int i = 0; i < n; i++){
            cnt1[sc.nextInt()] = 1;
        }
        for(int i = 0; i < m; i++){
            cnt2[sc.nextInt()] = 1;
        }
        for(int i = 0; i <= 1000; i++){
            if(cnt1[i] != 0 && cnt2[i] != 0)
                System.out.print(i + " ");
        }
    }
}
