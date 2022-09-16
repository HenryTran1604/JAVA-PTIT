/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JKT013_SoLocPhat;

import java.util.Collections;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;

/**
 *
 * @author admin
 */
public class JKT013 {
    private static void solve(int n) {
        Stack <String> st = new Stack<>();
        Queue <String> q = new LinkedList<>();
        String end = "";
        
        for(int i = 0; i < n; i++){
            end += "8";
        }
        // end = String.join("", Collections.nCopies(n, "8")
        q.add("6"); q.add("8");
        while(!q.isEmpty()){
            String top = q.poll();
            st.push(top);
            if(end.equals(top)){
                break;
            }
            q.add(top + "6");
            q.add(top + "8");
        }
        System.out.println(st.size());
        while(!st.empty()){
            System.out.print(st.pop() + " ");
        }
        System.out.println("");
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
