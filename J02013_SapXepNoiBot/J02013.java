/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package J02013_SapXepNoiBot;

import java.util.Scanner;

/**
 *
 * @author admin
 */
public class J02013 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for(int i = 0; i < n; i++){
            a[i] = sc.nextInt();
        }
        boolean isSorted;
        for(int i = 0; i < n - 1; i++){
            isSorted = true;
            for(int j = 0; j < n - i - 1; j++){
                if(a[j] > a[j + 1]){
                    int tmp = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = tmp;
                    isSorted = false;
                }
            }
            if(isSorted) break;
            System.out.print("Buoc " + (i + 1) + ": ");
            for(int j = 0; j < n; j++){
                System.out.print(a[j] + " ");
            }
            System.out.println("");
        }
    }
}
