/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package J03010_DiaChiEmail;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 *
 * @author admin
 */
public class J03010 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Map <String, Integer> map = new HashMap<>();
        int t = sc.nextInt();
        sc.nextLine();
        while(t-- > 0){
            String s = sc.nextLine();
            s = s.trim();
            String[] arr = s.split("\\s+");
            StringBuilder email = new StringBuilder();
            
            email.append(arr[arr.length - 1].toLowerCase());
            for(int i = 0; i < arr.length - 1; i++) {
                email.append(Character.toLowerCase(arr[i].charAt(0)));
            }
            String tmp = email.toString();
            if(map.containsKey(tmp)){
                int ts = map.get(tmp);
                ++ts;
                System.out.println("" + tmp + ts + "@ptit.edu.vn");
                map.put(tmp, ts);
            }
            else{
                System.out.println(tmp + "@ptit.edu.vn");
                map.put(tmp, 1);
            }
        }
    }
}
