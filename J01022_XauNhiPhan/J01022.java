/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.Scanner;

/**
 *
 * @author admin
 */
public class J01022 {
    private static long[] f = new long[93];
    private static void generate(){
        f[0] = 0; f[1] = 1;
        for(int i = 2; i <= 92; i++){
            f[i] = f[i - 1] + f[i - 2];
        }
    }
    private static int findBit(int n, long k){
        if(n == 1) return 0;
        if(n == 2) return 1;
        if(k <= f[n - 2]) return findBit(n - 2, k);
        return findBit(n - 1, k - f[n - 2]);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        generate();
        int t = sc.nextInt();
        while(t-- > 0) {
            int n = sc.nextInt(); 
            long k = sc.nextLong();
            System.out.println(findBit(n, k));
        }
    }
    
}
