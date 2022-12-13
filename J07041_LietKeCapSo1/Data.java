/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package J07041_LietKeCapSo1;

import java.io.Serializable;

/**
 *
 * @author :Tran Quang Huy
 */
public class Data implements Serializable, Comparable<Data>{
    private int first, second;

    public Data(int first, int second) {
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
    public int compareTo(Data o) {
        return this.first - o.first;
    }
    public String toString(){
        return "(" + first + ", " + second + ")";
    }

    @Override
    public boolean equals(Object obj) {
        if(this == obj) return true;
        if(obj == null) return false;
        if(obj instanceof Data){
            Data dat = (Data) obj;
            return this.first == dat.first && this.second == dat.second;
        }
        return false;
    }
    
}
