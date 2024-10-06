package edu.uchicago.gerber._01control;

import java.util.Scanner;


/**
 Name your source files according to its Programming Exercise identifier, except replace the period with underscore.
 For example, if the Programming Exercise identifier is P1.15, then name your java source file P1_15
 */
public class E2_20 {

    public static void main(String[] args) {

        //Write a program that prints a Christmas tree, as shown below. Remember to use escape sequences

        //pseudocode




        try {
            for(int i=0;i<4;i++){
                for(int j=0;j<3-i;j++){
                    System.out.print(" ");
                }
                System.out.print("/");
                for(int k=0;k<i;k++){
                    System.out.print(" "+" ");
                }
                System.out.print("\\");
                System.out.println();
            }
            for(int i=0;i<8;i++){
                System.out.print("-");
            }
            for(int i=0;i<3;i++){
                System.out.println();
                System.out.print("  \"  \"  ");
            }


        } catch ( Exception e) {
            return;
        }

    }




}
