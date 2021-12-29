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
//Task 9-Smallest number among 3 numbers
import java.util.Scanner;
public class Task9samllestno {
    public static void main(String args[]){
        int num1,num2,num3,small1,small2;
        Scanner sc=new Scanner(System.in);
        System.out.println("Num1:");
        num1=sc.nextInt();
        System.out.println("Num2:");
        num2=sc.nextInt();
        System.out.println("Num3:");
        num3=sc.nextInt();
        small1=num1<num2?num1:num2;
        small2=small1<num3?small1:num3;
        sc.close();
        System.out.println("Smallest of 3 nos is: "+small2);
    }
    
}
