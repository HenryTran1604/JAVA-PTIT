/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package J02037_DayUuThe;

import java.util.Scanner;

/**
 *
 * @author admin
 */
public class J02037 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();
        while(t-- > 0){
            String s = sc.nextLine();
            String[] arr = s.split("\\s+");
            int len = arr.length;
            int cntEven = 0, cntOdd = 0;
            for(String x : arr){
                int a = Integer.parseInt(x);
                if(a % 2 == 0) cntEven++;
                else cntOdd++;
            }
            if((len % 2 == 0 && cntEven > cntOdd) || (len % 2 == 1 && cntOdd  > cntEven))
                System.out.println("YES");
            else
                System.out.println("NO");
        }
    }
}

