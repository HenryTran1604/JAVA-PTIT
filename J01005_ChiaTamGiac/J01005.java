/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package J01005_ChiaTamGiac;
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
public class J01005 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int test = sc.nextInt();
        while(test-- > 0){
            int n = sc.nextInt(), H = sc.nextInt();
            for(int i = 1; i < n; i++){
                System.out.format("%.6f ", H*Math.sqrt(i*1.0/n));
            }
            System.out.println("");
        }
    }
}
