/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package J02017_ThuGonDaySo;

import java.util.Scanner;
import java.util.Stack;

/**
 *
 * @author admin
 */
public class J02017 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for(int i = 0; i < n; i++){
            a[i] = sc.nextInt();
        }
        Stack <Integer> st = new Stack<>();
        st.push(a[0]);
        for(int i = 1; i < n; i++){
            int top = st.peek();
            System.out.println(top);
            if((a[i] + top) % 2 == 0){
                st.pop();
                st.push(a[i] + top);
            }
            else st.push(a[i]);
        }
        System.out.println(st.size());
//        while(!st.isEmpty()){
//            System.out.println(st.pop());
//        }
    }
}
//10
//
//1 5 5 8 6 4 3 5 9 3
//6  5 38