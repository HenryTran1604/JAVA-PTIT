/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package J08021_DayNgoacDungDaiNhat;

import java.util.Scanner;
import java.util.Stack;

/**
 *
 * @author admin
 */
public class J08021 {
    private static int solve(String s) {
        Stack <Integer> st = new Stack<>();
        st.push(-1);
        int maxLen = 0;
        for(int i = 0; i < s.length(); i++){
            if(s.charAt(i) == '(')
                st.push(i);
            else{
                st.pop();
                if(!st.empty()){
                    maxLen = Math.max(maxLen, i - st.peek());
                }
                else
                    st.push(i);
            }
        }
        return maxLen;
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            String s = sc.next();
            System.out.println(solve(s));
        }
    }
}
