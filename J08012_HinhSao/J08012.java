/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package J08012_HinhSao;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author admin
 */
public class J08012 {
    private static int n;
    private static ArrayList <Integer>[] adj;
    private static boolean check() {
        for(int i = 1; i <= n; i++){
            if(adj[i].size() == n - 1)
                return true;
        }
        return false;
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        adj = new ArrayList[n+1];
        for(int i = 1; i <= n; i++){
            adj[i] = new ArrayList<>();
        }
        for(int i = 1; i < n; i++){
            int x = sc.nextInt(), y = sc.nextInt();
            adj[x].add(y);
            adj[y].add(x);
        }
        if(check())
            System.out.println("Yes");
        else
            System.out.println("No");
    }
}
