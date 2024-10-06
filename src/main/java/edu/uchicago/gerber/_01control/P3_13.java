package edu.uchicago.gerber._01control;

import java.util.Scanner;


/**
 Name your source files according to its Programming Exercise identifier, except replace the period with underscore.
 For example, if the Programming Exercise identifier is P1.15, then name your java source file P1_15
 */
public class P3_13 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        //use the wrapper class Integer. Use diamond notation from Java7 and omit the right-hand "Integer" if you want
        int num;

        while(true){
            try {
                String[] THOUSANDS = {"", "M", "MM", "MMM"};
                String[] HUNDREDS = {"", "C", "CC", "CCC", "CD", "D", "DC", "DCC", "DCCC", "CM"};
                String[] TENS = {"", "X", "XX", "XXX", "XL", "L", "LX", "LXX", "LXXX", "XC"};
                String[] ONES = {"", "I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX"};

                System.out.print("Please enter a number :");
                num = scan.nextInt();

                if(num>=1&&num<=3999) {
                    String roman = THOUSANDS[num / 1000] + HUNDREDS[(num % 1000) / 100] + TENS[(num % 100) / 10] + ONES[num % 10];
                    System.out.println("The Roman numeral representation is: " + roman);
                } else {
                    System.out.println("Please enter a number :");
                }


            } catch ( Exception e) {
                return;
            }
        }

    }



}
