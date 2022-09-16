/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package J03023_SoLaMa;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 *
 * @author admin
 */
public class J03023 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            Map <Character, Integer> map = new HashMap<>();
            map.put('I', 1);
            map.put('V', 5);
            map.put('X', 10);
            map.put('L', 50);
            map.put('C', 100);
            map.put('D', 500);
            map.put('M', 1000);
            String s = sc.next();
            long ans = 0;
            for(int i = 0; i < s.length() - 1; i++){
                if(map.get(s.charAt(i)) >= map.get(s.charAt(i + 1))){
                    ans += map.get(s.charAt(i));
                }
                else{
                    ans -= map.get(s.charAt(i));
                }
            }
            ans += map.get(s.charAt(s.length() - 1));
            System.out.println(ans);
            //IX
        }
    }
}
