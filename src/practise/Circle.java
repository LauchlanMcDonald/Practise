/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practise;

/**
 *
 * @author Lauchlan
 */
public class Circle {
    
    public static double getArea(double radius){
        return Math.PI * radius * radius;
        
    }
    public static double getDiameter(double radius){
        return radius + radius;
    
    }
    public static double getCircumference(double radius){
        return 2.0 * Math.PI * radius;
    }
   
    
    
}
