/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package J03004_ChuanHoaXauHoTen1;
import java.util.Scanner;
/**
 *
 * @author admin
 */
public class J03004 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();
        while(t-- > 0){
            String s = sc.nextLine();
            s = s.trim();
            String[] arr = s.split("\\s+");
            StringBuilder sb = new StringBuilder();
            for(String x : arr){
                sb.append(Character.toUpperCase(x.charAt(0)));
                for(int i = 1; i < x.length(); i++){
                    sb.append(Character.toLowerCase(x.charAt(i)));
                }
                sb.append(" ");
            }
            System.out.println(sb);
        }
    }
}
