/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package J04008_ChuViTamGiac;

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

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }
    
    public double distance(Point secondPoint){
        return Math.sqrt((this.x - secondPoint.x) * (this.x - secondPoint.x) + (this.y - secondPoint.y) * (this.y - secondPoint.y)); 
    }
    
    private static double distance(Point p1, Point p2){
        return Math.sqrt((p1.x - p2.x) * (p1.x - p2.x) + (p1.y - p2.y) * (p1.y - p2.y)); 
    }
    
    @Override
    public String toString(){
        return this.x + " " + this.y;
    }
}
class Triangle{
    private double d1, d2, d3;

    public Triangle(Point p1, Point p2, Point p3) {
        this.d1 = p1.distance(p2);
        this.d2 = p1.distance(p3);
        this.d3 = p2.distance(p3);
    }
    public boolean isValid(){
        if(this.d1 + this.d2 > this.d3 && this.d1 + this.d3 > this.d2 && this.d2 + this.d3 > this.d1)
            return true;
        return false;
    }
    
    public double Parameter(){
        return this.d1 + this.d2 + this.d3;
    }
    @Override
    public String toString(){
        return String.format("%.3f", this.Parameter());
    }
}
public class J04008 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            Point p1 = new Point(sc.nextDouble(), sc.nextDouble());
            Point p2 = new Point(sc.nextDouble(), sc.nextDouble());
            Point p3 = new Point(sc.nextDouble(), sc.nextDouble());
            Triangle tri = new Triangle(p1, p2, p3);
            if(tri.isValid()){
                System.out.println(tri);
            }
            else{
                System.out.println("INVALID");
            }
        }
    }
}
