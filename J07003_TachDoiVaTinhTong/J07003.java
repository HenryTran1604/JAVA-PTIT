/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package J07003_TachDoiVaTinhTong;

import java.io.File;
import java.io.FileNotFoundException;
import java.math.BigInteger;
import java.util.Scanner;

/**
 *
 * @author admin
 */
public class J07003 {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("DATA.in"));
        BigInteger a = sc.nextBigInteger();
        while(a.compareTo(BigInteger.TEN) >= 0){
            String tmp = a.toString();
            int len = tmp.length();
            BigInteger n1 = new BigInteger(tmp.substring(0, len/2));
            BigInteger n2 = new BigInteger(tmp.substring(len/2));
            a = n1.add(n2);
            System.out.println(n1.add(n2));
        }
    }
}
