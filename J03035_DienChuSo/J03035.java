/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package J03035_DienChuSo;

import java.util.Scanner;

/**
 *
 * @author admin
 */
public class J03035 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            String a = sc.next();
            String b = sc.next();
            long cnt = 1;
            int i = 0;
            while(i < a.length() && a.charAt(i) > b.charAt(i)){
                if(a.charAt(i) == '?')
                    cnt *= 10;
            }
            if(i != 0){
                
            }
        }
    }
}
