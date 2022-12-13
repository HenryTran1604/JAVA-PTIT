/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CreateBinaryFile;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;

/**
 *
 * @author :Tran Quang Huy
 */
class Pair implements Serializable, Comparable<Pair>{
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
public class ArrayListBinary {
    public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
        FileOutputStream fileOutputStream = new FileOutputStream("DATA.in");
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
        ArrayList <String> list = new ArrayList<>();
        list.add("Lu thi chanh");
        list.add("Lung khau nin");
        list.add("Lu khau nin");
        objectOutputStream.writeObject(list);
        fileOutputStream.close();
    }
}
