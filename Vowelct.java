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
//Task 8-Count no of vowels in a string
import java.util.Scanner;
public class Vowelct {
    public static void main(String args[]){
        int vowelct = 0;
        int i;
        String str;
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("String: ");
            str = sc.nextLine();
            sc.close();
        }
        for(i=0;i<str.length();i++)
        {
            char ch=str.charAt(i);
            switch(ch){
                case 'a':
                case 'e':
                case 'i':
                case 'o':
                case 'u':
                case 'A':
                case 'E':
                case 'I':
                case 'O':
                case 'U': vowelct++;
                          break;          
            }   
        } 
        System.out.println("No.of vowels in the string: "+vowelct);
    }

   