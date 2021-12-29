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
//Adithya Krishnan
//Java Task 6-to check if a number is +ve,-ve,0.
import java.util.Scanner;
public class Tasksix {
    public static void main(String args[]){
        int num;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter an integer: ");
        num=sc.nextInt();
        if(num>0)
            System.out.println("Positive");
        else if(num<0)
            System.out.println("Negative");
        else
             System.out.println("0");
        sc.close();   
    }   
}