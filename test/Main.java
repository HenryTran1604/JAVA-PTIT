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
import java.util.Collections;
import java.util.Comparator;
import java.util.Date;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;

/**
 *
 * @author :Tran Quang Huy
 */

public class Main {
    
    public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException, ParseException {
        Date d = new SimpleDateFormat("dd/MM/yyyy").parse("16/9/1999");
        LocalDate ld = LocalDate.from(d.toInstant().atZone(ZoneId.systemDefault())).plusDays(100);
        Date n = Date.from(ld.atStartOfDay(ZoneId.systemDefault()).toInstant());
        System.out.println(n);
    }
}
