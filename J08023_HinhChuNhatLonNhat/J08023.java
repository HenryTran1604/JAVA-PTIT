/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package J08023_HinhChuNhatLonNhat;


import java.util.Scanner;
import java.util.Stack;

/**
 *
 * @author admin
 */
public class J08023 {
    private static void maxHologram(int[] h) {
        Stack <Integer> st = new Stack<>();
        long ans = 0;
        int i = 0;
        while(i < h.length){
            if(st.isEmpty() || h[st.peek()] <= h[i]){
                st.add(i++);
            }
            else{
                int id = st.pop();
                if(st.isEmpty()){
                    ans = Math.max(ans, 1l * h[id] * i);
                }
                else{
                    ans = Math.max(ans, 1l * h[id] * (i - st.peek() - 1));
                }
            }
        }
        while(!st.isEmpty()){
            int id = st.pop();
            if(st.isEmpty()){
                ans = Math.max(ans, 1l * h[id] * i);
            }
            else{
                ans = Math.max(ans, 1l * h[id] * (i - st.peek() - 1));
            }
        }
        System.out.println(ans);
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            int n = sc.nextInt();
            int[] H = new int[n];
            for(int i = 0; i < n; i++){
                H[i] = sc.nextInt();
            }
            maxHologram(H);
        }
    }
}
