/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package exercise.pkg4;
import java.lang.Math;
/**
 *
 * @author cabarronos_cis21035
 */
public class Circle {
    private double radius;
     
     
     public Circle(){
         this.radius = 1;
     }
     public Circle(double radius){
         this.radius = radius;
     }
     public double getRadius(){
         return radius;
     }
     public void setRadius(double radius){
         this.radius = radius;
     }
     public double getArea(){
         double area = (this.radius * this.radius) * Math.PI;
         return area;
     }
     public double getCircumference(){
         double circ = (this.radius * 2) * Math.PI;
         return circ;
     }
     public String toString(){
         return "Circle [radius = " + this.radius + "]";
     }
}

