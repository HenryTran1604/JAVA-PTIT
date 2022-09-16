/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package J08028_HinhChuNhatDonSac;

import java.util.Scanner;
import java.util.Stack;

/**
 *
 * @author admin
 */
public class J08028 {
    private static long maxArea(int[] a) {
        Stack <Integer> st = new Stack<>();
        int n = a.length, i = 0;
        long ans = 0;
        while(i < n){
            if(st.empty() || a[i] >= a[st.peek()]){
                st.push(i++);
            }
            else{
                int id = st.pop();
                if(st.empty()){
                    ans = Math.max(ans, 1l * a[id] * i);
                }
                else{
                    ans = Math.max(ans, 1l * a[id] * (i - st.peek() - 1));
                }
            }
        }
        while(!st.empty()){
            int id = st.pop();
            if(st.empty()){
                ans = Math.max(ans, 1l * a[id] * i);
            }
            else{
                ans = Math.max(ans, 1l * a[id] * (i - st.peek() - 1));
            }
        }
        return ans;
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), m = sc.nextInt();
        int[] a = new int[m];
        int[] b = new int[m];
        for(int i = 0; i < m; i++){
            a[i] = sc.nextInt();
            b[i] = n - a[i];
        }
        System.out.println(Math.max(maxArea(a), maxArea(b)));
    }
}
