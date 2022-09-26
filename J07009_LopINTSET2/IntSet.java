/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package J07009_LopINTSET2;

import java.util.TreeSet;

/**
 *
 * @author :Tran Quang Huy <HenryTran at github.com/Henrytran1604>
 */
public class IntSet {
    private TreeSet <Integer> set;

    public IntSet(TreeSet<Integer> set) {
        this.set = set;
    }
    public IntSet(int[] a){
        this.set = new TreeSet<>();
        for(int x : a){
            this.set.add(x);
        }
    }
    public IntSet intersection(IntSet other){
        TreeSet <Integer> tmp = new TreeSet<>();
        for(int x : this.set){
            if(other.set.contains(x)){
                tmp.add(x);
            }
        }
        return new IntSet(tmp);
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
        String res = "";
        for(int x : this.set){
            res += x + " ";
        }
        return res;
    }
}
