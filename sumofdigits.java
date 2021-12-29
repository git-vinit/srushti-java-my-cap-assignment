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
//Task 3-Sum of digits
import java.util.Scanner;
public class sumofdigits {
    public static void main(String args[]){
        int num;
        int i,sum=0,rem;
        Scanner sc=new Scanner(System.in);
        System.out.println("Number: ");
        num=sc.nextInt();
        while(num>0)
        {
            rem=num%10;
            sum=sum+rem;
            num=num/10;                    
        }
        sc.close();
        System.out.println("Sum of digits of number: "+sum);
    }   
}