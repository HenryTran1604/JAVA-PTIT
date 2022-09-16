/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package J03026_XauKhacNhauDaiNhat;

import java.util.Scanner;

/**
 *
 * @author admin
 */
public class J03026 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        while(t-- > 0){
            String a = sc.nextLine();
            String b = sc.nextLine();
            if(a.equals(b)){
                System.out.println("-1");
            }
            else{
                System.out.println(Math.max(a.length(), b.length()));
            }
        }
    }
}
