/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package J08022_PhanTuBenPhaiDauTienLonHon;

import java.util.Scanner;
import java.util.Stack;

/**
 *
 * @author admin
 */
public class J08022 {
    private static void firstRightGreaterElement(int[] a) {
        Stack <Integer> st = new Stack<>();
        int[] R = new int[a.length];
        for(int i = a.length - 1; i >= 0; i--){
            while(!st.empty() && a[i] >= a[st.peek()]){
                st.pop();
            }
            if(st.empty())
                R[i] = -1;
            else
                R[i] = a[st.peek()];
            st.push(i);
        }
        for(int i = 0; i < a.length; i++){
            System.out.print(R[i] + " ");
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
            firstRightGreaterElement(a);
        }
    }
}
