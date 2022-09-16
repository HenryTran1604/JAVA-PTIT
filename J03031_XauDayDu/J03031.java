/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package J03031_XauDayDu;

import java.util.Scanner;

/**
 *
 * @author admin
 */
public class J03031 {
    private static boolean check(String s, int k) {
        if(s.length() < 26)
            return false;
        boolean[] f = new boolean[26];
        for(int i = 0; i < s.length(); i++){
            f[s.charAt(i) - 'a'] = true;
        }
        int cnt = 0;
        for(int i = 0; i < 26; i++){
            if(!f[i]) cnt++;
        }
        return k >= cnt;
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            String s = sc.next();
            int k = sc.nextInt();
            if(check(s, k)){
                System.out.println("YES");
            }
            else{
                System.out.println("NO");
            }
        }
    }
}
