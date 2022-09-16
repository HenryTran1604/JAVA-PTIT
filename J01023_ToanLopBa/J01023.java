/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package J01023_ToanLopBa;

import java.util.Scanner;

/**
 *
 * @author admin
 */
public class J01023 {
    private static int n = 0, ok;
    private static int[] a = new int[12];
    private static String res;
    private static StringBuilder equ;
    public static void check(){
        int id = 0;
        StringBuilder tmp = new StringBuilder(equ);
        for(int i = 0; i < 12; i++){
            if(tmp.charAt(i) == '?'){
                tmp = tmp.replace(i, i+1, String.valueOf(a[id]));
                id++;
            }
        }
        int num1 = Integer.parseInt(tmp.substring(0, 2));
        int num2 = Integer.parseInt(tmp.substring(5, 7));
        int ans = Integer.parseInt(tmp.substring(10, 12));
        if(num1 < 10 || num2 < 10 || ans < 10) return;
        int T = (tmp.charAt(3) == '+') ? num1 + num2 : num1 - num2;
        if(T == ans){
            ok = 1;
            res = tmp.toString();
        }
    }
    private static void Try(int i) {
        if(ok == 1) return;
        for(int j = 0; j <= 9; j++){
            a[i] = j;
            if(i == n - 1) check();
            else Try(i + 1);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();
        while(t-- > 0){
            equ = new StringBuilder(sc.nextLine());
            if(equ.charAt(3) == '/' || equ.charAt(3) == '*'){
                System.out.println("WRONG PROBLEM!");
            }
            else{
                n = 0; ok = 0;
                for(int i = 0; i < 12; i++){
                    if(i != 3 && equ.charAt(i) == '?'){
                        n++;
                    }
                }
                if(n == 0){
                    if(equ.charAt(3) == '?'){
                        equ = equ.replace(3, 4, "+");
                        check();
                        if(ok == 0){
                            equ = equ.replace(3, 4, "-");
                            check();
                        }
                    }
                    else{
                        check();
                    }
                }
                else{
                    if(equ.charAt(3) == '?'){
                        equ = equ.replace(3, 4, "+");
                        Try(0);
                        if(ok == 0){
                            equ = equ.replace(3, 4, "-");
                            Try(0);
                        }
                    }
                    else{
                        Try(0);
                    }
                }
                if(ok == 0){
                    System.out.println("WRONG PROBLEM!");
                }
                else{
                    System.out.println(res);
                }
            }
        }
    }
}
