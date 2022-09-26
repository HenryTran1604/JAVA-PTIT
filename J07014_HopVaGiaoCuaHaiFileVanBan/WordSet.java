/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package J07014_HopVaGiaoCuaHaiFileVanBan;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.TreeSet;

/**
 *
 * @author :Tran Quang Huy
 */
public class WordSet {
    private TreeSet <String> set;
    public WordSet(String s) throws FileNotFoundException{
        this.set = new TreeSet<>();
        Scanner sc = new Scanner(new File(s));
        while(sc.hasNext()){
            this.set.add(sc.next().toLowerCase());
        }
    }

    public WordSet(TreeSet<String> set) {
        this.set = set;
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
            if(other.set.contains(x))
                tmp.add(x);
        }
        return new WordSet(tmp);
    }
    @Override
    public String toString(){
        String res = "";
        for(String x : this.set){
            res += x + " ";
        }
        return res;
    }
}
