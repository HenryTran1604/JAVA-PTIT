/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package J07041_LietKeCapSo1;

import java.io.*;

/**
 *
 * @author :Tran Quang Huy
 */
public class Pair implements Serializable, Comparable<Pair>{
    private int first, second;

    public Pair(int first, int second) {
        this.first = first;
        this.second = second;
    }

    public int getFirst() {
        return first;
    }

    public int getSecond() {
        return second;
    }
    
    @Override
    public int compareTo(Pair o) {
        return this.first - o.first;
    }
    public String toString(){
        return "(" + first + ", " + second + ")";
    }
}
