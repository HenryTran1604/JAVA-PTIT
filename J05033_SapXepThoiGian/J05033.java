/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package J05033_SapXepThoiGian;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

/**
 *
 * @author admin
 */
class Time{
    private int hour, min, sec;

    public Time(int hour, int min, int sec) {
        this.hour = hour;
        this.min = min;
        this.sec = sec;
    }
    public int getTotalSec(){
        return this.hour * 3600 + this.min * 60 + this.sec;
    }
    
    @Override
    public String toString(){
        return this.hour + " " + this.min + " " + this.sec;
    }
}
class sortBySec implements Comparator<Time>{
    public int compare(Time a, Time b){
        return a.getTotalSec() - b.getTotalSec();
    }
}
public class J05033 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Time[] a = new Time[n];
        for(int i = 0; i < n; i++){
            a[i] = new Time(sc.nextInt(), sc.nextInt(), sc.nextInt());
        }
        Arrays.sort(a, new sortBySec());
        for(Time x : a){
            System.out.println(x);
        }
    }
}
