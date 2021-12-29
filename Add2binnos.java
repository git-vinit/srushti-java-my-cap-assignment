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
//Task 2-to add 2 binary numbers
import java.util.Scanner;
public class Add2binnos {
    public static void main(String args[]){
        long b1,b2;
        int i=0,carry=0;
        int []sum=new int[10];
        Scanner sc=new Scanner(System.in);
        System.out.println("Bin1: ");
        b1=sc.nextLong();
        System.out.println("Bin2: ");
        b2=sc.nextLong();
        while(b1!=0||b2!=0)
        {
            sum[i++]=(int)((b1%10+b2%10+carry)%2);
            carry=(int)((b1%10+b2%10+carry)/2);
            b1/=10;
            b2/=10;
        }
        if(carry!=0) sum[i++]=carry;
        i--;
        System.out.println("Sum: ");
        while(i>=0)
            System.out.print(sum[i--]);
       System.out.print("\n"); 
    }    
}