/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package J01006_TinhSoFibonacci;
import java.util.Scanner;
import java.util.Map;
import java.util.TreeMap;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Set;
import java.util.TreeSet;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Collections;
import java.util.Comparator;
import java.util.Arrays;
import java.util.ArrayList;
import java.util.List;
import java.io.File;
/**
 *
 * @author admin
 */
public class J01006 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int test = sc.nextInt();
        long[] f = new long[93];
        f[1] = f[2] = 1;
        for(int i = 3; i <= 92; i++){
            f[i] = f[i - 1] + f[i - 2];
        }
        while(test-- > 0){
            System.out.println(f[sc.nextInt()]);
        }
    }
}
