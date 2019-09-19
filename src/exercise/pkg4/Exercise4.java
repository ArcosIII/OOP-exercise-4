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
public class Exercise4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Circle C = new Circle();
        Circle C2 = new Circle(34);
        Rectangle R = new Rectangle();
        Rectangle R2 = new Rectangle(20, 8);
        System.out.println(C.toString());
        System.out.println(C2.toString());
        System.out.println(R.toString());
        System.out.println(R2.toString());
    }
    
}
