/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package J03005_ChuanHoaXauHoTen2;

import java.util.Scanner;

/**
 *
 * @author admin
 */
public class J03005 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();
        while(t-- > 0){
            String s = sc.nextLine();
            s = s.trim();
            String[] arr = s.split("\\s+");
            StringBuilder sb = new StringBuilder();
            for(int i = 1; i < arr.length; i++){
                sb.append(Character.toUpperCase(arr[i].charAt(0)));
                for(int j = 1; j < arr[i].length(); j++){
                    sb.append(Character.toLowerCase(arr[i].charAt(j)));
                }
                sb.append(" ");
            }
            sb.deleteCharAt(sb.length() - 1);
            sb.append(", ");
            sb.append(arr[0].toUpperCase());
            System.out.println(sb);
        }
    }
}
