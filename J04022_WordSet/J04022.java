/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package J04022_WordSet;

import java.util.Scanner;
import java.util.TreeSet;

/**
 *
 * @author admin
 */
class WordSet{
    private TreeSet <String> set;

    public WordSet(TreeSet<String> set) {
        this.set = set;
    }
    
    public WordSet(String s){
        set = new TreeSet<>();
        s = s.trim();
        String[] arr = s.split("\\s+");
        for(String x : arr)
            set.add(x.toLowerCase());
    }
    public WordSet union(WordSet other){
        TreeSet <String> tmp = new TreeSet<>();
        for(String x : this.set){
            tmp.add(x);
        }
        for(String x : other.set){
            tmp.add(x);
        }
        return new WordSet(tmp);
    }
    public WordSet intersection(WordSet other){
        TreeSet <String> tmp = new TreeSet<>();
        for(String x : this.set){
            if(other.set.contains(x)){
                tmp.add(x);
            }
        }
        return new WordSet(tmp);
    }
    
    @Override
    public String toString(){
        String ans = "";
        for(String x : this.set){
            ans += x + " ";
        }
        return ans;
    }
}
public class J04022 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        WordSet s1 = new WordSet(in.nextLine());
        WordSet s2 = new WordSet(in.nextLine());
        System.out.println(s1.union(s2));
        System.out.println(s1.intersection(s2));
    }
}

