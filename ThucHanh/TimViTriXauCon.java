/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ThucHanh;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 *
 * @author :Tran Quang Huy
 */
public class TimViTriXauCon {

    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("STRING.in"));
        int t = sc.nextInt();
        while (t-- > 0) {
            String par = sc.next(), child = sc.next();
            int pos = 0;
            int x = par.indexOf(child, pos);
            while (x != -1) {
                System.out.print(x+1 + " ");
                pos = x;
                x = par.indexOf(child, pos+ 1);
            }
            System.out.println("");
        }
    }
}
