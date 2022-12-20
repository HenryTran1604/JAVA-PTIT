/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.Stack;

/**
 *
 * @author admin
 */
public class Data {
    
    public static void main(String[] args) throws FileNotFoundException, IOException {
        FileOutputStream fos = new FileOutputStream("DATA2.in");
        ObjectOutputStream oos = new ObjectOutputStream(fos);
        ArrayList <Integer> list = new ArrayList<>();
        list.add(2);
        list.add(2);
        list.add(4);
        list.add(19);
        list.add(107);
        oos.writeObject(list);
        oos.close();
        fos.close();
    }
}
