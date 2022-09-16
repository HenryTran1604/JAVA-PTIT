/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package J04004_TongPhanSO;

import java.util.Scanner;

/**
 *
 * @author admin
 */
class PhanSo{
    private long tuSo, mauSo;

    public PhanSo(long tuSo, long mauSo) {
        this.tuSo = tuSo;
        this.mauSo = mauSo;
    }

    public PhanSo() {
    }
    
    public static long gcd(long a, long b){
        if(b == 0)
            return a;
        return gcd(b, a % b);
    }
    public void rutGon(){
        long gcd = gcd(this.tuSo, this.mauSo);
        this.tuSo /= gcd;
        this.mauSo /= gcd;
    }
    public PhanSo add(PhanSo b){
        PhanSo c;
        long tu = this.tuSo * b.mauSo + this.mauSo * b.tuSo;
        long mau = this.mauSo * b.mauSo;
        c = new PhanSo(tu, mau);
        c.rutGon();
        return c;
    }
    
    @Override
    public String toString(){
        return this.tuSo + "/" + this.mauSo;
    }
}
public class J04004 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long a = sc.nextLong();
        long b = sc.nextLong();
        long c = sc.nextLong();
        long d = sc.nextLong();
        PhanSo p1 = new PhanSo(a, b);
        PhanSo p2 = new PhanSo(c, d);
        PhanSo sum = p1.add(p2);
        System.out.println(sum);
    }
}
