/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package J04021_lopIntset;

import java.util.Scanner;
import java.util.TreeSet;

/**
 *
 * @author admin
 */
class IntSet{
    TreeSet <Integer> set;

    public IntSet(TreeSet<Integer> set) {
        this.set = set;
    }

    public IntSet(int[] a) {
        this.set = new TreeSet<>();
        for(int i = 0; i < a.length; i++){
            this.set.add(a[i]);
        }
    }
    
    public IntSet union(IntSet other){
        TreeSet <Integer> tmp = new TreeSet<>();
        for(int x : this.set){
            tmp.add(x);
        }
        for(int x : other.set){
            tmp.add(x);
        }
        return new IntSet(tmp);
    }
    
    @Override
    public String toString(){
        String ans = "";
        for(int x : this.set)
            ans += x + " ";
        return ans;
    }
    
}
public class J04021 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), m = sc.nextInt(), a[] = new int[n], b[] = new int[m];
        for(int i = 0; i<n; i++) a[i] = sc.nextInt();
        for(int i = 0; i<m; i++) b[i] = sc.nextInt();
        IntSet s1 = new IntSet(a);
        IntSet s2 = new IntSet(b);
        IntSet s3 = s1.union(s2);
        System.out.println(s3);
    }
}
