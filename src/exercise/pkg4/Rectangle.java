/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package exercise.pkg4;

/**
 *
 * @author cabarronos_cis21035
 */
public class Rectangle {
     private float length,width;
     
     
     public Rectangle(){
         this.length = 1;
         this.width = 1;
     }
     public Rectangle(float length,float width){
         this.length = length;
         this.width = width;
     }
     public float getLength(){
         return length;
     }
     public void setlength(float length){
         this.length = length;
     }
     public float getWidth(){
         return width;
     }
     public void setWidth(float width){
         this.width = width;
     }
     public double getArea(){
         double area = this.length * this.width;
         return area;
     }
     public double getPerimeter(){
         double peri = (this.length *2) + (this.width*2);
         return peri;
     }
     public String toString(){
         return "Rectangle [length = " + this.length + ",width = " + this.width + "]";
     }
}
