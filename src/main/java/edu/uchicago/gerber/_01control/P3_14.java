package edu.uchicago.gerber._01control;

import java.util.Scanner;


/**
 Name your source files according to its Programming Exercise identifier, except replace the period with underscore.
 For example, if the Programming Exercise identifier is P1.15, then name your java source file P1_15
 */
public class P3_14 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        //use the wrapper class Integer. Use diamond notation from Java7 and omit the right-hand "Integer" if you want
        int num;

        while(true){
            try {

                System.out.print("Please enter a year :");
                int year = scan.nextInt();

                if((year%4==0&&year%100!=0)||year%400==0){
                    System.out.println(year+" is a leap year");
                } else{
                    System.out.println(year+" is not a leap year");
                }


            } catch ( Exception e) {
                return;
            }
        }

    }



}
