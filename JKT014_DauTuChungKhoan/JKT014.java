/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JKT014_DauTuChungKhoan;

import java.util.Scanner;
import java.util.Stack;

/**
 *
 * @author admin
 */
public class JKT014 {
    private static void solve(int[] a, int n) {
        Stack <Integer> st = new Stack<>();
        int[] L = new int[n];
        for(int i = 0; i < n; i++){
            while(!st.empty() && a[i] >= a[st.peek()]){
                st.pop();
            }
            if(st.empty())
                L[i] = i + 1;
            else
                L[i] = i - st.peek();
            st.push(i);
        }
        for(int i = 0; i < n; i++){
            System.out.print(L[i] + " ");
        }
        System.out.println("");
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            int n = sc.nextInt();
            int[] a = new int[n];
            for(int i = 0; i < n; i++){
                a[i] = sc.nextInt();
            }
            solve(a, n);
        }
    }
}
