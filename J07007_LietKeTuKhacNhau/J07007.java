/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package J07007_LietKeTuKhacNhau;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;
import java.util.TreeSet;

/**
 *
 * @author admin
 */
class WordSet{
    TreeSet <String> set;
    
    public WordSet(String s) throws FileNotFoundException{
        set = new TreeSet<>();
        Scanner sc = new Scanner(new File(s));
        while(sc.hasNext()){
            String w = sc.next();
            w = w.toLowerCase();
            set.add(w);
        }
    }
    
    @Override
    public String toString(){
        String ans = "";
        for(String x : this.set){
            ans += x + "\n";
        }
        return ans;
    }
}
public class J07007 {
    public static void main(String[] args) throws IOException {
        WordSet ws = new WordSet("VANBAN.in");
        System.out.println(ws);
    }
}
