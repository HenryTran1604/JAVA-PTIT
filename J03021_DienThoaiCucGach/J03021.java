/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package J03021_DienThoaiCucGach;

import java.util.Scanner;

/**
 *
 * @author admin
 */
public class J03021 {
    private static int modul(char x) {
        switch (x){
            case 'A':
            case 'B':
            case 'C':
                return 2;
            case 'D':
            case 'E':
            case 'F':
                return 3;
            case 'G':
            case 'H':
            case 'I':
                return 4;
            case 'J':
            case 'K':
            case 'L':
                return 5;
            case 'M':
            case 'N':
            case 'O':
                return 6;
            case 'P':
            case 'Q':
            case 'R':
            case 'S':
                return 7;
            case 'T':
            case 'U':
            case 'V':
                return 8;
        }
        return 9;
    }
    
    private static boolean check(String s) {
       
        for(int i = 0; i < s.length() / 2; i++){
            
            if(modul(s.charAt(i)) != modul(s.charAt(s.length() - i - 1)))
                return false;
        }
        return true;
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            String s = sc.next();
            s = s.toUpperCase();
            if(check(s))
                System.out.println("YES");
            else
                System.out.println("NO");
        }
    }
}
