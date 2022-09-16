/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package J03038_DanhDauChuCai;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

/**
 *
 * @author admin
 */
public class J03038 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        Set <Character> set = new HashSet<>();
        for(int i = 0; i < s.length(); i++){
            set.add(s.charAt(i));
        }
        System.out.println(set.size());
    }
}
