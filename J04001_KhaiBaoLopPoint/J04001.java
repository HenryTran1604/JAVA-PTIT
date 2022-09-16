/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package J04001_KhaiBaoLopPoint;

import java.util.Scanner;

/**
 *
 * @author admin
 */
class Point{
    private double x, y;

    public Point() {
    }

    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }
    
    public Point(Point p){
        this.x = p.x;
        this.y = p.y;
    }
    
    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }
    
    public double distance(Point secondPoint){
        return Math.sqrt((this.x - secondPoint.x)*(this.x - secondPoint.x) + (this.y - secondPoint.y)*(this.y - secondPoint.y));
    }
    
    public static double distance(Point p1, Point p2){
        return Math.sqrt((p1.x - p2.x) * (p1.x - p2.x) + (p1.y - p2.y)*(p1.y - p2.y));
    }
    
    @Override
    public String toString(){
        return this.x + " " + this.y;
    }
}
public class J04001 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            double a = sc.nextDouble();
            double b = sc.nextDouble();
            double c = sc.nextDouble();
            double d = sc.nextDouble();
            Point p1 = new Point(a, b);
            Point p2 = new Point(c, d);
            System.out.format("%.4f\n", p1.distance(p2));
        }
    }
}
