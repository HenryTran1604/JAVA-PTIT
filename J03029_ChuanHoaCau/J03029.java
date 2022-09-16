/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package J03029_ChuanHoaCau;

import java.util.Scanner;

/**
 *
 * @author admin
 */
public class J03029 {
    private static String chuanHoa(String s) {
        s = s.trim();
        String[] arr = s.split("\\s+");
        StringBuilder sen = new StringBuilder();
        for(int i = 0; i < arr.length; i++){
            int len = arr[i].length();
            if(i == 0){
                sen.append(Character.toUpperCase(arr[0].charAt(0)));
                for(int j = 1; j < len; j++){
                    sen.append(Character.toLowerCase(arr[i].charAt(j)));
                }
            }
            else {
                for(int j = 0; j < len; j++){
                    sen.append(Character.toLowerCase(arr[i].charAt(j)));
                }
                if(arr[i].charAt(len - 1)== '!' || arr[i].charAt(len - 1) == '?' || arr[i].charAt(len - 1) == '.'){
                    if(len == 1){
                        sen.deleteCharAt(sen.length() - 2);
                    }
                }
            }
            sen.append(" ");
        }
        sen.deleteCharAt(sen.length() - 1);
        if(sen.charAt(sen.length() - 1) != '.' && sen.charAt(sen.length() - 1) != '!' && sen.charAt(sen.length() - 1) != '?'){
            sen.append('.');
        }
        return sen.toString();
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(sc.hasNextLine()){
            String s = sc.nextLine();
            System.out.println(chuanHoa(s));
        }
    }
}
