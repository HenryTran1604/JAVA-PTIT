/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package J04018_SoPhuc;

import java.util.Scanner;

/**
 *
 * @author admin
 */
class SoPhuc{
    private int thuc, ao;

    public SoPhuc(int thuc, int ao) {
        this.thuc = thuc;
        this.ao = ao;
    }
    public static SoPhuc add(SoPhuc a, SoPhuc b) {
        return new SoPhuc(a.thuc + b.thuc, a.ao + b.ao);
    }
    // (a + bi)(c + di) = ac - bd + ad + bc
    public static SoPhuc mul(SoPhuc a, SoPhuc b){
        int t = a.thuc*b.thuc - a.ao * b.ao;
        int s = a.thuc * b.ao + a.ao * b.thuc;
        return new SoPhuc(t, s);
    }
    @Override
    public String toString(){
        return this.thuc + " + " + this.ao + "i";
    }
    
}
public class J04018 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            SoPhuc a = new SoPhuc(sc.nextInt(), sc.nextInt());
            SoPhuc b = new SoPhuc(sc.nextInt(), sc.nextInt());
            SoPhuc res1 = SoPhuc.mul(a, SoPhuc.add(a, b));
            SoPhuc res2 = SoPhuc.mul(SoPhuc.add(a, b), SoPhuc.add(a, b));
            System.out.println(res1 + ", " + res2);
        }
    }
}
