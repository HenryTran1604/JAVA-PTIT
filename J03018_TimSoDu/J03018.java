/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package J03018_TimSoDu;

import java.util.Scanner;

/**
 *
 * @author admin
 */
public class J03018 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            String s = sc.next();
            int r = 0;
//            for(int i = 0; i < s.length(); i++){
//                r = (r*10 + s.charAt(i) - '0') % 4;
//            }
//            if(r == 0){
//                System.out.println(4);
//            }
//            else {
//                System.out.println(0);
//            }
            if(s.length() >= 2)
                r = 10 * (s.charAt(s.length() - 2) - '0') + (s.charAt(s.length() - 1) - '0');
            else
                r = s.charAt(0) - '0';
            if(r % 4 == 0)
                System.out.println(4);
            else
                System.out.println(0);
        }
    }
}
