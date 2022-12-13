/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package J07041_LietKeCapSo1;
// Đổi tên packet thành test rồi mới nộp
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.TreeSet;

/**
 *
 * @author :Tran Quang Huy
 */
public class Main {
    public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
        FileInputStream inputStream = new FileInputStream("DATA.in");
        ObjectInputStream ois = new ObjectInputStream(inputStream);
        ArrayList<Pair> list = (ArrayList<Pair>)ois.readObject();
        LinkedHashSet<Data> set = new LinkedHashSet<>();
        for(int i = 0; i < list.size(); i++){
            if(list.get(i).getFirst() < list.get(i).getSecond()){
                set.add(new Data(list.get(i).getFirst(), list.get(i).getSecond()));
            }
        }
        ArrayList<Data> res = new ArrayList<>(set);
        Collections.sort(res);
        for(Data x : res){
            System.out.println(x);
        }
    }
}
