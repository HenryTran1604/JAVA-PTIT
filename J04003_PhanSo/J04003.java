/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package J04003_PhanSo;

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
    public static long gcd(long a, long b){
        if(b == 0) return a;
        return gcd(b, a % b);
    }
    public void toiGian(){
        long gcd = PhanSo.gcd(tuSo, mauSo);
        this.tuSo /= gcd;
        this.mauSo /= gcd;
    }
    @Override
    public String toString(){
        return this.tuSo + "/" + this.mauSo;
    }
}
public class J04003 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long tu = sc.nextLong(), mau = sc.nextLong();
        PhanSo ps = new PhanSo(tu, mau);
        ps.toiGian();
        System.out.println(ps);
    }
}
