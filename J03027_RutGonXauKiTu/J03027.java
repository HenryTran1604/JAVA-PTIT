/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package J03027_RutGonXauKiTu;

import java.util.LinkedList;
import java.util.Scanner;
import java.util.Stack;

/**
 *
 * @author admin
 */
public class J03027 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        Stack <Character> st = new Stack<>();
        for(int i = 0; i < s.length(); i++){
//            System.out.println(st.size());
            if(!st.isEmpty()){
                char top = st.peek();
                if(top == s.charAt(i)){
                    st.pop();
                }
                else st.push(s.charAt(i));
            }
            else st.push(s.charAt(i));
        }
        if(st.isEmpty()) System.out.println("Empty String");
        else{
            StringBuilder sb = new StringBuilder();
            while(!st.isEmpty()){
                sb.append(st.pop());
            }
            System.out.println(sb.reverse());
        }
    }
}
