/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package helloworld;
/*
 * @author User
 */
//Adithya Krishnan
//Task 10-Display cube of numbers upto the entered integer
import java.util.Scanner;
public class task10dispcube {
    public static void main(String args[]){
        int maxno,i;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number till which cube will be displayed: ");
        maxno=sc.nextInt();
        sc.close();
        for(i=1;i<=maxno;i++)
            System.out.println(i+"-"+i*i*i);
    }
}