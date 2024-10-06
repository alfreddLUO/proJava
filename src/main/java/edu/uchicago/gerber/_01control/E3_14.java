package edu.uchicago.gerber._01control;

import java.util.Scanner;


/**
 Name your source files according to its Programming Exercise identifier, except replace the period with underscore.
 For example, if the Programming Exercise identifier is P1.15, then name your java source file P1_15
 */
public class E3_14 {

    public static void main(String[] args) {




        Scanner scan = new Scanner(System.in);
        //use the wrapper class Integer. Use diamond notation from Java7 and omit the right-hand "Integer" if you want

        try {
            System.out.print("Enter the month: ");
            int month = scan.nextInt();

            System.out.print("Enter the day: ");
            int day = scan.nextInt();

            String season = "";

            if (month == 1 || month == 2 || month == 3) {
                season = "Winter";
            } else if (month == 4 || month == 5 || month == 6) {
                season = "Spring";
            } else if (month == 7 || month == 8 || month == 9) {
                season = "Summer";
            } else if (month == 10 || month == 11 || month == 12) {
                season = "Fall";
            }

            if (month % 3 == 0 && day >= 21) {
                if (season.equals("Winter")) {
                    season = "Spring";
                } else if (season.equals("Spring")) {
                    season = "Summer";
                } else if (season.equals("Summer")) {
                    season = "Fall";
                } else if (season.equals("Fall")) {
                    season = "Winter";
                }
            }

            System.out.println("The season is: " + season);
        } catch ( Exception e) {
            return;
        }

    }


}
