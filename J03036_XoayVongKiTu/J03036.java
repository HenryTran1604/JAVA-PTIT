/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package J03036_XoayVongKiTu;

import java.util.Scanner;

/**
 *
 * @author :Tran Quang Huy
 */
public class J03036 {
    private static int countDiff(String src, String des){
        int cnt = 0;
        while(!src.equals(des)){
            src = src.substring(1) + src.charAt(0);
            cnt += 1;
            if(cnt >= src.length()) return -1;
        }
        return cnt;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String[] s = new String[n];
        for(int i = 0; i < n; i++){
            s[i] = sc.next();
        }
        int minCnt = 1000;
        for(int i = 0; i < n; i++){
            int cnt = 0;
            for(int j = 0; j < n; j++){
                int t = countDiff(s[j], s[i]);
                if(t == -1){
                    System.out.println(t);
                    return;
                }
                cnt += t;
            }
            minCnt = Math.min(cnt, minCnt);
        }
        System.out.println(minCnt);
    }
}
