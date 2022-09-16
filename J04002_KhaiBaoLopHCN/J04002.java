/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package J04002_KhaiBaoLopHCN;

import java.util.Scanner;

/**
 *
 * @author admin
 */
class Rectangle{
    private double width, height;
    private String color;

    public Rectangle() {
    }

    public Rectangle(double width, double height, String color) {
        this.width = width;
        this.height = height;
        this.color = color;
    }
    public double getWidth(){
        return this.width;
    }
    
    public void setWidth(double width){
        this.width = width;
    }
    
    public double getHeight(){
        return this.height;
    }
    
    public void setHeight(double height){
        this.height = height;
    }
    
    public String getColor(){
        return this.color;
    }
    
    public void setColor(String color){
        this.color = color;
    }
    
    public double findArea(){
        return this.width * this.height;
    }
    
    public double findPerimeter(){
        return 2*(this.width + this.height);
    }
    @Override
    public String toString(){
        return String.format("%.0f", this.findPerimeter()) + " " + String.format("%.0f", this.findArea()) + " " + this.color;
    }
}
public class J04002 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double w = sc.nextDouble();
        double h = sc.nextDouble();
        String c = sc.next();
        if(w <= 0 || h <= 0){
            System.out.println("INVALID");
        }
        else{
            StringBuilder fc = new StringBuilder();
            fc.append(Character.toUpperCase(c.charAt(0)));
            for(int i = 1; i < c.length(); i++){
                fc.append(Character.toLowerCase(c.charAt(i)));
            }
            Rectangle r = new Rectangle(w, h, fc.toString());
            System.out.println(r);
        }
    }
}
