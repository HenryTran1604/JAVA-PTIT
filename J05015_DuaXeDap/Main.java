/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package J05015_DuaXeDap;

import java.text.ParseException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author :Tran Quang Huy
 */
public class Main {
    public static void main(String[] args) throws ParseException {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        ArrayList <Racer> list = new ArrayList<>();
        while(n-- > 0){
            list.add(new Racer(sc.nextLine(), sc.nextLine(), sc.nextLine()));
        }
        Collections.sort(list, new Comparator<Racer>(){
            @Override
            public int compare(Racer o1, Racer o2) {
                return o1.getDenDich().compareTo(o2.getDenDich());
            }
        });
        for(Racer x : list){
            System.out.println(x);
        }
    }
}
