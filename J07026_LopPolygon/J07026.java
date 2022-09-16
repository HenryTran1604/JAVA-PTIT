/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package J07026_LopPolygon;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 *
 * @author admin
 */
class Point{
    private double x, y;
    public Point(double x, double y){
        this.x = x;
        this.y = y;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }
    public static double distance(Point a, Point b){
        return Math.sqrt((a.x - b.x)*(a.x - b.x) + (a.y - b.y)*(a.y - b.y));
    }
    
}
class Polygon{
    private Point[] p;

    public Polygon(Point[] p) {
        this.p = p;
    }
    private static double triangleArea(Point a, Point b, Point c){
        double e1 = Point.distance(a, b);
        double e2 = Point.distance(a, c);
        double e3 = Point.distance(b, c);
        double p = (e1 + e2 + e3) / 2;
        double S = Math.sqrt(p*(p - e1)*(p - e2)*(p - e3));
        return S;
    }
    public String getArea(){
        double ans = 0;
        for(int i = 1; i < this.p.length - 1; i++){
            ans += Polygon.triangleArea(p[0], p[i], p[i+1]);
        }
        return String.format("%.3f", ans);
    }
}
public class J07026 {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner in = new Scanner(new File("POLYGON.in"));
        int t = in.nextInt();
        while(t-->0){
            int n = in.nextInt();
            Point p[] = new Point[n];
            for(int i = 0; i < n; i++){
                p[i] = new Point(in.nextInt(),in.nextInt());
            }
            Polygon poly = new Polygon(p);
            System.out.println(poly.getArea());
        }
    }
}
