/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package J08020_KiemTraDayNgoacDung;

import java.util.Scanner;
import java.util.Stack;

/**
 *
 * @author admin
 */
public class J08020 {
    private static boolean check(String s) {
        Stack <Character> st = new Stack<>();
        for(int i = 0; i < s.length(); i++){
            char x = s.charAt(i);
            if(x == '(' || x == '[' || x == '{')
                st.push(x);
            else{
                if(st.empty())
                    return false;
                char top = st.pop();
                if(top == '(' && x != ')') return false;
                if(top == '[' && x != ']') return false;
                if(top == '{' && x != '}') return false;
            }
        }
        return true;
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            String s = sc.next();
            if(check(s))
                System.out.println("YES");
            else
                System.out.println("NO");
        }
    }
}
