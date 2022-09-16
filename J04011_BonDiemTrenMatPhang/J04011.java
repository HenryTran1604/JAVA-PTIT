/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package J04011_BonDiemTrenMatPhang;

import java.util.Scanner;

/**
 *
 * @author admin
 */
class Point3D{
    private int x, y, z;

    public Point3D(int x, int y, int z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }
    
    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public int getZ() {
        return z;
    }
    public static boolean check(Point3D A, Point3D B, Point3D C, Point3D D) {
        Point3D vtAB = new Point3D(B.getX() - A.getX(), B.getY() - A.getY(), B.getZ() - A.getZ());
        Point3D vtAC = new Point3D(C.getX() - A.getX(), C.getY() - A.getY(), C.getZ() - A.getZ());
        Point3D vtAD = new Point3D(D.getX() - A.getX(), D.getY() - A.getY(), D.getZ() - A.getZ());
        Point3D mul = new Point3D(vtAB.getY()*vtAC.getZ() - vtAB.getZ()*vtAC.getY()
                            , vtAB.getZ()*vtAC.getX() - vtAB.getX()*vtAC.getZ()
                            , vtAB.getX()*vtAC.getY() - vtAB.getY()*vtAC.getX());
        int check = vtAD.getX()*mul.getX() + vtAD.getY()*mul.getY() + vtAD.getZ()*mul.getZ();
        if(check == 0){
            return true;
        }
        return false;
    }
    
}
public class J04011 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            Point3D p1 = new Point3D(sc.nextInt(),sc.nextInt(),sc.nextInt());
            Point3D p2 = new Point3D(sc.nextInt(),sc.nextInt(),sc.nextInt());
            Point3D p3 = new Point3D(sc.nextInt(),sc.nextInt(),sc.nextInt());
            Point3D p4 = new Point3D(sc.nextInt(),sc.nextInt(),sc.nextInt());

            if(Point3D.check(p1,p2,p3,p4)){
                System.out.println("YES");
            } else{
                System.out.println("NO");
            }
        }
    }
}
