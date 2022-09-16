/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package J01013_TongUocSo1;
import java.util.Scanner;

/**
 *
 * @author admin
 */
public class J01013 {
    private static int calc(int n) {
        int sum = 0;
        while(n % 2 == 0){
            n >>= 1;
            sum += 2;
        }
        for(int i = 3; i <= Math.sqrt(n); i+=2){
            while(n % i == 0){
                n /= i;
                sum += i;
            }
        }
        if(n > 2) sum += n;
        return sum;
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long sum = 0;
        for(int i = 0; i < n; i++){
            sum += 1l*calc(sc.nextInt());
        }
        System.out.println(sum);
    }
}
