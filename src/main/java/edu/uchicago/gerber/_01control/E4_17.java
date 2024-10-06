package edu.uchicago.gerber._01control;

import java.util.Scanner;


/**
 Name your source files according to its Programming Exercise identifier, except replace the period with underscore.
 For example, if the Programming Exercise identifier is P1.15, then name your java source file P1_15
 */
public class E4_17 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        //use the wrapper class Integer. Use diamond notation from Java7 and omit the right-hand "Integer" if you want
        int num;

        while(true){
            try {
                System.out.print("Enter a number: ");
                num = scan.nextInt();

                if (num == 0) {
                    System.out.println("0");
                } else {
                    StringBuilder res = new StringBuilder();

                    while (num > 0) {
                        int remainder = num % 2;
                        res.insert(0, remainder);
                        num = num / 2;
                    }

                    System.out.println("Binary digits: " + res.toString());
                }


            } catch ( Exception e) {
                return;
            }
        }

    }


}
