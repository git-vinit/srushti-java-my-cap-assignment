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
//Adithya Krishnan-Task 7-Add 2 matrices
import java.util.Scanner;
public class Add2matrices {
    public static void main(String args[]){
        int m,n,i,j;
        Scanner sc=new Scanner(System.in);
        System.out.println("Rows: ");
        m=sc.nextInt();
        System.out.println("\nColumns: ");
        n=sc.nextInt();
        int A[][]=new int[m][n];
        int B[][]=new int[m][n];
        int C[][]=new int[m][n];
        System.out.println("Enter 1st matrix: ");
        for(i=0;i<m;i++)
            for(j=0;j<n;j++)
                A[i][j]=sc.nextInt();
        System.out.println("Enter 2nd matrix: ");
        for(i=0;i<m;i++)
            for(j=0;j<n;j++)
                B[i][j]=sc.nextInt(); 
        sc.close();
        for(i=0;i<m;i++)
            for(j=0;j<n;j++)
                C[i][j]=A[i][j]+B[i][j];
        System.out.println("Sum of 2 matrices is: ");
        for(i=0;i<m;i++)
          {  
            for(j=0;j<n;j++)
                System.out.print(C[i][j]+ " ");
                System.out.print("\n");
          }    }  }
