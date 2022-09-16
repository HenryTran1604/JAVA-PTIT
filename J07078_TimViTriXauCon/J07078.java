/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package J07078_TimViTriXauCon;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 *
 * @author admin
 */
public class J07078 {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("STRING.in"));
        int n = sc.nextInt();
        while(n-- > 0){
            String par = sc.next();
            String child = sc.next();
            int pos = par.indexOf(child, 0);
            while(pos != -1 ){
                System.out.print(pos + 1 + " ");
                pos = par.indexOf(child, pos + 1);
            }
            System.out.println();
        }
    }
}
