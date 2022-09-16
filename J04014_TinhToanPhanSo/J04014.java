/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package J04014_TinhToanPhanSo;

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

    public long getTuSo() {
        return tuSo;
    }

    public long getMauSo() {
        return mauSo;
    }
    public static long gcd(long a, long b){
        if(b == 0) return a;
        return gcd(b, a % b);
    }
    public void toiGian(){
        long g = PhanSo.gcd(this.tuSo, this.mauSo);
        this.tuSo /= g;
        this.mauSo /= g;
    }
    public static PhanSo mul(PhanSo a, PhanSo b){
        a.toiGian(); b.toiGian();
        long tu = a.getTuSo() * b.getTuSo();
        long mau = a.getMauSo() * b.getMauSo();
        long g = PhanSo.gcd(mau, tu);
        return new PhanSo(tu/g, mau/g);
    }
    public static PhanSo add(PhanSo a, PhanSo b){
        a.toiGian(); b.toiGian();
        long tu = a.getTuSo() * b.getMauSo() + b.getTuSo() * a.getMauSo();
        long mau = a.getMauSo() * b.getMauSo();
        long g = PhanSo.gcd(mau, tu);
        return new PhanSo(tu/g, mau/g);
    }
    @Override
    public String toString(){
        return this.tuSo + "/" + this.mauSo;
    }
}
public class J04014 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            PhanSo a = new PhanSo(sc.nextLong(), sc.nextLong());
            PhanSo b = new PhanSo(sc.nextLong(), sc.nextLong());
            PhanSo tmp1 = PhanSo.add(a, b);
            PhanSo res1 = PhanSo.mul(tmp1, tmp1);
            PhanSo res2 = PhanSo.mul(a, PhanSo.mul(b, res1));
            System.out.println(res1 + " " + res2);
        }
    }
}
