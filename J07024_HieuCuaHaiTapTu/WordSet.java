/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package J07024_HieuCuaHaiTapTu;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.TreeSet;

/**
 *
 * @author :Tran Quang Huy
 */
public class WordSet {
    private TreeSet<String> set;

    public WordSet(TreeSet set) {
        this.set = set;
    }
    
    public WordSet(String file) throws FileNotFoundException{
        Scanner sc = new Scanner(new File(file));
        this.set = new TreeSet<>();
        while(sc.hasNext()){
            this.set.add(sc.next().toLowerCase());
        }
    }
    public WordSet difference(WordSet other){
        TreeSet <String> tmp = new TreeSet<>();
        for(String x : this.set){
            if(!other.set.contains(x)){
                tmp.add(x);
            }
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
