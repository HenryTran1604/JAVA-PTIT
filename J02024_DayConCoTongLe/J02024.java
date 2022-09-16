package J02024_DayConCoTongLe;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author admin
 */

public class J02024 {
    private static int n;
    private static Integer[] a = new Integer[20], b = new Integer[20];
    private static void check() {
        int sum = 0;
        for(int i = 1; i <= n; i++){
            sum += a[i] * b[i];
        }
        if(sum % 2 != 0){
            for(int i = 1; i <= n; i++){
                if(b[i] == 1)
                    System.out.print(a[i] + " ");
            }
            System.out.println("");
        }
    }
    
    private static void Try(int i) {
        for(int j = 0; j < 2; j++){
            b[i] = j;
            if(i == n){
                check();
            }
            else{
                Try(i + 1);
            }
        }
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            n = sc.nextInt();
            for(int i = 1; i <= n; i++){
                a[i] = sc.nextInt();
            }
            Arrays.sort(a, 1, n+1, Comparator.reverseOrder());
            Try(1);
        }
    }
}
