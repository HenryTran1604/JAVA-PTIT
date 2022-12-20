/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.ZoneId;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Collections;
import java.util.Comparator;
import java.util.Date;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;

/**
 *
 * @author :Tran Quang Huy
 */

public class Main {
    public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException, ParseException {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        Stack <Character> st = new Stack<>();
        for(int i = 0; i < s.length(); i++){
            if(st.empty()) st.push(s.charAt(i));
            else{
                char c = st.peek();
                if(c == s.charAt(i)){
                    st.pop();
                }
                else{
                    st.push(s.charAt(i));
                }
            }
        }
        if(st.size() == 0){
            System.out.println("Empty String");
        }
        else{
            StringBuilder sb = new StringBuilder();
            while (!st.empty()) {
                sb.append(st.pop());
            }
            System.out.println(sb.reverse());
        }
        
        
    }
}
