// Java program to read numbers from console and find average value of them
package com.average;

import java.util.Scanner;

// Class Main
public class Main {

    // Method main to run java program
    public static void main(String[] args) {

        //Declare an object and initialize with predefined standard input
        Scanner scanner = new Scanner(System.in);

        // Creating local variables for summing and mean value
        int sum = 0;
        int mean = 0;
        int count = 0;

        // Check if int value is available
        while (scanner.hasNextInt()){
            int number = scanner.nextInt();
            System.out.println("Number = " + number);
            sum += number;
            count++;
        }

        // Finding mean value
        mean = sum / count;

        // Printing mean value to console
        System.out.println("Mean = " + mean);

    }
}