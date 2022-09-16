/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package J07008_DaySoTangDan;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.TreeSet;

/**
 *
 * @author admin
 */
public class J07008 {
    private static int n;
    private static int[] a = new int[21], b = new int[21];
    private static TreeSet<String> set = new TreeSet<>();
    private static void update() {
        int curr = 0, cnt = 0;
        for(int i = 1; i <= n; i++){
            if(b[i] == 1){
                cnt += 1;
                if(a[i] < curr)
                    return;
                curr = a[i];
            }
        }
        if(cnt <= 1) return;
        StringBuilder sb = new StringBuilder();
        for(int i = 1; i <= n; i++){
            if(b[i] == 1){
                sb.append(String.valueOf(a[i]));
                sb.append(" ");
            }
        }
        set.add(sb.toString());
    }
    
    private static void Try(int i) {
        for(int j = 0; j < 2; j++){
            b[i] = j;
            if(i == n){
                update();
            }
            else
                Try(i + 1);
        }
    }
    
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("DAYSO.in"));
        n = sc.nextInt();
        for(int i = 1; i <= n; i++){
            a[i] = sc.nextInt();
        }
        Try(1);
        for(String x : set){
            System.out.println(x);
        }
    }
}
