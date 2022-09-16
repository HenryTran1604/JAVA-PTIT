/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package J08024_So0VaSo9;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

/**
 *
 * @author admin
 */
public class J08024 {
    private static void solve(int n) {
        Queue <Long> q = new LinkedList<>();
        q.add(9l);
        while(!q.isEmpty()){
            long top = q.poll();
            if(top % n == 0){
                System.out.println(top);
                return;
            }
            q.add(10 * top);
            q.add(10 * top + 9);
        }
        
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            int n = sc.nextInt();
            solve(n);
        }
    }
}
