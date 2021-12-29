/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package helloworld;

/**
 *
 * @author User
 */
//Task 1-Find the area and perimeter of circle
import java.util.Scanner;
public class apcircle{
    public static void main(String args[]){
        double radius,area,perimeter;
        Scanner sc=new Scanner(System.in);
        System.out.println("Radius: ");
        radius=sc.nextFloat();
        area=3.14*radius*radius;
        perimeter=2.0*3.14*radius;
        System.out.println("Area: "+area+"\nPerimeter: "+perimeter);
    }
}