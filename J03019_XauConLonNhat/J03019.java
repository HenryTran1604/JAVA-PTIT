/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package J03019_XauConLonNhat;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author admin
 */
public class J03019 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int n = s.length();
        char[] a = s.toCharArray();
        Arrays.sort(a);
        int[] f = new int[256];
        for(int i = 0; i < n; i++)
            f[a[i]]++;
        StringBuilder sb = new StringBuilder();
        int i = 0, j = n - 1;
        while(i < n){
            if(f[a[j]] == 0) j--;
            else{
                if(a[j] == s.charAt(i)){
                    sb.append(a[j]);
                }
                f[s.charAt(i)]--;
                i++;
            }
        }
        System.out.println(sb);
    }
}
