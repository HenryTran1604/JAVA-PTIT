/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package J03016_ChiaHetCho11;

import java.util.Scanner;

/**
 *
 * @author admin
 */
public class J03016 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            String s = sc.next();
            int evenSum = 0, oddSum = 0;
            for(int i = 0; i < s.length(); i++){
                if(i % 2 == 0)
                    evenSum += s.charAt(i) - '0';
                else
                    oddSum += s.charAt(i) - '0';
            }
            if((evenSum - oddSum) % 11 == 0)
                System.out.println("1");
            else
                System.out.println("0");
        }
    }
}
