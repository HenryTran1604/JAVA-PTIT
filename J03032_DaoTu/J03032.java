/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package J03032_DaoTu;

import java.util.Scanner;

/**
 *
 * @author admin
 */
public class J03032 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();
        while(t-- > 0){
            String s = sc.nextLine();
            String[] arr = s.split("\\s+");
            for(String x : arr){
                for(int i  = x.length() - 1; i >= 0; i--){
                    System.out.print(x.charAt(i));
                }
                System.out.print(" ");
            }
            System.out.println("");
        }
    }
}
