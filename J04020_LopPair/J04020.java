/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package J04020_LopPair;

import java.util.Scanner;

/**
 *
 * @author admin
 */
class Pair <K, V>{
    private K first;
    private V second;

    public Pair(K first, V second) {
        this.first = first;
        this.second = second;
    }

    public K getFirst() {
        return first;
    }

    public V getSecond() {
        return second;
    }
    public boolean isPrime(){
        int n = (Integer)(this.first);
        for(int i = 2; i <= Math.sqrt(n); i++){
            if(n % i == 0)
                return false;
        }
        int m = (Integer)(this.second);
        for(int i = 2; i <= Math.sqrt(m); i++){
            if(m % i == 0)
                return false;
        }
        return n > 1 && m > 1;
    }
    @Override
    public String toString(){
        return this.first + " " + this.second;
    }
}
public class J04020 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int n = sc.nextInt();
            boolean check = false;
            for(int i = 2; i <= 2*Math.sqrt(n); i++){
                Pair<Integer, Integer> p = new Pair<>(i, n-i);
                if(p.isPrime()){
                    System.out.println(p);
                    check = true;
                    break; 
                }
            }
            if(!check) System.out.println(-1);
        }
    }
}
