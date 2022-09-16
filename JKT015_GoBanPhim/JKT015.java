/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JKT015_GoBanPhim;

import java.util.Scanner;
import java.util.Stack;

/**
 *
 * @author admin
 */
public class JKT015 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Stack <Character> st = new Stack<>(), rev = new Stack<>();
        String s = sc.nextLine();
        for(int i = 0; i < s.length(); i++){
            char x = s.charAt(i);
            if(x == '<'){
                if(!st.empty()){
                    rev.push(st.pop());
                }
            }
            else if(x == '>'){
                if(!rev.empty()){
                    st.push(rev.pop());
                }
            }
            else if(x == '-'){
                if(!st.empty()){
                    st.pop();
                }
            }
            else{
                st.push(x);
            }
        }
        StringBuilder sb = new StringBuilder();
        while(!st.empty()){
            sb.append(st.pop());
        }
        sb = sb.reverse();
        System.out.print(sb);
        while(!rev.empty()){
            System.out.print(rev.pop());
        }
    }
}
