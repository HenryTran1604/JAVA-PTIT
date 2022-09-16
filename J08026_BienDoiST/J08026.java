/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package J08026_BienDoiST;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

/**
 *
 * @author admin
 */

public class J08026 {
    private static int solve(int s, int t) {
        Queue <Integer> q = new LinkedList<>();
        int[] a = new int[20001];
        q.add(s);
        while(!q.isEmpty()){
            int top = q.poll();
            if(top == t){
                return a[t];
            }
            if(2*top < 20000 && a[2*top] == 0){
                if(2*top == t)
                    return a[top] + 1;
                q.add(2*top);
                a[2*top] = a[top] + 1;
            }
            if(top - 1 > 0 && a[top - 1] == 0){
                if(top - 1 == t)
                    return a[top] + 1;
                q.add(top - 1);
                a[top - 1] = a[top] + 1;
            }
        }
        return 0;
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int test = sc.nextInt();
        while(test-- > 0){
            int s = sc.nextInt(), t = sc.nextInt();
            System.out.println(solve(s, t));
        }
    }
}
