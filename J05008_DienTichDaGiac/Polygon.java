/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package J05008_DienTichDaGiac;

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
