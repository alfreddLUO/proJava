package edu.uchicago.gerber._01control;

import java.util.Scanner;


/**
 Name your source files according to its Programming Exercise identifier, except replace the period with underscore.
 For example, if the Programming Exercise identifier is P1.15, then name your java source file P1_15
 */
public class E2_6 {

    public static void main(String[] args) {

        //Write a program that prompts the user for a measurement in meters and then converts it to miles, feet, and inches.

        //pseudocode
        //get two integer
            //ask user for integer value or type quit to exit
            //store integer value into variable
        //print the required value


        Scanner scan = new Scanner(System.in);
        //use the wrapper class Integer. Use diamond notation from Java7 and omit the right-hand "Integer" if you want
        double meters;

        try {
            System.out.print("Type double value or \"quit\" to exit:");
            meters = scan.nextDouble();

            System.out.println("Measurements in miles: " + getMiles(meters));
            System.out.println("Measurements in feet: " + getFeet(meters));
            System.out.println("Measurements in inches: " + getInches(meters));


        } catch ( Exception e) {
            return;
        }

    }

    private static String getMiles(double meters) {
        return ""+meters*0.000621371;
    }

    private static String getFeet(double meters) {
        return ""+meters*3.28084;
    }

    private static String getInches(double meters) {
        return ""+meters*39.3701;
    }


}
