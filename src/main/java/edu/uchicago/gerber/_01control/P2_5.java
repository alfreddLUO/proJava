package edu.uchicago.gerber._01control;

import java.util.Scanner;


/**
 Name your source files according to its Programming Exercise identifier, except replace the period with underscore.
 For example, if the Programming Exercise identifier is P1.15, then name your java source file P1_15
 */
public class P2_5 {

    public static void main(String[] args) {




        Scanner scan = new Scanner(System.in);
        //use the wrapper class Integer. Use diamond notation from Java7 and omit the right-hand "Integer" if you want
        double price;

        try {
            System.out.print("Type value or \"quit\" to exit:");
            //any value that is not an integer (including "quit") will throw an exception, which breaks out of the loop
            price = scan.nextDouble();
            printDollarsAndCents(price);
        } catch ( Exception e) {
            return;
        }

    }
    private static void printDollarsAndCents(double price){
        int dollars=(int) price;
        int cents=(int) ((price-dollars)*100+0.5);
        System.out.println("Dollars: " + dollars);
        System.out.println("Cents: " + cents);
    }

}
