package edu.uchicago.gerber._01control;

import java.util.ArrayList;
import java.util.Scanner;


/**
 Name your source files according to its Programming Exercise identifier, except replace the period with underscore.
 For example, if the Programming Exercise identifier is P1.15, then name your java source file P1_15
 */
public class E2_4 {

    public static void main(String[] args) {

        //Write a program that prompts the user for two integers and then prints

        //pseudocode
        //get two integer
            //ask user for integer value or type quit to exit
            //store integer value in two variable
        //print the required value


        Scanner scan = new Scanner(System.in);
        //use the wrapper class Integer. Use diamond notation from Java7 and omit the right-hand "Integer" if you want
        int first;
        int second;

        while(true){
            try {
                System.out.print("Type first integer value or \"quit\" to exit:");
                //any value that is not an integer (including "quit") will throw an exception, which breaks out of the loop
                first = scan.nextInt();
                System.out.print("Type second integer value or \"quit\" to exit:");
                //any value that is not an integer (including "quit") will throw an exception, which breaks out of the loop
                second = scan.nextInt();

//            • The sum
//            • The difference
//            • The product
//            • The average
//            • The distance (absolute value of the difference)
//            • The maximum (the larger of the two)
//            • The minimum (the smaller of the two)
                System.out.println("The sum:" + getSum(first, second));
                System.out.println("The difference:" + getDifference(first, second));
                System.out.println("The Product:" + getProduct(first, second));
                System.out.println("The Average:" + getAvarage(first, second));
                System.out.println("The distance:" + getDistance(first, second));
                System.out.println("The Maximum:" + getMax(first, second));
                System.out.println("The Minimum:" + getMin(first, second));

            } catch ( Exception e) {
                return;
            }
        }

    }

    private static String getMin(int first, int second) {
        return ""+Math.min(first, second);
    }

    private static String getMax(int first, int second) {
        return ""+Math.max(first,second);
    }

    private static String getDistance(int first, int second) {
        return ""+Math.abs(first-second);
    }

    private static String getAvarage(int first, int second) {
        return ""+(first+second)/2.0;
    }

    private static String getProduct(int first, int second) {
        return ""+first*second;
    }

    private static String getDifference(int first, int second) {
        return ""+(first-second);
    }

    private static String getSum(int first, int second) {
        return ""+(first+second);
    }
}
