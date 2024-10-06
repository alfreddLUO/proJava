package edu.uchicago.gerber._01control;

import java.util.Scanner;


/**
 Name your source files according to its Programming Exercise identifier, except replace the period with underscore.
 For example, if the Programming Exercise identifier is P1.15, then name your java source file P1_15
 */
public class P3_7 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        //use the wrapper class Integer. Use diamond notation from Java7 and omit the right-hand "Integer" if you want
        double income;

        while(true) {
            try {
                System.out.println("Type double value or \"quit\" to exit:");
                income = scan.nextDouble();
                double tax = 0;

                if (income > 500000) {
                    tax += (income - 500000) * 0.06;
                    income = 500000;
                }
                if (income > 250000) {
                    tax += (income - 250000) * 0.05;
                    income = 250000;
                }
                if (income > 100000) {
                    tax += (income - 100000) * 0.04;
                    income = 100000;
                }
                if (income > 75000) {
                    tax += (income - 75000) * 0.03;
                    income = 75000;
                }
                if (income > 50000) {
                    tax += (income - 50000) * 0.02;
                    income = 50000;
                }
                tax += income * 0.01;

                System.out.println("The total income tax is: " + tax);


            } catch (Exception e) {
                return;
            }
        }

    }



}
