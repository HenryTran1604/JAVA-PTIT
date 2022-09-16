/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package J07021_ChuanHoaXauHoTenTrongFile;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 *
 * @author admin
 */
public class J07021 {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("DATA.in"));
        while(true){
            String s = sc.nextLine();
            if(s.equals("END"))
                break;
            s = s.trim();
            String[] arr = s.split("\\s+");
            StringBuilder sb = new StringBuilder();
            for(int i = 0; i < arr.length; i++){
                sb.append(Character.toUpperCase(arr[i].charAt(0)));
                sb.append(arr[i].substring(1).toLowerCase());
                sb.append(" ");
            }
            System.out.println(sb);
        }
    }
}
