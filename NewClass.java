/* Adithya Krishnan Java Task 5-To express minutes in years and days
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package helloworld;

/**
 *
 * @author User
 */
//*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author User
 */
//Adithya Krishnan
//Task-5-To express minutes in terms of days and years
import java.util.Scanner;
public class Mincnvtyrday {
    public static void main(String args[]) {
        double minutesInYear = 60 * 24 * 365;

        Scanner sc = new Scanner(System.in);

        System.out.print("Input the number of minutes: ");

        double min = sc.nextDouble();

        long years = (long) (min / minutesInYear);
        int days = (int) (min / 60 / 24) % 365;

        System.out.println((int) min + " minutes is approximately " + years + " years and " + days + " days");
    }
}
