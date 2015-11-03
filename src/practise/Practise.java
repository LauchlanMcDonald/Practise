/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practise;

import javax.swing.JOptionPane;

/**
 *
 * @author Lauchlan
 */
public class Practise {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

//        testCircle();
//        testDiameter();
//        testCircumference();
//        testUserCircle();
//        testUserRectangle();
        testPerimiter();
    }

//    private static void testCircle() {
//        double myRad = Circle.getArea(1.0);
//        System.out.println("the answer is " + myRad);
//    }
//
//    private static void testDiameter() {
//        double myDiameter = Circle.getDiameter(7);
//        System.out.println("the diameter is " + myDiameter);  
//   
//    }
//
//    private static void testCircumference() {
//        double myCircum = Circle.getCircumference(8.0);
//        System.out.println("the circumference is " + myCircum);
//    }
//
//    private static void testUserCircle() {
//        double aRadius = Double.valueOf( JOptionPane.showInputDialog("Please enter a radius"));
////        System.out.println("the real answer is " + aRadius);
//        
//        System.out.println("Everything i know about your circle:");
//        System.out.println(" Radius = " + aRadius);
//        System.out.println(" Diameter = " + Circle.getDiameter(aRadius));
//        System.out.println(" Circumference = " + Circle.getCircumference(aRadius));
//        System.out.println(" Area = " + Circle.getArea(aRadius));
//        
//        
//    private static void testUserRectangle() {
//        double myWidth = Double.valueOf(JOptionPane.showInputDialog("Please enter a width"));
//        double myHeight = Double.valueOf(JOptionPane.showInputDialog("Please enter a height"));
//        System.out.println("the width is " + myWidth);
//        System.out.println("the height is " + myHeight);
//
//        double myArea = Rectangle.findArea(myHeight, myWidth);
//        System.out.println("the area of the rectangle is " + myArea);
    
    private static void testPerimeter() {
        double myWidth = Double.valueOf(JOptionPane.showInputDialog("Please enter a width"));
        double myHeight = Double.valueOf(JOptionPane.showInputDialog("Please enter a height"));
        System.out.println("the perimiter is " + myWidth + myHeight);
        

    }

    private static void testPerimiter() {
        
    }
}
