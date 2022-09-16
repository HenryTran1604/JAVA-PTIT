/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package J03037_VongTron;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

/**
 *
 * @author admin
 */
public class J03037 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int[] vis = new int[256];
        int l1 = 0, l2 = 0, cnt = 0;
        while(l1 < s.length()){
            if(vis[s.charAt(l1)] == 0){
                Set <Character> set = new HashSet<>();
                l2 = l1 + 1;
                int d = 0;
                while(s.charAt(l2)!= s.charAt(l1)){
                    d++;
                    set.add(s.charAt(l2));
                    l2++;
                }
                cnt += (2*set.size() - d);
                vis[s.charAt(l1)] = 1;
            }
            l1++;
        }
        System.out.println(cnt / 2);
    }
}
