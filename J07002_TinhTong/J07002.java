/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package J07002_TinhTong;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 *
 * @author admin
 */
public class J07002 {
    
    private static boolean check(String s) {
        if(s.length() > 10)
            return false;
        long n = 0;
        for(int i = 0; i < s.length(); i++){
            if(!Character.isDigit(s.charAt(i)))
                return false;
            else{
                n = 10 * n + s.charAt(i) - '0';
                if(n > Integer.MAX_VALUE)
                    return false;
            }
        }
        return true;
    }
    
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("DATA.in"));
        long ans = 0;
        while(sc.hasNext()){
            String s = sc.next();
            if(check(s))
                ans += Long.parseLong(s);
        }
        System.out.println(ans);
    }
}
