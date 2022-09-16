/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package J08025_QuayHinhVuong;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

/**
 *
 * @author admin
 */
class State{
    private int[] a;
    private int step;

    public State(int[] a, int step) {
        this.a = a;
        this.step = step;
    }

    public int[] getA() {
        return a;
    }

    public int getStep() {
        return step;
    }
    
    public boolean compare(State other){
        for(int i = 0; i < 6; i++){
            if(this.a[i] != other.a[i])
                return false;
        }
        return true;
    }
    public State RotateLeftSide(){
        int[] l = this.getA().clone();
        l[0] = this.getA()[3];
        l[1] = this.getA()[0];
        l[3] = this.getA()[4];
        l[4] = this.getA()[1];
        return new State(l, this.getStep() + 1);
    }
    public State RotateRightSide(){
        int[] r = this.getA().clone();
        r[1] = this.getA()[4];
        r[2] = this.getA()[1];
        r[4] = this.getA()[5];
        r[5] = this.getA()[2];
        return new State(r, this.getStep() + 1);
    }
}
public class J08025 {
    private static int solve(State src, State des) {
        Queue <State> q = new LinkedList<>();
        q.add(src);
        while(!q.isEmpty()){
            State top = q.poll();
            if(top.compare(des)){
                return top.getStep();
            }
            State left = top.RotateLeftSide();
            if(left.compare(des)){
                return left.getStep();
            }
            q.add(left);
            State right = top.RotateRightSide();
            if(right.compare(des)){
                return right.getStep();
            }
            q.add(right);
        }
        return 0;
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            int[] tmp1 = new int[6];
            for(int i = 0; i < 6; i++){
                tmp1[i] = sc.nextInt();
            }
            State src = new State(tmp1, 0);
            int[] tmp2 = new int[6];
            for(int i = 0; i < 6; i++){
                tmp2[i] = sc.nextInt();
            }
            State des = new State(tmp2, 0);
            System.out.println(solve(src, des));
        }
    }
}
